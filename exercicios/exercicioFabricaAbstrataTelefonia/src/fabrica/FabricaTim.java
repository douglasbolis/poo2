package fabrica;

/**
 *
 * @author douglas
 */
public class FabricaTim extends FabricaAbstrataEnvios {    
    @Override
    public IEnvioSMS criaEnvioSMS () {
        return new EnvioSMSTim("Assincrono");
    }

    @Override
    public ICobranca criaCobranca() {
        return new CobrancaTim();
    }
}

