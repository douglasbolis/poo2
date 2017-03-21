package fabrica;

public class FabricaFormato {
    public static IFormato geraFormato(String classe) {
        IFormato formato;
        Object classeReflection = null;

	try {
            classeReflection = Class.forName(classe).newInstance();            
        }
        catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
	    e.printStackTrace();
	}        
        formato = (IFormato) classeReflection;
        return formato;
    }
}
