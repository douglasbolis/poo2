package serializacao.mensagem;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author douglas
 */
public class Mensagem implements Serializable {
    private String texto;
    private ArrayList<Mensagem> respostas;
    
    public Mensagem() {
        this.respostas = new ArrayList<Mensagem>();
    }

    private static String tratarFilename(String filename) {
        return filename.trim().replace("/", "");
    }

    public static void salvarSerializado(Mensagem msg, String filename){
        String _filename = Mensagem.tratarFilename(filename);

        try {
            String current = new java.io.File(".").getCanonicalPath();
            FileOutputStream fileSerializado = new FileOutputStream(current + "/" + _filename);
            ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);

            outputSerializado.writeObject(msg);

            System.out.println("Mensagem Salva");
            System.out.println("Arquivo gerado em: " + current + "/" + _filename);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Mensagem lerSerializado(String filename) {
        String _filename = Mensagem.tratarFilename(filename);
        Mensagem msg = null;
        
        try {
            String current = new java.io.File(".").getCanonicalPath();
            FileInputStream fileIn = new FileInputStream(current + "/" + _filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            msg = (Mensagem) in.readObject();

            System.out.println("Deserializando Mensagem...");
            System.out.println("Texto: " + (msg != null ? msg.getTexto(): null));
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return msg;
    }

    public void responder(Mensagem msg) {
        this.respostas.add(msg);
    }

    public ArrayList<Mensagem> respostas() {
        return this.respostas;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
