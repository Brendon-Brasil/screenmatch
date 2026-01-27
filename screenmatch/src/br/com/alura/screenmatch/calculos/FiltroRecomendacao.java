package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificacao classificacao){
        if (classificacao.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos da galera.");
        } else if (classificacao.getClassificacao() >= 2) {
            System.out.println("Bem avaliado no momento!");
        }else {
            System.out.println("Coloque na lista para assistir depois.");
        }

    }
}
