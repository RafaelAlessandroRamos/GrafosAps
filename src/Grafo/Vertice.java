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
public class Vertice {

    private String rotulo;
    private Vertice pai;
    private int x;
    private int y;

    public Vertice() {
    }

    public Vertice(String r, int x, int y) {
        this.rotulo = r;
        this.x = x;
        this.y = y;
    }

    public Vertice(String r, int x, int y, Vertice pai) {
        this.rotulo = r;
        this.x = x;
        this.y = y;
        this.pai = pai;
    }

    public String getRotulo() {
        return rotulo;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Vertice getPai() {
        return pai;
    }

    public void setPai(Vertice pai) {
        this.pai = pai;
    }
    
    

    
}
