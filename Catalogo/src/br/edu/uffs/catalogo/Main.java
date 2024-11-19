package br.edu.uffs.catalogo;

//Diretiva Import para uso do pacote Classes
import br.edu.uffs.catalogo.Classes.Filme;
import br.edu.uffs.catalogo.Classes.Serie;
import br.edu.uffs.catalogo.Classes.Temporadas;

public class Main {
    public static void main(String[] args) {
        //Uso dos construtores para instanciar os objetos
        Filme film = new Filme("Django Livre", "Ação, Drama", 18, 2012, "Quentin Tarantino", 165);
        Filme movie = new Filme("Blade Runner 2049", "Sci-Fi, Drama, Ação", 14, 2017, "Denis Villeneuve", 163);
        Temporadas[] temporadasBB = new Temporadas[5];
        temporadasBB[0] = new Temporadas(7);
        temporadasBB[1] = new Temporadas(13);
        temporadasBB[2] = new Temporadas(13);
        temporadasBB[3] = new Temporadas(13);
        temporadasBB[4] = new Temporadas(16);
        Serie series = new Serie("Breaking Bad", "Drama, Suspense", 18, 2008, temporadasBB);
        int totalEntradas = Filme.getTotalFilmes() + Serie.getTotalSeries();

        //Output do programa
        System.out.println("Lista das entradas no catálogo\n");
        System.out.println("Nome do filme: "+ film.getTitulo() +"\nGêneros: "+ film.getGeneros() +"\nClassificação indicativa: "+ film.getClassEtaria() +" anos\nAno de Lançamento: "+ film.getAno() +"\nDiretor: "+ film.getDiretor() +"\nDuração: "+ film.getDuracao() +" minutos\n");
        System.out.println("Nome do filme: "+ movie.getTitulo() +"\nGêneros: "+ movie.getGeneros() +"\nClassificação indicativa: "+ movie.getClassEtaria() +" anos\nAno de Lançamento: "+ movie.getAno() +"\nDiretor: "+ movie.getDiretor() +"\nDuração: "+ movie.getDuracao() +" minutos\n");
        System.out.println("Nome da série: "+ series.getTitulo() +"\nGêneros: "+ series.getGeneros() +"\nClassificação indicativa: "+ series.getClassEtaria() + " anos\nAno de Lançamento: "+ series.getAno());
        System.out.println("Temporada 1: "+ series.getTemporadas()[0].getEps() +" episódios\nTemporada 2: "+ series.getTemporadas()[1].getEps() +" episódios\nTemporada 3: "+ series.getTemporadas()[2].getEps() +" episódios\nTemporada 4: "+ series.getTemporadas()[3].getEps() +" episódios\nTemporada 5: "+ series.getTemporadas()[4].getEps() +" episódios\n");
        System.out.println("Total de Filmes no catálogo: "+ Filme.getTotalFilmes());
        System.out.println("Total de Séries no catálogo: "+ Serie.getTotalSeries());
        System.out.println("Total de Entradas no catálogo: "+ totalEntradas);
    }
}