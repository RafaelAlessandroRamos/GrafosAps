/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formiga;

import Grafo.Vertice;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Observer;
import java.util.Vector;

/**
 *
 * @author Jennifer && Rafael
 */
public class Formiga {

    private int idFormiga = 0;
    private CaminhoFormiga caminhoFormiga; // lista dos vertices que a formiga passou

    public Formiga(int idFormiga) {
        this.idFormiga = idFormiga;
    }

    public int getIdFormiga() {
        return idFormiga;
    }

    public void adicionaVerticeCaminho(Vertice vertice) {
        caminhoFormiga.adicionaVerticeCaminho(vertice);
    }

    public CaminhoFormiga getCaminhoFormiga() {
        return caminhoFormiga;
    }

}
