package Métodos;

import Classes.Musica;
import Classes.Playlist;
import com.sun.tools.javac.Main;

import java.util.Scanner;

public class MetPlaylist {
    public static void main(String[] args) {

        Playlist fila = new Playlist();
        Musica playlist_musicas = new Musica(3.22, 5, true);


        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite a midia para começar:");
        String midias =  teclado.nextLine();


        fila.setMidias("Musica");
        fila.setOrdemExecucao(1);
        fila.setMidiaAtual("Rush Hour");
        playlist_musicas.setDuracao(3.22);
        playlist_musicas.setNota(5);

        System.out.println("Tocando!" + playlist_musicas.getTocando());
        System.out.println("Escolha de mídia: " + fila.getMidias());
        System.out.println("Ordem: " + fila.getOrdemExecucao());
        System.out.println("Musica: " + fila.getMidiaAtual());
        System.out.println("Duração: " + playlist_musicas.getDuracao());
        System.out.println("Nota: " + playlist_musicas.getNota() + " estrelas");

        System.out.println("Digite next para sua próxima mídia");
        String resp_1 = teclado.nextLine();

        if (resp_1.equals("next")){
            System.out.println(midias);

        }

    }

}

//métodos proxima midia, midia anterior e misturar midias ------------------

