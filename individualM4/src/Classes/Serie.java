package Classes;

import com.sun.tools.javac.Main;

public class Serie extends Main {
    double episodios;
    String elenco;
    //exibir premiação de algum ator-----------


    public Serie(double episodios, String elenco) {
        this.episodios = episodios;
        this.elenco = elenco;
    }

    public double getEpisodios() {
        return episodios;
    }

    public void setEpisodios(double episodios) {
        this.episodios = episodios;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }
}
