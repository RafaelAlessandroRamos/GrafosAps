/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;

import Formiga.ColoniaFormigas;
import Grafo.GrafoMatrizAdjacencia;
import java.util.Random;

/**
 *
 * @author Jennifer && Rafael
 */
public class AntColonyOptimization {

    private GrafoMatrizAdjacencia grafo;//tsp
    private ColoniaFormigas colonia; //antc
    private int numFormigas;

    /* Pseudocodigo
    public void ACO_MetaHeuristic() {
        while (!termination()) {
            generateSolutions();
        }
        daemonActions();
        pheromoneUpdate();
    }
     */
    public void initAnts(int evaporacao, double feromonio, Random rand) {
        /* --- initialize an ant colony */
        if (this.grafo == null) {
            return;
        }
        this.colonia = new ColoniaFormigas(this.grafo, numFormigas, rand);
        this.colonia.init(feromonio);
    }
}
