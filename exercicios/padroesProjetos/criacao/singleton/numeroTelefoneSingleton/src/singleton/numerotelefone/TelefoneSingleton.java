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
public class TelefoneSingleton {
  private static Integer numeroTelefone;
  private static TelefoneSingleton instance;

  private TelefoneSingleton () {
    numeroTelefone = 999990100;
  }

  public static synchronized String getNumero () {
    if ( instance == null ) {
      instance = new TelefoneSingleton();
    }
    return ( ++numeroTelefone ).toString();
  }
}
