/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;

/**
 *
 * @author Jennifer && Rafael
 */
public class GrafoMatrizAdjacencia {

    private int ordemInicial;
    private Vertice grafo[][];

    
    public GrafoMatrizAdjacencia(int ordem) {
        this.ordemInicial = ordem;
        iniciaMatriz();
    }

    private void iniciaMatriz() {
        this.grafo = new Vertice[this.ordemInicial][this.ordemInicial];
        for (int i = 0; i < this.ordemInicial; i++) {
            for (int j = 0; j < this.ordemInicial; j++) {
                Vertice vertice = new Vertice(this.ordemInicial + "");
                this.grafo[i][j] = vertice;
            }
        }
    }

    public void adicionaAresta(int x, int y, String r) {
        if (x < this.ordemInicial && y < this.ordemInicial) {
            Vertice vertice = new Vertice(r);
            this.grafo[x][y] = vertice;
        } else {
            System.out.println("A aresta solicitada (" + x + ", " + y + ") não pode pertencer ao grafo");
        }

    }

    public void removeAresta(int x, int y) {
        if (x < this.ordemInicial && y < this.ordemInicial) {
            Vertice vertice = new Vertice(this.ordemInicial + "");
            this.grafo[x][y] = vertice;
        } else {
            System.out.println("A aresta solicitada (" + x + ", " + y + ") não pertence ao grafo");
        }

    }

    public void imprimeGrafo() {
        for (int i = 0; i < this.ordemInicial; i++) {
            for (int j = 0; j < this.ordemInicial; j++) {
                System.out.print(this.grafo[i][j].getRotulo() + " ");
            }
            System.out.print("\n");
        }
    }

}
