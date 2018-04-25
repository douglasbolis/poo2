/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.numerotelefone;

/**
 *
 * @author douglas
 */
public class Main {
  public static void main ( String[] args ) {
    System.out.println( "Números de telefones singleton:" );

    System.out.println( "Telefone 1: " + TelefoneSingleton.getNumero() );
    System.out.println( "Telefone 2: " + TelefoneSingleton.getNumero() );
    System.out.println( "Telefone 3: " + TelefoneSingleton.getNumero() );
    System.out.println( "Telefone 4: " + TelefoneSingleton.getNumero() );
    System.out.println( "Telefone 5: " + TelefoneSingleton.getNumero() );
    System.out.println( "Telefone 6: " + TelefoneSingleton.getNumero() );
    System.out.println( "Telefone 7: " + TelefoneSingleton.getNumero() );
    System.out.println( "Telefone 8: " + TelefoneSingleton.getNumero() );
  }
}
