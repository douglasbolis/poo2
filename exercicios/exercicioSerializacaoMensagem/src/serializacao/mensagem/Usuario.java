package serializacao.mensagem;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author douglas
 */
public class Usuario implements Serializable {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<Mensagem> msgEnviadas;
    private ArrayList<Mensagem> msgRecebidas;

    public Usuario() {
        this.msgEnviadas = new ArrayList<Mensagem>();
        this.msgRecebidas = new ArrayList<Mensagem>();
    }

    private static String tratarFilename(String filename) {
        return filename.trim().replace("/", "");
    }

    public static void salvarSerializado(Usuario usuario, String filename){
        String _filename = Usuario.tratarFilename(filename);
        
        try {
            String current = new java.io.File(".").getCanonicalPath();
            FileOutputStream fileSerializado = new FileOutputStream(current + "/" + _filename);
            ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);
            
            outputSerializado.writeObject(usuario);
            
            System.out.println("Usuario Salvo");
            System.out.println("Arquivo gerado em: " + current + "/" + _filename);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Usuario lerSerializado(String filename) {
        String _filename = Usuario.tratarFilename(filename);
        Usuario usuario = null;
        
        try {
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + "/" + _filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            usuario = (Usuario) in.readObject();
                    
            System.out.println("Deserializando Usuario...");
            System.out.println("Nome: " + (usuario != null ? usuario.getNome() : null));
            System.out.println("Email: " + (usuario != null ? usuario.getEmail() : null));
            System.out.println("Senha: " + (usuario != null ? usuario.getSenha() : null));

            if (usuario.mensagensEnviadas().size() > 0) {
                System.out.println("Mensagens enviadas: ");
                usuario.msgEnviadas.forEach((msg) -> System.out.println(msg.getTexto()));
            }

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuario;
    }

    public void enviarMensagem(Mensagem msg) {
        this.msgEnviadas.add(msg);
    }

    public ArrayList<Mensagem> mensagensRecebidas() {
        return this.msgRecebidas;
    }

    public ArrayList<Mensagem> mensagensEnviadas() {
        return this.msgEnviadas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
