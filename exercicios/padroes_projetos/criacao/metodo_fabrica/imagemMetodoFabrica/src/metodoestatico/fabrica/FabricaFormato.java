package metodoestatico.fabrica;

public class FabricaFormato {
	public static IFormato gerarFormato ( String formato ) {
		IFormato imagem = null;

		if ( formato.equalsIgnoreCase( "bmp" ) ) {
			imagem = new FormatoBmp();
		} else
		if ( formato.equalsIgnoreCase( "gif" ) ) {
			imagem = new FormatoGif();
		} else
		if ( formato.equalsIgnoreCase( "jpeg" ) ) {
			imagem = new FormatoJpeg();
		} else
		if ( formato.equalsIgnoreCase( "png" ) ) {
			imagem = new FormatoPng();
		}

		return imagem;
	}
}
