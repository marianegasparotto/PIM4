package Classes;

import Metodos.MetPlaylist;
import com.sun.tools.javac.Main;

import java.util.List;
import java.util.Scanner;

public class Playlist extends Main {
    public static String midias;
//    String midias;
    int ordemExecucao;
    String midiaAtual;
    private Musica musica;

    private List<Musica> musicas;
    private int posicaoAtual;


    //composição de musica-------------
    public Playlist() {
        this.midias = midias;
        this.ordemExecucao = ordemExecucao;
        this.midiaAtual = midiaAtual;
    }

    public Playlist(int ordemExecucao, String midiaAtual, List<Musica>musicas) {
        this.ordemExecucao = ordemExecucao;
        this.midiaAtual = midiaAtual;
        this.musicas = musicas;
        this.posicaoAtual = 0;
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

//    public void tocarProximaMusica() {
//        int index = midias.indexOf(midiaAtual);
//        if (index == midias.size() - 1) {
//            index = 0;
//        } else {
//            index++;
//        }
//        midiaAtual = midias.get(index);
//        System.out.println("Tocando a próxima música: " + midiaAtual);
//    }
//
//    public void tocarMusicaAnterior() {
//        int index = midias.indexOf(midiaAtual);
//        if (index == 0) {
//            index = midias.size() - 1;
//        } else {
//            index--;
//        }
//        midiaAtual = midias.get(index);
//        System.out.println("Tocando a música anterior: " + midiaAtual);
//    }
//
//    public void tocarMusicaAleatoria() {
//        Random random = new Random();
//        int index = random.nextInt(midias.size());
//        midiaAtual = midias.get(index);
//        System.out.println("Tocando uma música aleatória: " + midiaAtual);
//    }


}

