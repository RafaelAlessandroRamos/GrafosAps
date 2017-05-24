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
        List<String> lista = ma.abrirArquivo("C:\\Users\\Rafael\\Documents\\UTFPR\\5º Periodo\\Teoria dos Grafos\\APS.Teoria.dos.Grafos.2017.1\\instancias\\GROUP 1\\HDGraph20_20.txt");
        System.out.println(lista.toString());
        System.out.println("");
        auxLinha = lista.get(i++).split(" ");
        lista.remove(0);

        ordem = Integer.parseInt(auxLinha[0]);
        qtd_rotulos = Integer.parseInt(auxLinha[1]);

        //GrafoMatrizAdjacencia matriz = new GrafoMatrizAdjacencia(ordem, aux);

        int a = ordem-1;
        for (String string : lista) { //todas as linhas do arquivo
            auxLinha = string.split(" ");
            auxMatriz = new int[ordem][ordem];
//            refMatrizesArq[contRef++] = auxMatriz; //FAZER
            for (int b = 0; b < ordem; b++) { // dentro de cada linha
                if (b < auxLinha.length) {
                    auxMatriz[a--][b] = Integer.parseInt(auxLinha[b]);
                } else {
                    auxMatriz[a--][b] = ordem;
                }
                System.out.println(auxLinha[b]);

            }

            System.out.println("");
        }
    }

}
