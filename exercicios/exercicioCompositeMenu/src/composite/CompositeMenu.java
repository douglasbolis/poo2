package composite;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author douglas
 */
public class CompositeMenu extends Menu {
    ArrayList< Menu > itemsMenu;

    CompositeMenu( String name ) {
        this.setName( name );
        itemsMenu = new ArrayList< Menu >();
    }

    public void addItemMenu( Menu item ) {
        this.itemsMenu.add( item );
    }

    public void showItemsMenu( int lvl ) {
        String spacing = getSpacing( lvl, 2, " * " );
        System.out.println( spacing + this.getName() );

        for( Menu item:itemsMenu ) {
            if ( item instanceof CompositeMenu ) {
                ( ( CompositeMenu ) item ).showItemsMenu( lvl + 1 );
            } else {
                System.out.println( getSpacing( lvl, 4, " - " ) + item.getName() );
            }
        }
    }
    
    private String getSpacing( int lvl, int qtdSpace, String pont ) {
        return String.join( "", Collections.nCopies( lvl * qtdSpace, " " ) ) + pont;
    }
}
