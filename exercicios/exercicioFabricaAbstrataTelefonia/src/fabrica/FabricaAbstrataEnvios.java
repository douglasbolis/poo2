package fabrica;

/**
 *
 * @author douglas
 */
public abstract class FabricaAbstrataEnvios {        
    public abstract ICobranca criaCobranca();
    public abstract IEnvioSMS criaEnvioSMS();
}
