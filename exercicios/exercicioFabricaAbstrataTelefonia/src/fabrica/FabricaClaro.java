package fabrica;

/**
 *
 * @author douglas
 */
public class FabricaClaro extends FabricaAbstrataEnvios {
    @Override
    public  ICobranca criaCobranca() {
        return new CobrancaClaro();
    }

    @Override
    public IEnvioSMS criaEnvioSMS() {
        return new EnvioSMSClaro();
    }
}
