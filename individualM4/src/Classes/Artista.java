package Classes;

import com.sun.tools.javac.Main;

public class Artista extends Main{
        String nome;
        String atorOrCantor;
        //exibir sua atuação:
        //ator: formação em cinema ou teatro
        // musico: vocalista, rapper, guitarrista etc------------
        String integrantes;
        double dataNascimento;
        String genero;
        String premiacoes;
        //exibir premiação de algum ator---------


    public Artista(String nome, String atorOrCantor, String integrantes, double dataNascimento, String genero, String premiacoes) {
        this.nome = nome;
        this.atorOrCantor = atorOrCantor;
        this.integrantes = integrantes;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.premiacoes = premiacoes;
    }

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

    public String getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String integrantes) {
        this.integrantes = integrantes;
    }

    public double getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(double dataNascimento) {
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
