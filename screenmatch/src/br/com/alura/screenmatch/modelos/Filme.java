package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme - " + this.getNome() + " (ano de lançamento - " + this.getAnoDeLancamento() + ")";
    }
}