/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.pattern;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author felipe
 */
public class Salvar extends JButton implements Command {

  public javax.swing.JTextField text;

  public Salvar ( javax.swing.JTextField text ) {
    this.text = text;
  }

  public void salvar () {
    String current;
    try {
      current = new java.io.File( "." ).getCanonicalPath();
      try ( PrintWriter writer = new PrintWriter( current + "\\src\\arquivo.txt", "UTF-8" ) ) {
        writer.println( text.getText() );
      }
    } catch ( IOException ex ) {
      Logger.getLogger( Salvar.class.getName() ).log( Level.SEVERE, null, ex );
    }
  }

  @Override
  public void execute () {
    this.salvar();
  }

}
