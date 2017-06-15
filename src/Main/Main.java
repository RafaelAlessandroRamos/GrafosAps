/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.List;


/**
 *
 * @author Rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String caminho = "/home/jennifer/Documents/UTFPR/5º Período/Teoria dos Grafos/GrafosAps/src/instancias/GROUP_1/HDGraph20_20.txt";
        
        //Abre o arquivo
        ManipulaArquivo ma = new ManipulaArquivo();
        List<String> lista = ma.abrirArquivo(caminho);
        
        ManipulaMatriz manipulaGrafo = new ManipulaMatriz(lista);
        
    }

    
}
