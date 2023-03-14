package Classes;

import com.sun.tools.javac.Main;

public class Filme extends Main{
        double duracao;
        String tipo;
        private String[] elenco;
        String diretor;
        String produtor;

    //constructors de filme-------------
    public Filme(double duracao, String tipo, String elenco, String diretor, String produtor) {
        this.duracao = duracao;
        this.tipo = tipo;
        this.elenco = new String[]{elenco};
        this.diretor = diretor;
        this.produtor = produtor;
    }

    //getters and setters
    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }
}
