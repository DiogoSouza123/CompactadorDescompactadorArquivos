/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1_ed;

/**
 *
 * @author DiogoSouza
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CompactaDescompacta.compartar("ArquivoEntrada.txt", "ArquivoSaida.txt");
        CompactaDescompacta.descompactar("ArquivoSaida.txt", "ArquivoDescompactado.txt");
    }
    
}
