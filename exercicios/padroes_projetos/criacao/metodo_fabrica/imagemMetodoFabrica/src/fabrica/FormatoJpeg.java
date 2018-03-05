package fabrica;

public class FormatoJpeg implements IFormato {
	@Override
	public Imagem gerar() {
		System.out.println( "gera jpeg" );
		return null;
	}
}
