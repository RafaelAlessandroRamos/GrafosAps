/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ACO.AntColonyOptimization;
import Formiga.ColoniaFormigas;
import ACO.DefinicoesACO;
import Formiga.Formiga;
import Grafo.ManipulaGrafo;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jennifer && Rafael
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String caminho = "/home/jennifer/Documents/UTFPR/5º Período/Teoria dos Grafos/GrafosAps/src/instancias/GROUP_1/HDGraph20_20.txt";
//        String caminho = "/home/jennifer/Documents/UTFPR/5º Período/Teoria dos Grafos/APS.Teoria.dos.Grafos.2017.1/instancias/Group 2 with n=50/MDGraph50_62.txt";

        //Abre o arquivo
        ManipulaArquivo ma = new ManipulaArquivo();
        List<String> lista = ma.abrirArquivo(caminho);

        ManipulaGrafo manipulaGrafo = new ManipulaGrafo(lista);
        //manipulaGrafo.imprimeGrafos();

        int seed = 0;
        Random random = new Random(seed); //gerador de numeros aleatorios

        DefinicoesACO def = new DefinicoesACO();

        int numVertices = manipulaGrafo.getOrdem();
        int numIteracoes = 200;
        int numFormigas = 30; //number of ants
        double feromonioInicial = 0; //initial feromone

        def.setProbabilidadeExploracao(0.2);//exploitaion probability
        def.setPesoDistanciaInversa(1);//inverse distance weight
        def.setFracaoEvaporacao(0.1);//evaporation fraction
        def.setExpoenteMarcacaoTrilha(1);//trail laying exponent
        def.setAprimoramentoDeElite(0.1);//elite enhancement
        def.setExploit(0.0);//prob. for exploiting best edge 
        def.setAlpha(1.0);//weighting exponents for 
        def.setBeta(1.0);//distance versus trail 

        AntColonyOptimization aco = new AntColonyOptimization();
        ColoniaFormigas coloniaFormigas = new ColoniaFormigas(numFormigas, feromonioInicial);

        aco.initAnts(numFormigas, def.getFracaoEvaporacao(), random);

        //rodarOtimizacao();
    }
}
