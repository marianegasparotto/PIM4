package Classes;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Musica extends Main {
        double duracao;
        int nota;
        boolean tocando = false;

        //artista - composição------------------
        private Artista artista;

    //constructors de musica------------
    public Musica(double duracao, int nota, boolean tocando) {
        this.duracao = duracao;
        this.nota = nota;
        this.tocando = tocando;
    }

    //getters and setters
    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
