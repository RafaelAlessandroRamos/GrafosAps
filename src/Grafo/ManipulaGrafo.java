/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

import java.util.List;

/**
 *
 * @author Jennifer && Rafael
 *
 */
public class ManipulaGrafo {

    List<String> lista;
    int ordem;
    int qtd_rotulos;
    final int QTD_GRAFOS_ARQUIVO = 10;//constante
    //lista com os todos os 10 grafos de um arquivo;
    GrafoMatrizAdjacencia[] listaGrafosArquivo = new GrafoMatrizAdjacencia[QTD_GRAFOS_ARQUIVO];
    int iterador = 0; // iterador da lista de grafos

    public ManipulaGrafo(List<String> l) {
        this.lista = l;
//        passaParaMatriz();
        passaParaGrafo();

    }

    private void passaParaMatriz() {

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

    private void passaParaGrafo() {
        String[] auxLinha;
        auxLinha = lista.get(0).split(" "); // vetor com elementos da linha

        this.ordem = Integer.parseInt(auxLinha[0]);
        this.qtd_rotulos = Integer.parseInt(auxLinha[1]);

        lista.remove(0); // remove a linha que contem a ordem e o rotulo

        GrafoMatrizAdjacencia grafo = new GrafoMatrizAdjacencia(ordem, qtd_rotulos); // inicializa o grafo

        int linha = this.ordem - 1; // tamanho que deve ser a linha na matriz (de 0 a ordem-1)
        for (int i = 0; i < lista.size(); i++) { //para cada linha do arquivo

            if (lista.get(i).equals("")) {// se for a linha vazia que separa os grafos

                linha = this.ordem - 1; // tamanho que deve ser a linha na matriz (de 0 a ordem-1)

                listaGrafosArquivo[iterador++] = grafo; //adiciona o grafo na lista de grafos do arquivo

                grafo = new GrafoMatrizAdjacencia(ordem, qtd_rotulos); // inicializa o próximo grafo grafo

            } else {
                auxLinha = lista.get(i).split(" "); //vetor com os elementos da linha

                for (int coluna = 0; coluna < auxLinha.length; coluna++) { // dentro de cada linha
                    //le o arquivo na ordem certa e coloca na posicao invertida da matriz do grafo(porque tá de ponta cabeça e tals)
                    grafo.adicionaAresta(linha, coluna, auxLinha[coluna]);
                    grafo.adicionaAresta(coluna, linha, auxLinha[coluna]);
                }
            }
            linha--;
        }
    }

    public void imprimeGrafos() {
        for (int i = 0; i < QTD_GRAFOS_ARQUIVO; i++) {
            listaGrafosArquivo[i].imprimeGrafo();
            System.out.println("");
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
