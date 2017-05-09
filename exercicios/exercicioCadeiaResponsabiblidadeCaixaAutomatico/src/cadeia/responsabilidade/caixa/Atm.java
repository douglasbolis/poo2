package cadeia.responsabilidade.caixa;

import java.util.ArrayList;

/**
 *
 * @author douglas
 */
public class Atm implements InterfaceAtm {
    private ArrayList< Integer > cedulas;
    public Atm() {
        cedulas = new ArrayList<>();
        cedulas.add(100);
        cedulas.add(50);
        cedulas.add(20);
        cedulas.add(10);
        cedulas.add(5);
        cedulas.add(2);
    }
    
    public ArrayList< QtdCedula > executarSaque( Integer numero ) {
        ArrayList< QtdCedula > listaContabilidade = new ArrayList<>();
        ArrayList< QtdCedula > listaSaque = new ArrayList<>();
        Integer parteInteira = numero / 100;
        Integer parteResto = numero % 100;
        
        // Cédula de R$ 100,00.
        /*if ( ( parteResto % 2 != 0 ) && ( parteResto < 5 ) ) {
            parteInteira--;
        }*/
        listaContabilidade.add( new QtdCedula( 100, parteInteira ) );

        // Cédula de R$ 50,00.
        parteInteira = parteResto / 50;
        parteResto = parteResto % 50;
        listaContabilidade.add( new QtdCedula( 50, parteInteira ) );

        // Cédula de R$ 20,00.
        parteInteira = parteResto / 20;
        parteResto = parteResto % 20;
        listaContabilidade.add( new QtdCedula( 20, parteInteira ) );

        // Cédula de R$ 10,00.
        parteInteira = parteResto / 10;
        parteResto = parteResto % 10;
        listaContabilidade.add( new QtdCedula( 10, parteInteira ) );

        // Cédula de R$ 5,00.
        parteInteira = parteResto / 5;
        parteResto = parteResto % 5;
        listaContabilidade.add( new QtdCedula( 5, parteInteira ) );

        // Cédula de R$ 2,00.
        parteInteira = parteResto / 2;
        parteResto = parteResto % 2;
        listaContabilidade.add( new QtdCedula( 2, parteInteira ) );

        for ( QtdCedula obj : listaContabilidade ) {
            if ( obj.getQtd() != 0 ) {
                listaSaque.add( obj );
            }
        }
        return listaSaque;
    }
}
