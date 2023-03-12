package Classes;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Playlist extends Main {
    String midias;
    int ordemExecucao;
    String midiaAtual;
    private Musica musica;

    //composição de musica-------------
    public Playlist() {
        this.midias = midias;
        this.ordemExecucao = ordemExecucao;
        this.midiaAtual = midiaAtual;
    }

    public String getMidias() {
        return midias;
    }

    public void setMidias(String midias) {
        this.midias = midias;
    }

    public int getOrdemExecucao() {
        return ordemExecucao;
    }

    public void setOrdemExecucao(int ordemExecucao) {
        this.ordemExecucao = ordemExecucao;
    }

    public String getMidiaAtual() {
        return midiaAtual;
    }

    public void setMidiaAtual(String midiaAtual) {
        this.midiaAtual = midiaAtual;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

}

