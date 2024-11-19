package br.edu.uffs.catalogo.Classes;

//Classe Midia é declarada como abstrata, será apenas herdada por outras, sem implementação de objetos desse tipo no Main
abstract class Midia {
    //Declaração das variaves
    private final String titulo;
    private String generos;
    private int classEtaria;
    private final int anoLancamento;

    //Construtor
    public Midia(String title, String genres, int ageRating, int release){
        this.titulo = title;
        this.generos = genres;
        this.classEtaria = ageRating;
        this.anoLancamento = release;
    }

    //Cadeia de metodos set e get
    public void setGeneros(String genres){
        this.generos = genres;
    }
    public void setClassEtaria(int ageRating){
        this.classEtaria = ageRating;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public String getGeneros(){
        return this.generos;
    }
    public int getClassEtaria(){
        return this.classEtaria;
    }
    public int getAno(){
        return this.anoLancamento;
    }
}
