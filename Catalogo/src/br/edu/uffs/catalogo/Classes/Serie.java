package br.edu.uffs.catalogo.Classes;

//Classe Serie herda os atributos e metodos da classe Midia
public class Serie extends Midia {
    //Declaração das variaves
    private Temporadas temporadas[];
    private static int totalSeries;

    //Construtor
    public Serie(String title, String genres, int ageRating, int release, Temporadas seasons[]){
        //Uso do metodo super para acessar o construtor da superclasse
        super(title, genres, ageRating, release);
        this.temporadas = seasons;
        Serie.totalSeries += 1;
    }

    //Cadeia de metodos set e get
    public void setTemporadas(Temporadas seasons[]){
        this.temporadas = seasons;
    }
    public Temporadas[] getTemporadas(){
        return this.temporadas;
    }
    public static int getTotalSeries(){
        return Serie.totalSeries;
    }
}
