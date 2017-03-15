package leitura;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {
    public LinkedList<Cliente> leCsvClientes() throws IOException {
        String[] keys;
        String linha;
        String[] lstDadosCliente;
        Cliente cliente;
        BufferedReader reader = null;
        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();
        String current = new java.io.File( "." ).getCanonicalPath();
        File inputFile = new File(current + "/src/arquivo.csv");

        try {
            reader = new BufferedReader(new FileReader(inputFile));
            // Primeira linha contém as colunas que são as chaves
            linha = reader.readLine();
            keys = linha.split(";");
            // Lendo os clientes do arquivo
            linha = reader.readLine();
            while (linha != null) {
                lstDadosCliente = linha.split(";");
                cliente = new Cliente();
                // id;cliente;email;data_nascimento;telefone;total_compras
                cliente.setId(lstDadosCliente[0]);
                cliente.setNome(lstDadosCliente[1]);
                cliente.setEmail(lstDadosCliente[2]);
                cliente.setDataNascimento(lstDadosCliente[3]);
                cliente.setTelefone(lstDadosCliente[4]);
                cliente.setTotalCompras(Double.parseDouble(lstDadosCliente[5]));
                
                clientes.add(cliente);
                
                linha = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro de I/O");
            e.printStackTrace();
        } finally {
            if (reader != null) try {
                reader.close();
            } catch (IOException ex) {
                System.out.println("Arquivo não encontrado: " + ex);
            }
        }

        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.

        return clientes;
    }
}
