package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    static void main() {

        Filme favorito = new Filme("The Matrix", 1999);
        Filme f1 = new Filme("F1", 2025);
        var filmeBrendon = new Filme("TRON o Legado", 2010);
        Serie vikings = new Serie("Vikings", 2020);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeBrendon);
        filmeBrendon.avalia(10);
        lista.add(f1);
        f1.avalia(7);
        lista.add(favorito);
        favorito.avalia(8);
        lista.add(vikings);

        for(Titulo titulo : lista) {
            System.out.println(titulo);
            if (titulo instanceof Filme filme && filmeBrendon.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Brendon");
        buscaPorArtista.add("Caio Castro");
        buscaPorArtista.add("Ferrari");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da Ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de Titulos");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por Ano de Lancamento");
        System.out.println(lista);
    }
}
