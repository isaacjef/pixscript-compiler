package ifgoiano;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Analisador {
    
    public void analisador_lexico() {
        //Path dir = System.get
        String caminho = "resources/";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha); // Imprime cada linha
            }
        } catch (IOException e) {
            e.printStackTrace(); // Trata erros de leitura
        }
    }
}
