package prototype;

import java.io.Serializable;

/**
 *
 * @author douglas
 */
public class  Bebida  implements Cloneable, Serializable {
    private String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Object clone() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return obj;
    }
}
