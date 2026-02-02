package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);

        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());

        Serie vikings = new Serie("Vikings", 2020);

        vikings.setIncluidoNoPlano(true);
        vikings.setTemporadas(5);
        vikings.setEpisodeosPorTemporada(10);
        vikings.setMinutosPorEpisodio(70);
        vikings.exibeFichaTecnica();

        System.out.println("Duração total em minutos de Vikings: " + vikings.getDuracaoEmMinutos());

        Filme f1 = new Filme("F1", 2025);

        f1.setDuracaoEmMinutos(160);
        f1.setIncluidoNoPlano(true);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(favorito);
        calculadora.inclui(f1);
        calculadora.inclui(vikings);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro  = new FiltroRecomendacao();
        filtro.filtra(favorito);

        var filmeBrendon = new Filme("TRON o Legado", 2010);

        filmeBrendon.setDuracaoEmMinutos(160);
        filmeBrendon.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeBrendon);
        listaDeFilmes.add(f1);
        listaDeFilmes.add(favorito);
        System.out.println("Tamanho da Lista de Filmes: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes);
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).toString());

    }

}