/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1_ed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author DiogoSouza
 */
public class CompactaDescompacta {

    public static void compartar(String arquivoEntrada, String arquivoSaida) {
        String linha = null;
        ListaEncadeada lista = new ListaEncadeada();

        try {
            FileReader fileReader = new FileReader(arquivoEntrada);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(arquivoSaida);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // loop por cada linha do arquivo
            while (!(linha = bufferedReader.readLine()).equals("0")) {
                String[] palavra = linha.split(" ");
                for (int i = 0; i < palavra.length; i++) {
                    int verificador = lista.buscarElemento(palavra[i]);
                    if (verificador == 0) {
                        lista.insereInicio(palavra[i]);
                        bufferedWriter.write(palavra[i] + " ");
                    } else {
                        bufferedWriter.write(verificador + " ");
                        lista.excluirParaMover(verificador);
                        lista.insereInicio(palavra[i]);
                    }
                }
                bufferedWriter.newLine();
            }

            // feche o arquivo
            bufferedReader.close();
            bufferedWriter.write("0");
            bufferedWriter.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente!");
        } catch (IOException ex) {
            System.out.println("Erro lendo o arquivo!");
        }

    }

    public static void descompactar(String arquivoSaida, String arquivoDescompactado) {
        String linha = null;
        ListaEncadeada lista = new ListaEncadeada();

        try {
            FileReader fileReader = new FileReader(arquivoSaida);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(arquivoDescompactado);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            while (!(linha = bufferedReader.readLine()).equals("0")) {
                String[] palavra = linha.split(" ");
                for (int i = 0; i < palavra.length; i++) {
                    if (!digito(palavra[i])) {
                        int verificador = lista.buscarElemento(palavra[i]);
                        if (verificador == 0) {
                            lista.insereInicio(palavra[i]);
                            bufferedWriter.write(palavra[i] + " ");
                        }
                    } else {
                        String temp = lista.buscarPalavra(Integer.parseInt(palavra[i]));
                        bufferedWriter.write(temp + " ");
                        lista.excluirParaMover(Integer.parseInt(palavra[i]));
                        lista.insereInicio(temp);
                    }
                }
                bufferedWriter.newLine();
            }

            // feche o arquivo
            bufferedReader.close();
            bufferedWriter.write("0");
            bufferedWriter.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente!");
        } catch (IOException ex) {
            System.out.println("Erro lendo o arquivo!");
        }

    }

    //metodo para verificar se a String passada é um número
    public static boolean digito(String palavra) {
        return palavra.matches("[0-9]*");
    }
}
