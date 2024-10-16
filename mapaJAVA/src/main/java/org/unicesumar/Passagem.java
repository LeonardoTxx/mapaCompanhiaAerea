package org.unicesumar;

public class Passagem {
    private Voo voo;
    private String nomePassageiro;
    private double preco;
    private static final double taxaEMBARQUE = 50.0;

    public Passagem(Voo voo, String nomePassageiro, double preco) {
        this.voo = voo;
        this.nomePassageiro = nomePassageiro;
        this.preco = preco;
    }

    public double calcularPrecoTotal() {
        return preco + taxaEMBARQUE;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }
}
