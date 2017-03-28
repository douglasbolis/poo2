package flyweight;

import java.util.ArrayList;

/**
 *
 * @author douglas
 */
public class Pedido {
    ArrayList< ItemPedido > itens = new ArrayList();

    public void addItemPedido( ItemPedido item ) {
        itens.add( item );
    }
}
