package fabrica;

/**
 *
 * @author douglas
 */
public class FabricaVivo extends FabricaAbstrataEnvios {
    @Override
    public  ICobranca criaCobranca() {
        return new CobrancaVivo();
    }

    @Override
    public IEnvioSMS criaEnvioSMS() {
        return new EnvioSMSVivo();
    }
}
