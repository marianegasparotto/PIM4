package Metodos;

import Classes.*;

import java.sql.Struct;
import java.util.Scanner;

public class MetBiblioteca {
    public static void main(String[] args) {

        Main.Midia midia_bibl = new Main.Midia("Luna", 2021, "Pop");
        Biblioteca met_biblioteca = new Biblioteca("musica", "annaJa1", "Tradicional Vibes",false);
        Musica bibl_mus = new Musica(3.22, 5, true);
        Serie bibl_ser = new Serie(10, "Lee Dong Wook, Wi Ha Joon, Han Ji Eun");
        Filme bibl_film = new Filme(1.63, "longa metragem",
                "Kang Soo Yeon", "Yeon Sang Ho", "Climax studios");

        Scanner teclado = new Scanner(System.in);

        String retur_one, retur_two;

        System.out.println("Você está sua biblioteca Kmax! Digite play e \n" +
                "consulte suas midias e playlists disponiveis:");
        retur_one = teclado.nextLine();

        //necessario atender a primeira condição para prosseguir---------
        if (retur_one.equalsIgnoreCase("play")) {

            System.out.println("Aqui estão as  mídias disponíveis na sua biblioteca. \n" +
                    "Elas estão divididas nas suas playlists, qual delas você deseja? Digite o número correspondente:\n" +
                    "\n" +
                    "1 – Traditional vibes\n" +
                    "2 - Halloween party\n" +
                    "3 – Latin rhythms\n" +
                    "4 – Filmes que gostei\n" +
                    "5 – Minhas séries preferidas");
            retur_two = teclado.nextLine();


            //Playlist Tradicional vibes - midia musica escolhida ---------------------------------
            if (retur_two.equals("1")) {
                met_biblioteca.setTocando(true);
                boolean play = true;
                String esta_tocando = Boolean.toString(play).replace("true", "Em reprodução");
                System.out.println(esta_tocando);

                met_biblioteca.setPlaylist("Tradicional vibes");
                met_biblioteca.setUsuario("annaJa1");
                met_biblioteca.setMidias("Musica");
                midia_bibl.setTitulo("Luna");
                midia_bibl.setAno(2021);
                midia_bibl.setGenero("Pop");
                bibl_mus.setDuracao(3.19);
                bibl_mus.setNota(3);

                System.out.println("Playlist escolhida foi " + met_biblioteca.getPlaylist() + " da midia " +
                        met_biblioteca.getMidias() + " pelo usuário " +met_biblioteca.getUsuario() + ".\n" +
                        "Você esta ouvindo: \n" +
                        "Musica: " + midia_bibl.getTitulo() + "\n" +
                        "Ano de lançamento: " + midia_bibl.getAno() + "\n" +
                        "Gênero: " + midia_bibl.getGenero() + "\n" +
                        "Duração: " + bibl_mus.getDuracao() + "\n" +
                        "Nota: " + bibl_mus.getNota() + " estrelas."
                );

            }

            //Playlist Halloween party - midia musica escolhida ---------------------------------
            else if (retur_two.equals("2")) {
                met_biblioteca.setTocando(true);
                boolean play = true;
                String esta_tocando = Boolean.toString(play).replace("true", "Em reprodução");
                System.out.println(esta_tocando);

                met_biblioteca.setPlaylist("Halloween party");
                met_biblioteca.setUsuario("annaJa1");
                met_biblioteca.setMidias("Musica");
                midia_bibl.setTitulo("Voodoo doll");
                midia_bibl.setAno(2013);
                midia_bibl.setGenero("Pop");
                bibl_mus.setDuracao(3.36);
                bibl_mus.setNota(5);

                System.out.println("Playlist escolhida foi " + met_biblioteca.getPlaylist() + " da midia " +
                        met_biblioteca.getMidias() + " pelo usuário " +met_biblioteca.getUsuario() + ".\n" +
                        "Você esta ouvindo: \n" +
                        "Musica: " + midia_bibl.getTitulo() + "\n" +
                        "Ano de lançamento: " + midia_bibl.getAno() + "\n" +
                        "Gênero: " + midia_bibl.getGenero() + "\n" +
                        "Duração: " + bibl_mus.getDuracao() + "\n" +
                        "Nota: " + bibl_mus.getNota() + " estrelas."
                );

            }

            //Playlist Latin rhythms - midia musica escolhida ---------------------------------
            else if (retur_two.equals("3")) {
                met_biblioteca.setTocando(true);
                boolean play = true;
                String esta_tocando = Boolean.toString(play).replace("true", "Em reprodução");
                System.out.println(esta_tocando);

                met_biblioteca.setPlaylist("Latin rhythms");
                met_biblioteca.setUsuario("annaJa1");
                met_biblioteca.setMidias("Musica");
                midia_bibl.setTitulo("Antifragile");
                midia_bibl.setAno(2022);
                midia_bibl.setGenero("Pop");
                bibl_mus.setDuracao(3.04);
                bibl_mus.setNota(5);

                System.out.println("Playlist escolhida foi " + met_biblioteca.getPlaylist() + " da midia " +
                        met_biblioteca.getMidias() + " pelo usuário " +met_biblioteca.getUsuario() + ".\n" +
                        "Você esta ouvindo: \n" +
                        "Musica: " + midia_bibl.getTitulo() + "\n" +
                        "Ano de lançamento: " + midia_bibl.getAno() + "\n" +
                        "Gênero: " + midia_bibl.getGenero() + "\n" +
                        "Duração: " + bibl_mus.getDuracao() + "\n" +
                        "Nota: " + bibl_mus.getNota() + " estrelas."
                );

            }

            //Playlist Filmes que gostei - midia filme escolhida ---------------------------------
            else if (retur_two.equals("4")) {
                met_biblioteca.setTocando(true);
                boolean play = true;
                String esta_tocando = Boolean.toString(play).replace("true", "Em reprodução");
                System.out.println(esta_tocando);

                met_biblioteca.setPlaylist("Filmes que gostei");
                met_biblioteca.setUsuario("annaJa1");
                met_biblioteca.setMidias("Filme");
                midia_bibl.setTitulo("Sweet and Sour");
                midia_bibl.setAno(2021);
                midia_bibl.setGenero("Romance");
                bibl_film.setTipo("Longa metragem");
                bibl_film.setDuracao(1.42);

                System.out.println("Playlist escolhida foi " + met_biblioteca.getPlaylist() + " da midia " +
                        met_biblioteca.getMidias() + " pelo usuário " +met_biblioteca.getUsuario() + ".\n" +
                        "Você esta vendo: \n" +
                        "Título : " + midia_bibl.getTitulo() + "\n" +
                        "Ano de lançamento: " + midia_bibl.getAno() + "\n" +
                        "Gênero: " + midia_bibl.getGenero() + "\n" +
                        "Duração: " + bibl_film.getDuracao() + "\n" +
                        bibl_film.getTipo());

            }

            else if (retur_two.equals("5")) {
                met_biblioteca.setTocando(true);
                boolean play = true;
                String esta_tocando = Boolean.toString(play).replace("true", "Em reprodução");
                System.out.println(esta_tocando);

                met_biblioteca.setPlaylist("Minhas séries preferidas");
                met_biblioteca.setUsuario("annaJa1");
                met_biblioteca.setMidias("Serie");
                midia_bibl.setTitulo("Flower of evil");
                midia_bibl.setAno(2020);
                midia_bibl.setGenero("Romance");
                bibl_ser.setEpisodios(16);


                System.out.println("Playlist escolhida foi " + met_biblioteca.getPlaylist() + " da midia " +
                        met_biblioteca.getMidias() + " pelo usuário " +met_biblioteca.getUsuario() + ".\n" +
                        "Você esta vendo: \n" +
                        "Título : " + midia_bibl.getTitulo() + "\n" +
                        "Ano de lançamento: " + midia_bibl.getAno() + "\n" +
                        "Gênero: " + midia_bibl.getGenero() + "\n" +
                        bibl_ser.getEpisodios() + " episódios");

            }
        //Outra digitação
        }else {
        System.out.println("Desculpe, acho que você digitou incorretamente.\n" +
                "Verifique e tente novamente.");}

    }

}

