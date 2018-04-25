package adaptercliente;

import adaptercliente.clienteexterno.AdapterClienteExterno;
import adaptercliente.visao.VisaoCliente;
import lib.ClienteExterno;

public class MainComAdapter {
  /**
   * @param args the command line arguments
   */
  public static void main ( String[] args ) {
    AdapterClienteExterno adapterClienteExterno;
    ClienteExterno clienteExterno = new ClienteExterno();
    VisaoCliente visao = new VisaoCliente();

    clienteExterno.setCelular( "9997777" );
    clienteExterno.setDddCelular( "027" );
    clienteExterno.setTelefone( "3333" );
    clienteExterno.setDddTelefone( "027" );
    clienteExterno.setEmail( "jose.silva@email.com" );
    clienteExterno.setNome( "Jose" );
    clienteExterno.setSobreNome( "Silva" );
    
    adapterClienteExterno = new AdapterClienteExterno( clienteExterno );

    visao.setInformacoesCliente( adapterClienteExterno ); // espera um Cliente
    visao.setVisible( true );
  }
}
