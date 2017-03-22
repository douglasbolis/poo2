package prototype;

import java.io.Serializable;

/**
 *
 * @author douglas
 */
public class Batata implements Cloneable, Serializable {
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
