package composite;

/**
 *
 * @author douglas
 */
public class Main {
    public static void main( String[] args ) {
        System.out.println( "Exercício Composite Menu\n" );

        // Menu principal
        CompositeMenu menu = new CompositeMenu( "Menu" );

        // Menu arquivo
        CompositeMenu menuArquivo = new CompositeMenu( "Arquivo" );
        SimpleMenu novoProjeto = new SimpleMenu( "Novo Projeto" );
        SimpleMenu abrirProjeto = new SimpleMenu( "Abrir projeto" );

        // Item de menu projetos recentes
        CompositeMenu abrirProjetoRecente = new CompositeMenu( "Abrir projeto recente" );
        SimpleMenu projeto1 = new SimpleMenu( "Projeto 1" );
        SimpleMenu projeto2 = new SimpleMenu( "Projeto 2" );
        abrirProjetoRecente.addItemMenu( projeto1 );
        abrirProjetoRecente.addItemMenu( projeto2 );

        menuArquivo.addItemMenu( novoProjeto );
        menuArquivo.addItemMenu( abrirProjeto );
        menuArquivo.addItemMenu( abrirProjetoRecente );

        menu.addItemMenu( menuArquivo );
        menu.showItemsMenu( 0 );
    }
}
