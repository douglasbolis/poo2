package fabrica;

public class MetodoFabrica {
    public static void main(String[] args) {
        IFormato formato;
        formato = FabricaFormato.geraFormato("fabrica.FormatoPng");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("fabrica.FormatoJpeg");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("fabrica.FormatoGif");
        formato.gera();
        
        formato = FabricaFormato.geraFormato("fabrica.FormatoBmp");
        formato.gera();
    }
}
