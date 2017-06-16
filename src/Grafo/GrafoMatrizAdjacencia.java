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

    private int ordem;
    private int rotulo;
    private Vertice grafo[][];

    
    public GrafoMatrizAdjacencia(int ordem, int rotulo) {
        this.ordem = ordem;
        this.rotulo = rotulo;
        iniciaMatriz();
    }

    private void iniciaMatriz() {
        this.grafo = new Vertice[this.ordem][this.ordem];
        for (int i = 0; i < this.ordem; i++) {
            for (int j = 0; j < this.ordem; j++) {
                Vertice vertice = new Vertice(this.rotulo + "");
                this.grafo[i][j] = vertice;
            }
        }
    }

    public void adicionaAresta(int x, int y, String r) {
        if (x < this.ordem && y < this.ordem) {
            Vertice vertice = new Vertice(r);
            this.grafo[x][y] = vertice;
        } else {
            System.out.println("A aresta solicitada (" + x + ", " + y + ") não pode pertencer ao grafo");
        }

    }

    public void removeAresta(int x, int y) {
        if (x < this.ordem && y < this.ordem) {
            Vertice vertice = new Vertice(this.ordem + "");
            this.grafo[x][y] = vertice;
        } else {
            System.out.println("A aresta solicitada (" + x + ", " + y + ") não pertence ao grafo");
        }

    }

    public void imprimeGrafo() {
        for (int i = 0; i < this.ordem; i++) {
            for (int j = 0; j < this.ordem; j++) {
                System.out.print(this.grafo[i][j].getRotulo() + " ");
            }
            System.out.print("\n");
        }
    }

}
