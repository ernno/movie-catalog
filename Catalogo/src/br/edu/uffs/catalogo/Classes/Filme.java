package br.edu.uffs.catalogo.Classes;

//Classe Filme herda os atributos e metodos da classe Midia
public class Filme extends Midia {
    //Declaração das variaves
    private final String diretor;
    private final int duracao;
    private static int totalFilmes;

    //Construtor
    public Filme(String title, String genres, int ageRating, int release, String director, int length){
        //Uso do metodo super para acessar o construtor da superclasse
        super(title, genres, ageRating, release);
        this.diretor = director;
        this.duracao = length;
        Filme.totalFilmes += 1;
    }

    //Cadeia de metodos get
    public String getDiretor(){
        return this.diretor;
    }
    public int getDuracao(){
        return this.duracao;
    }
    public static int getTotalFilmes(){
        return Filme.totalFilmes;
    }
}
