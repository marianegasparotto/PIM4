package Classes;

import com.sun.tools.javac.Main;

public class Biblioteca extends Main {
    String midias;
    double usuario;
    String suasPlaylists;

    //composicao de musicas, filmes e series----------------


    public Biblioteca(String midias, double usuario, String suasPlaylists) {
        this.midias = midias;
        this.usuario = usuario;
        this.suasPlaylists = suasPlaylists;
    }

    public String getMidias() {
        return midias;
    }

    public void setMidias(String midias) {
        this.midias = midias;
    }

    public double getUsuario() {
        return usuario;
    }

    public void setUsuario(double usuario) {
        this.usuario = usuario;
    }

    public String getSuasPlaylists() {
        return suasPlaylists;
    }

    public void setSuasPlaylists(String suasPlaylists) {
        this.suasPlaylists = suasPlaylists;
    }
}

//método tocar playlist------------------
