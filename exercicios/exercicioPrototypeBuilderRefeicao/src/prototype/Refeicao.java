package prototype;

import java.io.Serializable;

/**
 *
 * @author douglas
 */
public class Refeicao implements Cloneable, Serializable {
    private Hamburger hamburger;
    private Bebida bebida;
    private Batata batata;

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Batata getBatata() {
        return batata;
    }

    public void setBatata(Batata batata) {
        this.batata = batata;
    }

    public Object clone() {
        Refeicao obj = null;
        try {
            obj = (Refeicao)super.clone();
            obj.setBebida((Bebida) bebida.clone());
            obj.setHamburger((Hamburger) hamburger.clone());
            if (getBatata() != null) {
                obj.setBatata((Batata) batata.clone());
            }
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return obj;
    }
}
