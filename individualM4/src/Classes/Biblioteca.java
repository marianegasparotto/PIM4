package Classes;

import com.sun.tools.javac.Main;

public class Biblioteca extends Main {
    String midias;
    String usuario;
    String playlist;

    boolean tocando = false;

    //composições--------
    private Musica musica;
    private Filme filme;
    private Serie serie;


    public Biblioteca(String midias, String usuario, String playlist, boolean tocando) {
        this.midias = midias;
        this.usuario = usuario;
        this.playlist = playlist;
        this.tocando = tocando;
    }

    public String getMidias() {
        return midias;
    }

    public void setMidias(String midias) {
        this.midias = midias;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}


