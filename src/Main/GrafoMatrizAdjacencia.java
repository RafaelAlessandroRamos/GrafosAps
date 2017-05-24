/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author jennifer
 */
public class GrafoMatrizAdjacencia {
    private int ordemInicial;
    private Vertice[] listaVertices;
    private int matriz[][];
    

    public GrafoMatrizAdjacencia(int ordem, Vertice[] v) {
        this.ordemInicial = ordem;
        listaVertices = v;
        iniciaMatriz();
    }
    
    private void iniciaMatriz(){
        this.matriz = new int[ordemInicial][ordemInicial];
        for (int i = 0; i < ordemInicial; i++) {
            for (int j = 0; j < ordemInicial; j++) {
                matriz[i][j] = ordemInicial;
            }
        }
    }
    
    public void adicionaAresta(int x, int y){
        if(x < ordemInicial && y < ordemInicial){
            matriz[x][y] = 1;
        }else{
            System.out.println("A aresta solicitada ("+x+", "+y+") não pode pertencer ao grafo");
        }
        
    }
    
     public void removeAresta(int x, int y){
        if(x < ordemInicial && y < ordemInicial){
            matriz[x][y] = 0;
        }else{
            System.out.println("A aresta solicitada ("+x+", "+y+") não pertence ao grafo");
        }
        
    }
    
    public void imprimeMatriz(){
        for (int i = 0; i < ordemInicial; i++) {
            for (int j = 0; j < ordemInicial; j++) {
                System.out.print(matriz[i][j]+"   ");
            }
            System.out.print("\n");
        }
    }
    
    
}
