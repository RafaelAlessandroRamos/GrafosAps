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
        String[] auxLinha, auxRotulos;
        String grafoTemp = "";
        int[] refMatrizesArq = new int[10];
        int[][] auxMatriz;
        int ordem, qtd_rotulos, i = 0, contRef = 0;

        ManipulaArquivo ma = new ManipulaArquivo();
        List<String> lista = ma.abrirArquivo("/home/jennifer/Documents/UTFPR/5º Período/Teoria dos Grafos/GrafosAps/src/Arquivos/HDGraph20_20.txt");
        System.out.println("1");
        System.out.println(lista.toString());
        System.out.println("");
        auxLinha = lista.get(i++).split(" ");
        lista.remove(0);

        ordem = Integer.parseInt(auxLinha[0]);
        qtd_rotulos = Integer.parseInt(auxLinha[1]);

        //GrafoMatrizAdjacencia matriz = new GrafoMatrizAdjacencia(ordem, aux);
        for (String string : lista) { //todas as linhas do arquivo
            int a = ordem - 1;
            auxLinha = string.split(" ");
            auxMatriz = new int[ordem][ordem];
//            refMatrizesArq[contRef++] = auxMatriz; //FAZER
            for (int b = 0; b < ordem - 1; b++) { // dentro de cada linha
                if (b < auxLinha.length) {
                    auxMatriz[b][a--] = Integer.parseInt(auxLinha[b]);
                } else {
                    auxMatriz[b][a--] = ordem;
                }
                imprimeMatriz(auxMatriz, ordem-1, ordem-1);

            }

            System.out.println("");
        }
    }
    static void imprimeMatriz(int matriz[][], int x, int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(matriz[x][y]+" ");
            }
            System.out.println("");
        }
    }
}
