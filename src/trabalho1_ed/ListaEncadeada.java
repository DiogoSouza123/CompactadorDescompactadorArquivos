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
public class ListaEncadeada {

    private No ini;

    public ListaEncadeada() {
        this.ini = null;
    }

    public boolean vazia() {
        return ini == null;
    }

    public void insereInicio(String elemento) {
        No novo = new No(elemento, ini);
        ini = novo;
    }

    /*metodo para verificar se o elemento está na lista
     case esteja retorna a posicao dele (int) na lista
     caso não retorna 0
     */
    public int buscarElemento(String elemento) {
        No temp = ini;
        int contador = 1;

        while (temp != null) {
            if (temp.getElemento().equals(elemento)) {
                return contador;
            }
            temp = temp.getProx();
            contador++;
        }
        return 0;

    }

    //metodo para excluir No da lista para move-lo para o inicio depois
    public void excluirParaMover(int posicao) {
        int contador = 1;
        No temp = ini;
        No anterior = null;

        while (contador != posicao) {
            anterior = temp;
            temp = temp.getProx();
            contador++;
        }
        
        anterior.setProx(temp.getProx());
        
    }
    
    public String buscarPalavra(int indice){
        String palavra = "";
        No temp = ini;
        int contador = 1;
        
        while (contador < indice) {
            temp = temp.getProx();
            contador++;
        }
        
        palavra = (String)temp.getElemento();
        return palavra;
    }

    @Override
    public String toString() {
        String strLista = "";
        No temp = ini;

        while (temp != null) {
            strLista += temp.getElemento() + " ";
            temp = temp.getProx();

        }
        return strLista;
    }

}
