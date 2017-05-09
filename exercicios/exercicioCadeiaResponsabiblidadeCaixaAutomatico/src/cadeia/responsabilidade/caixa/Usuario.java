package cadeia.responsabilidade.caixa;

import java.util.ArrayList;

/**
 *
 * @author douglas
 */
public class Usuario implements InterfaceAtm {
    private String name;
    private Integer money;
    private Atm atm;
    
    public Usuario( String name ) {
        this.setName( name );
        this.setAtm( new Atm() );
    }
    
    public ArrayList< Integer > executarSaque( Integer numero ) {
        return atm.executarSaque( numero );
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney( Integer money ) {
        this.money = money;
    }

    public Atm getAtm() {
        return atm;
    }

    public void setAtm( Atm atm ) {
        this.atm = atm;
    }
}
