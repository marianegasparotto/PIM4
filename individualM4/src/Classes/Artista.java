package Classes;

import com.sun.tools.javac.Main;

public class Artista extends Main{
        String nome;
        String atorOrCantor;

        String dataNascimento;
        String genero;
        String premiacoes;

    //constructors de artista-------------
    public Artista(String nome, String atorOrCantor, String dataNascimento, String genero, String premiacoes) {
        this.nome = nome;
        this.atorOrCantor = atorOrCantor;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.premiacoes = premiacoes;
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtorOrCantor() {
        return atorOrCantor;
    }

    public void setAtorOrCantor(String atorOrCantor) {
        this.atorOrCantor = atorOrCantor;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(String premiacoes) {
        this.premiacoes = premiacoes;
    }
}
