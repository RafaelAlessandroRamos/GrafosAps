/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.List;

/**
 *
 * @author jennifer
 */
public class ManipulaMatriz {

    List<String> lista;
    int ordem, qtd_rotulos;

    public ManipulaMatriz(List<String> l) {
        this.lista = l;
        passaParaMatriz(lista);

    }

    private void passaParaMatriz(List<String> lista) {

        String[] auxLinha;
        auxLinha = lista.get(0).split(" "); // vetor com elementos da linha

        this.ordem = Integer.parseInt(auxLinha[0]);
        this.qtd_rotulos = Integer.parseInt(auxLinha[1]);

        lista.remove(0); // remove a linha que contem a ordem e o rotulo

        int[][] auxMatriz; // matriz temporaria para guardar cada grafo
        auxMatriz = new int[this.ordem][this.ordem]; //inicializada com a ordem

        int linha = this.ordem - 1; // tamanho que deve ser a linha na matriz (de 0 a ordem-1)
        for (int i = 0; i < lista.size(); i++) { //para cada linha do arquivo

            if (lista.get(i).equals("")) {// se for a linha vazia que separa os grafos

                for (int k = 0; k < this.ordem; k++) { // coloca a ultima linha com o valor da ordem
                    auxMatriz[linha][k] = this.ordem;
                }
                linha = this.ordem - 1; // tamanho que deve ser a linha na matriz (de 0 a ordem-1)

                imprimeMatriz(auxMatriz, this.ordem);
                
                
                
                
                auxMatriz = new int[this.ordem][this.ordem]; // inicializa a próxima matriz

            } else {
                auxLinha = lista.get(i).split(" "); //vetor com os elementos da linha

                for (int coluna = 0; coluna < this.ordem; coluna++) { // dentro de cada linha
                    //le o arquivo na ordem certa e coloca na posicao invertida da matriz (porque tá de ponta cabeça e tals)
                    if (coluna < auxLinha.length) {
                        auxMatriz[linha][coluna] = Integer.parseInt(auxLinha[coluna]);
                    } else {
                        auxMatriz[linha][coluna] = this.ordem;
                    }
                }
                linha--;
            }
        }

    }

    private void imprimeMatriz(int[][] m, int o) {
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < o; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }

    public int getOrdem() {
        return ordem;
    }

    public int getQtd_rotulos() {
        return qtd_rotulos;
    }

}
