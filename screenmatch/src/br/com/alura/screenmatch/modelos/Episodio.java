package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Episodio implements Classificacao {

    private String nome;
    private int numero;
    private String serie;
    private int totalDeVisualizacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalDeVisualizacao >= 1000){
            return 5;
        }else if (totalDeVisualizacao >= 800) {
            return 4;
        } else if (totalDeVisualizacao >= 600) {
            return 3;
        } else if (totalDeVisualizacao >= 400) {
            return 2;
        }else {
            return 1;
        }
    }
}
