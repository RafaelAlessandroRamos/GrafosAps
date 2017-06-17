/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formiga;

import Grafo.GrafoMatrizAdjacencia;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Jennifer && Rafael
 */
public class ColoniaFormigas {

    private List<Formiga> listaFormigas;
    GrafoMatrizAdjacencia grafo;

    private Random random;
    private int numFormigas; //number of ants
    private double feromonioInicial ; //initial feromone
    

    public ColoniaFormigas(int numFormigas, double feromonioInicial) {
        this.numFormigas = numFormigas;
        this.feromonioInicial = feromonioInicial;
        
    }

    public ColoniaFormigas(GrafoMatrizAdjacencia grafo, int numFormigas, Random random) {
        this.grafo = grafo;
        this.numFormigas = numFormigas;
        this.random = random;
    }

    public void init(double feromonio) {
        this.feromonioInicial = feromonio;
        if (this.feromonioInicial <= 0) {
            this.feromonioInicial = 1;
        }
        
        
    }

}
