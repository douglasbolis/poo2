package fabrica;

public class MetodoFabrica {
	public static void main( String[] args ) {
		IFormato formato = null;

		formato = FabricaFormato.gerarFormato( "bmp" );
		formato.gerar();

		formato = FabricaFormato.gerarFormato( "gif" );
		formato.gerar();

		formato = FabricaFormato.gerarFormato( "jpeg" );
		formato.gerar();

		formato = FabricaFormato.gerarFormato( "png" );
		formato.gerar();
	}    
}
