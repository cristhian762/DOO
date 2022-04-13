
package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "\\src\\arquivo.csv");                
        FileReader in = new FileReader(inputFile);       
        BufferedReader stdin = new BufferedReader(in);
        
        String line = stdin.readLine();
        
        while((line = stdin.readLine()) != null){
            Cliente cliente = new Cliente();

            cliente.setId(line.split(";")[0]);
            cliente.setNome(line.split(";")[1]);
            cliente.setEmail(line.split(";")[2]);
            cliente.setTelefone(line.split(";")[4]);
            cliente.setTotalCompras(Double.parseDouble(line.split(";")[5]));

            clientes.add(cliente);
        }
        
        in.close();

        return clientes;
     }
}
