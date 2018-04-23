import example.hibernate.model.Veiculo;
import example.hibernate.model.Usuario;
import example.hibernate.persistencia.VeiculoDAO;
import example.hibernate.persistencia.UsuarioDAO;
import example.hibernate.persistencia.VeiculoDAOImpl;
import example.hibernate.persistencia.UsuarioDAOImpl;
import java.util.List;

public class Main {
  public static void main(String[] args) throws Exception {
    VeiculoDAO veiculoDAO = new VeiculoDAOImpl();
    UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
    Veiculo veiculo = new Veiculo();
    Usuario usuario = new Usuario();

    // Inserindo dados do veículo
    veiculo.setAno("2010");
    veiculo.setMarca("Fiat");
    veiculo.setModelo("Uno");
    veiculo.setQuilometragem("1000");
    veiculo.setTipo("carro");

    List lista = veiculoDAO.buscaVeiculosApartirDoAno(2009);

    veiculoDAO.inserir(veiculo);
    List<Veiculo> listar = veiculoDAO.listar(Veiculo.class);
    for(Veiculo printVeiculo : listar){
      System.out.println(printVeiculo.toString());
    }

    veiculoDAO.deletar(veiculo);
    listar = veiculoDAO.listar(Veiculo.class);
    for(Veiculo printVeiculo : listar){
      System.out.println(printVeiculo.toString());
    }
    
    // Inserindo dados do usuário
    usuario.setNome( "douglas" );
    usuario.setEmail( "douglas@email.com" );
    usuario.setLogin( "douglas" );
    usuario.setSenha( "asd123" );
    
    usuarioDAO.inserir( usuario );
    Usuario buscaUsuario = usuarioDAO.buscaUsuarioPorNomeESenha( usuario.getNome(), usuario.getSenha() );
    System.out.println( "Usuário encontrado:\nnome: " + buscaUsuario.getNome() + "\nemail: " + buscaUsuario.getEmail() );
  }
}
