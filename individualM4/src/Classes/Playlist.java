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


    //composição de musica-------------
    public Playlist(String midias, int ordemExecucao, String midiaAtual) {
        this.midias = midias;
        this.ordemExecucao = ordemExecucao;
        this.midiaAtual = midiaAtual;
    }

    //getters and setters
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


}

