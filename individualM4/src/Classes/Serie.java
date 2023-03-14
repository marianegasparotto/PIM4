package Classes;

import com.sun.tools.javac.Main;

public class Serie extends Main {
    int episodios;
    private String[] elenco;

    //constructors de serie-------------
    public Serie(int episodios, String elenco) {
        this.episodios = episodios;
        this.elenco = new String[]{elenco};
    }

    //getters and setters
    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }
}
