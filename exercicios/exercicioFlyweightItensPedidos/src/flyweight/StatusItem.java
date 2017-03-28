package flyweight;

import java.util.HashMap;

/**
 *
 * @author douglas
 */
public class StatusItem {
    private HashMap< Estado, StatusItem > statusItem = new HashMap();
    public enum Estado {
        CARRINHO, FECHADO, ENVIADO, ENTREGUE, PAGO
    };
    private Estado nome;
    private boolean podeCancelar;
    private boolean compraConcluida;
    
    public StatusItem() { }
    
    public StatusItem( Estado nome, boolean podeCancelar, boolean compraConcluida ) {
        this.setNome( nome);
        this.setPodeCancelar( podeCancelar );
        this.setCompraConcluida( compraConcluida );
    }

    public Estado getNome() {
        return nome;
    }

    public void setNome( Estado nome ) {
        this.nome = nome;
    }

    public boolean getPodeCancelar() {
        return podeCancelar;
    }

    public void setPodeCancelar( boolean podeCancelar ) {
        this.podeCancelar = podeCancelar;
    }

    public boolean getCompraConcluida() {
        return compraConcluida;
    }

    public void setCompraConcluida( boolean compraConcluida ) {
        this.compraConcluida = compraConcluida;
    }

    public StatusItem getStatusItem( Estado nome ) {
        if ( !this.statusItem.containsKey(nome) ) {
            switch ( nome ) {
                case FECHADO:
                    this.statusItem.put( Estado.FECHADO, new StatusItem( Estado.FECHADO, true, false ) );
                    break;
                case PAGO:
                    this.statusItem.put( Estado.PAGO, new StatusItem( Estado.PAGO, true, true ) );
                    break;
                case ENVIADO:
                    this.statusItem.put( Estado.ENVIADO, new StatusItem( Estado.ENVIADO, false, true ) );
                    break;
                case ENTREGUE:
                    this.statusItem.put( Estado.ENTREGUE, new StatusItem( Estado.ENTREGUE, false, true ) );
                    break;
                default:
                    this.statusItem.put( Estado.CARRINHO, new StatusItem( Estado.CARRINHO, true, false ) );
                    break;
            }
        }
        return statusItem.get(nome);
    }
}
