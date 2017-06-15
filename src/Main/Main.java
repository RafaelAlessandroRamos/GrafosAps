/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        criaGrafo();
        m();
    }

    static void criaGrafo() {

        /**
         * Abre o arquivo *
         */
        ManipulaArquivo ma = new ManipulaArquivo();
        List<String> lista = ma.abrirArquivo("/home/jennifer/Documents/UTFPR/5º Período/Teoria dos Grafos/GrafosAps/src/instancias/GROUP_1/HDGraph20_20.txt");
        System.out.println("size: " + lista.size());
        lista.toString();

        trasformaEmListaVertice(lista);

    }

    static void trasformaEmListaVertice(List<String> lista) {
        int tam = lista.size();

        lista.remove(0);

        for (String linha : lista) {
            System.out.println(linha);
            break;
        }
    }

    static void m() {
        String[] auxLinha, auxRotulos;
        String grafoTemp = "";
        int[] refMatrizesArq = new int[10];
        int[][] auxMatriz;
        int ordem, qtd_rotulos, i = 0, contRef = 0;

        ManipulaArquivo ma = new ManipulaArquivo();
        List<String> lista = ma.abrirArquivo("/home/jennifer/Documents/UTFPR/5º Período/Teoria dos Grafos/GrafosAps/src/instancias/GROUP_1/HDGraph20_20.txt");

        auxLinha = lista.get(i++).split(" ");

        ordem = Integer.parseInt(auxLinha[0]);
        System.out.println("ordem: " + ordem);
        qtd_rotulos = Integer.parseInt(auxLinha[1]);
        System.out.println("qtd_rotulos: " + qtd_rotulos);

        lista.remove(0);

        auxMatriz = new int[ordem][ordem];
        //GrafoMatrizAdjacencia matriz = new GrafoMatrizAdjacencia(ordem, aux);
        for (int j = 0; j < lista.size(); j++) { //todas as linhas do arquivo

            int linha = ordem - 1;

            if (lista.get(j).equals("")) {
//               imprimeMatriz(auxMatriz, ordem);
                for (int k = 0; k < ordem; k++) {
                    auxMatriz[linha][k] = ordem;
                    System.out.print(auxMatriz[linha][k] + " ");
                }

                System.out.println("");
                auxMatriz = new int[ordem][ordem];

            } else {
                auxLinha = lista.get(j).split(" ");

                for (int coluna = 0; coluna < ordem; coluna++) { // dentro de cada linha
                    //le o arquivo na ordem certa e coloca na posicao invertida da matriz (porque tá de ponta cabeça e tals)
                    if (coluna < auxLinha.length) {
                        auxMatriz[linha][coluna] = Integer.parseInt(auxLinha[coluna]);
                    } else {
                        auxMatriz[linha][coluna] = ordem;
                    }

                    System.out.print(auxMatriz[linha][coluna] + " ");
                }
                System.out.println("");
                linha--;
            }
        }
    }

    static void imprimeMatriz(int matriz[][], int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
            }
            System.out.println("");
        }
    }
}
