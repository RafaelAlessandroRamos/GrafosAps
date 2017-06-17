/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;

/**
 *
 * @author jennifer
 */
public class DefinicoesACO {

    private double probabilidadeExploracao; //exploitaion probability
    //private double pesoCaminhoFeromonio; //pheromone trail weight qtdRotulosCaminho on CaminhoFormigas
    private double pesoDistanciaInversa; //inverse distance weight
    private double fracaoEvaporacao; //evaporation fraction
    private double expoenteMarcacaoTrilha; //trail laying exponent
    private double aprimoramentoDeElite; //elite enhancement
    private double exploit; //prob. for exploiting best edge
    private double alpha; //weighting exponents for
    private double beta; //distance versus trail
    private double iteracoes = 0; //initialize the epoch counter

    public DefinicoesACO() {
    }

    public DefinicoesACO(double probabilidadeExploracao, double pesoDistanciaInversa, double fracaoEvaporacao, double expoenteMarcacaoTrilha, double aprimoramentoDeElite, double exploit, double alpha, double beta) {
        this.probabilidadeExploracao = probabilidadeExploracao;
        //this.pesoCaminhoFeromonio = pesoCaminhoFeromonio;
        this.pesoDistanciaInversa = pesoDistanciaInversa;
        this.fracaoEvaporacao = fracaoEvaporacao;
        this.expoenteMarcacaoTrilha = expoenteMarcacaoTrilha;
        this.aprimoramentoDeElite = aprimoramentoDeElite;
        this.exploit = exploit;
        this.alpha = alpha;
        this.beta = beta;
    }

    public double getProbabilidadeExploracao() {
        return probabilidadeExploracao;
    }

    public void setProbabilidadeExploracao(double probabilidadeExploracao) {
        this.probabilidadeExploracao = probabilidadeExploracao;
    }

    public double getPesoDistanciaInversa() {
        return pesoDistanciaInversa;
    }

    public void setPesoDistanciaInversa(double pesoDistanciaInversa) {
        this.pesoDistanciaInversa = pesoDistanciaInversa;
    }

    public double getFracaoEvaporacao() {
        return fracaoEvaporacao;
    }

    public void setFracaoEvaporacao(double fracaoEvaporacao) {
        this.fracaoEvaporacao = fracaoEvaporacao;
    }

    public double getExpoenteMarcacaoTrilha() {
        return expoenteMarcacaoTrilha;
    }

    public void setExpoenteMarcacaoTrilha(double expoenteMarcacaoTrilha) {
        this.expoenteMarcacaoTrilha = expoenteMarcacaoTrilha;
    }

    public double getAprimoramentoDeElite() {
        return aprimoramentoDeElite;
    }

    public void setAprimoramentoDeElite(double aprimoramentoDeElite) {
        this.aprimoramentoDeElite = aprimoramentoDeElite;
    }

    public double getExploit() {
        return exploit;
    }

    public void setExploit(double exploit) {
        this.exploit = exploit;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double getIteracoes() {
        return iteracoes;
    }

    public void setIteracoes(double iteracoes) {
        this.iteracoes = iteracoes;
    }

}
