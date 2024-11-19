package br.edu.uffs.catalogo.Classes;

//Classe Temporadas sera utilizada para o construir a variavel temporadas de Serie
public class Temporadas {
    //Declaração da variavel
    private int numEps;

    //Construtor
    public Temporadas(int epNum){
        this.numEps = epNum;
    }

    //Metodos set e get
    public void setNumEps(int epNum){
        this.numEps = epNum;
    }
    public int getEps(){
        return this.numEps;
    }
}
