/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formiga;

import Grafo.Vertice;
import java.util.List;

/**
 *
 * @author Jennifer && Rafael
 */
public class CaminhoFormiga {
    
    private int ordem;
    private int feromonioInicial;
    private int[][]matrizCaminho;
    private List<Vertice> listaVerticesCaminho;
    private List<String> listaRotulos; // rotulos presentes no caminho
    private int qtdRotulosCaminho;

    public CaminhoFormiga(int ordem, int feromonioInicial) {
        this.ordem = ordem;
        this.feromonioInicial = feromonioInicial;
        qtdRotulosCaminho = 0;
        iniciaMatriz();
    }
    private void iniciaMatriz(){
        matrizCaminho = new int[this.ordem][this.ordem];
        for (int i = 0; i < this.ordem; i++) {
            for (int j = 0; j < this.ordem; j++) {
                matrizCaminho[i][j] = this.feromonioInicial;
            }
        }
    }
    
    public void adicionaVerticeCaminho(Vertice vertice){
        listaVerticesCaminho.add(vertice);
        qtdRotulosCaminho ++;
        adicionaRotulo(vertice);
    }
    
    private void adicionaRotulo(Vertice v){
        if(!listaRotulos.contains(v.getRotulo())){
            listaRotulos.add(v.getRotulo());
        }
    }

    public List<Vertice> getListaVerticesCaminho() {
        return listaVerticesCaminho;
    }

    public List<String> getListaRotulos() {
        return listaRotulos;
    }

    public int getQtdRotulosCaminho() {
        return qtdRotulosCaminho;
    }
    
    
    
}
