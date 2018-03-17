package game.observer;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class FabricaDeNotificacoes {
	String filePath;
	public FabricaDeNotificacoes() {
		try {
			File file = new File( "." );
			filePath = file.getCanonicalPath();
		} catch ( IOException ex ) {
			Logger.getLogger( FabricaDeNotificacoes.class.getName() ).log( Level.SEVERE, null, ex );
		}
	}

	public Image criarImagensNotificacao( String tipo ) {
		Image image = null;
		switch ( tipo ) {
			case "gameover":
				try {
					image = new Image( this.filePath + "/src/main/java/gameover.png" );
				} catch ( SlickException ex ) {
					Logger.getLogger( FabricaDeNotificacoes.class.getName() ).log( Level.SEVERE, null, ex );
				}
				break;
			case "ganhou":
				try {
					image = new Image( this.filePath + "/src/main/java/ganhou.png" );
				} catch ( SlickException ex ) {
					Logger.getLogger( FabricaDeNotificacoes.class.getName() ).log( Level.SEVERE, null, ex );
				}
				break;
			default:
				System.out.println( "Imagem não encontrada!" );
		}
		return image;
	}
}
