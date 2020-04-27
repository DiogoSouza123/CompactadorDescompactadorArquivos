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
        /*ListaEncadeada lista = new ListaEncadeada();
        lista.insereInicio("Dear");
        lista.insereInicio("Sally,");
        lista.insereInicio("Please,");
        lista.insereInicio("please");
        lista.insereInicio("do");
        lista.insereInicio("it");
        System.out.println(lista);
        lista.excluirParaMover(6);
        System.out.println(lista);
        lista.insereInicio("Dear");
        System.out.println(lista);
        */
    }
    
}
