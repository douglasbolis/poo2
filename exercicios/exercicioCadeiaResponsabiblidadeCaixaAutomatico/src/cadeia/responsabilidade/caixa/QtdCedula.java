package cadeia.responsabilidade.caixa;

/**
 *
 * @author douglas
 */
public class QtdCedula {
    Integer cedula;
    Integer qtd;
    
    public QtdCedula( Integer cedula, Integer qtd ) {
        this.setCedula( cedula );
        this.setQtd( qtd );
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula( Integer cedula ) {
        this.cedula = cedula;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd( Integer qtd ) {
        this.qtd = qtd;
    }
}
