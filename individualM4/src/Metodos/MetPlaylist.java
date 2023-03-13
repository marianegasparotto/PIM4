package Metodos;

import Classes.*;

import java.util.Scanner;

public class MetPlaylist {
    public static void main(String[] args) {

        Playlist fila = new Playlist();
        Musica playlist_musicas = new Musica(3.22, 5, true);
        Main.Midia midia_play = new Main.Midia("Luna", 2021, "Pop");
        Serie play_ser = new Serie(10, "Lee Dong Wook, Wi Ha Joon, Han Ji Eun");
        Filme play_film = new Filme(1.63, "longa metragem",
                "Kang Soo Yeon", "Yeon Sang Ho", "Climax studios");


        Scanner teclado = new Scanner(System.in);


        System.out.println("Você está nas playlists do Kmax!\n" +
                "Escolha qual tipo das nossas mídias você deseja :");
        String midias = teclado.nextLine();

        //Caso a escolha seja a midia musica ------------------------
        if (midias.equalsIgnoreCase("musica")) {
            playlist_musicas.setTocando(true);
            boolean play = true;
            String esta_tocando = Boolean.toString(play).replace("true", "Tocando!");
            System.out.println(esta_tocando);

            fila.setMidias("Musica");
            fila.setOrdemExecucao(1);
            fila.setMidiaAtual("Rush Hour");
            playlist_musicas.setDuracao(3.22);
            playlist_musicas.setNota(5);

            System.out.println("Escolha de mídia: " + fila.getMidias());
            System.out.println("Ordem: " + fila.getOrdemExecucao());
            System.out.println("Musica: " + fila.getMidiaAtual());
            System.out.println("Duração: " + playlist_musicas.getDuracao());
            System.out.println("Nota: " + playlist_musicas.getNota() + " estrelas");

            System.out.println("Digite next para sua próxima mídia");
            String resp_1 = teclado.nextLine();

            if (resp_1.equalsIgnoreCase("next")) {
                System.out.println(esta_tocando);

                fila.setMidias("Musica");
                fila.setOrdemExecucao(2);
                fila.setMidiaAtual("Ditto");
                playlist_musicas.setDuracao(3.05);
                playlist_musicas.setNota(4);

                System.out.println("Escolha de mídia: " + fila.getMidias());
                System.out.println("Ordem: " + fila.getOrdemExecucao());
                System.out.println("Musica: " + fila.getMidiaAtual());
                System.out.println("Duração: " + playlist_musicas.getDuracao());
                System.out.println("Nota: " + playlist_musicas.getNota() + " estrelas");

            }

            //Caso a escolha seja a midia filme ------------------------
        } else if (midias.equalsIgnoreCase("filme")) {
            boolean play = true;
            String esta_tocando = Boolean.toString(play).replace("true", "Tocando!");
            System.out.println(esta_tocando);


            fila.setMidias("Filme");
            fila.setOrdemExecucao(1);
            fila.setMidiaAtual("Space sweepers");
            midia_play.setAno(2021);
            midia_play.setGenero("Sci - fi");
            play_film.setTipo("Longa metragem");
            play_film.setDuracao(2.16);

            System.out.println("Escolha de mídia: " + fila.getMidias());
            System.out.println("Ordem: " + fila.getOrdemExecucao());
            System.out.println("Filme: " + fila.getMidiaAtual());
            System.out.println("Ano de lançamento: " + midia_play.getAno());
            System.out.println("Duração: " + play_film.getDuracao());
            System.out.println("Gênero: " + midia_play.getGenero());
            System.out.println(play_film.getTipo());

            System.out.println("Digite next para sua próxima mídia");
            String resp_1 = teclado.nextLine();

            if (resp_1.equalsIgnoreCase("next")) {
                System.out.println(esta_tocando);

                fila.setMidias("Filme");
                fila.setOrdemExecucao(2);
                fila.setMidiaAtual("Wish you");
                midia_play.setAno(2021);
                midia_play.setGenero("Romance");
                play_film.setTipo("Longa metragem");
                play_film.setDuracao(1.21);

                System.out.println("Escolha de mídia: " + fila.getMidias());
                System.out.println("Ordem: " + fila.getOrdemExecucao());
                System.out.println("Filme: " + fila.getMidiaAtual());
                System.out.println("Ano de lançamento: " + midia_play.getAno());
                System.out.println("Duração: " + play_film.getDuracao());
                System.out.println("Gênero: " + midia_play.getGenero());
                System.out.println(play_film.getTipo());

            }
            //Caso a escolha seja a midia serie ------------------------
        } else if (midias.equalsIgnoreCase("serie")) {
            boolean play = true;
            String esta_tocando = Boolean.toString(play).replace("true", "Tocando!");
            System.out.println(esta_tocando);


            fila.setMidias("Serie");
            fila.setOrdemExecucao(1);
            fila.setMidiaAtual("Big mouth");
            midia_play.setAno(2022);
            midia_play.setGenero("Action");
            play_ser.setEpisodios(16);

            System.out.println("Escolha de mídia: " + fila.getMidias());
            System.out.println("Ordem: " + fila.getOrdemExecucao());
            System.out.println("Série: " + fila.getMidiaAtual());
            System.out.println("Ano de lançamento: " + midia_play.getAno());
            System.out.println(play_ser.getEpisodios() + " episódios");
            System.out.println("Gênero: " + midia_play.getGenero());

            System.out.println("Digite next para sua próxima mídia");
            String resp_1 = teclado.nextLine();

            if (resp_1.equalsIgnoreCase("next")) {
                System.out.println(esta_tocando);

                fila.setMidias("Serie");
                fila.setOrdemExecucao(2);
                fila.setMidiaAtual("Kingdom");
                midia_play.setAno(2019);
                midia_play.setGenero("Horror");
                play_ser.setEpisodios(8);

                System.out.println("Escolha de mídia: " + fila.getMidias());
                System.out.println("Ordem: " + fila.getOrdemExecucao());
                System.out.println("Série: " + fila.getMidiaAtual());
                System.out.println("Ano de lançamento: " + midia_play.getAno());
                System.out.println(play_ser.getEpisodios() + " episódios");
                System.out.println("Gênero: " + midia_play.getGenero());
            }


        }

    }
}
//métodos proxima midia, midia anterior e misturar midias ------------------

