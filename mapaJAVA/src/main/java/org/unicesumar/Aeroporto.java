package org.unicesumar;

public class Aeroporto {
    private String nome;
    private String codigo;

    public Aeroporto (String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome(){
        return nome;
    }

    public String getCodigo(){
        return codigo;
    }
}
