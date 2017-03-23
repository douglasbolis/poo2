package serializacao.mensagem;

/**
 *
 * @author douglas
 */
public class Main {
    public static void main(String[] args) {
        String filename = "user.md";
        Usuario user = null;
        Mensagem msg = null;

        System.out.println("\nUsuário");
        user = new Usuario();
        user.setNome("João");
        user.setEmail("joao@local.com");
        user.setSenha("asd123");
        
        msg = new Mensagem();
        msg.setTexto("Bem vindo, " + user.getNome() +"!");
        user.enviarMensagem(msg);
        
        Usuario.salvarSerializado(user, filename);
        Usuario.lerSerializado(filename);

        System.out.println("\nMensagem");
        filename = "message.md";
        Mensagem mensagem = new Mensagem();
        mensagem.setTexto("Mensagem serializada!");
        Mensagem.salvarSerializado(mensagem, filename);
        Mensagem.lerSerializado(filename);
    }
}
