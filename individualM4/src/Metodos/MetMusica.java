package Metodos;

import Classes.Artista;
import Classes.Main;
import Classes.Musica;

import java.util.Scanner;

public class MetMusica {
    public static void main(String[] args) {
        Main.Midia midia_bibl = new Main.Midia("Gambler", 2021, "Pop");
        Musica musics = new Musica(3.33,4,false);
        Artista music_arts = new Artista("Monsta X","Cantor","14/05/2015",
                "masculino","Best New Singer");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Você está na sessão músicas do Kmax!\n" +
                "Qual tipo de musica você gostaria que te indicassemos hoje?\n" +
                "Digite o número de acordo com o que você deseja:\n" +
                "1 – Pop\n" +
                "2 – Indie\n" +
                "3 – R&B\n" +
                "4 – Bands");

        String number_genero = teclado.nextLine();

        //Tocando o genero Pop ------------------------------------
        if (number_genero.equals("1")){
            musics.setTocando(true);
            boolean play = true;
            String esta_tocando = Boolean.toString(play).replace("true", "Em reprodução");
            System.out.println(esta_tocando);

            midia_bibl.setGenero("Pop");
            midia_bibl.setTitulo("Gambler");
            midia_bibl.setAno(2021);
            music_arts.setNome("Monsta x");
            musics.setDuracao(3.33);
            musics.setNota(4);

            System.out.println("Você escolheu " + midia_bibl.getGenero() + "!\n" +
                    "Você esta ouvindo: \n" +
                    "Musica: " + midia_bibl.getTitulo() +" do " + music_arts.getNome() + "\n" +
                    "Ano de lançamento: " + midia_bibl.getAno() + "\n" +
                    "Duração: " + musics.getDuracao() + "\n" +
                    "Nota: " + musics.getNota() + " estrelas."
            );

        }

        //Tocando o genero Indie ------------------------------------
        else if (number_genero.equals("2")){
            musics.setTocando(true);
            boolean play = true;
            String esta_tocando = Boolean.toString(play).replace("true", "Em reprodução");
            System.out.println(esta_tocando);

            midia_bibl.setGenero("Indie");
            midia_bibl.setTitulo("Chilhood");
            midia_bibl.setAno(2022);
            music_arts.setNome("The rose");
            musics.setDuracao(4.29);
            musics.setNota(5);

            System.out.println("Você escolheu " + midia_bibl.getGenero() + "!\n" +
                    "Você esta ouvindo: \n" +
                    "Musica: " + midia_bibl.getTitulo() +" do " + music_arts.getNome() + "\n" +
                    "Ano de lançamento: " + midia_bibl.getAno() + "\n" +
                    "Duração: " + musics.getDuracao() + "\n" +
                    "Nota: " + musics.getNota() + " estrelas."
            );

        }

        //Tocando o genero R&B ------------------------------------
        else if (number_genero.equals("3")){
            musics.setTocando(true);
            boolean play = true;
            String esta_tocando = Boolean.toString(play).replace("true", "Em reprodução");
            System.out.println(esta_tocando);

            midia_bibl.setGenero("R&B");
            midia_bibl.setTitulo("And July");
            midia_bibl.setAno(2016);
            music_arts.setNome("Heize");
            musics.setDuracao(3.46);
            musics.setNota(5);

            System.out.println("Você escolheu " + midia_bibl.getGenero() + "!\n" +
                    "Você esta ouvindo: \n" +
                    "Musica: " + midia_bibl.getTitulo() +" da " + music_arts.getNome() + "\n" +
                    "Ano de lançamento: " + midia_bibl.getAno() + "\n" +
                    "Duração: " + musics.getDuracao() + "\n" +
                    "Nota: " + musics.getNota() + " estrelas."
            );

        }

        //Tocando Bands ------------------------------------
        else if (number_genero.equals("4")){
            musics.setTocando(true);
            boolean play = true;
            String esta_tocando = Boolean.toString(play).replace("true", "Em reprodução");
            System.out.println(esta_tocando);

            midia_bibl.setGenero("Bands");
            midia_bibl.setTitulo("Rain to be");
            midia_bibl.setAno(2022);
            music_arts.setNome("Onewe");
            musics.setDuracao(3.15);
            musics.setNota(3);

            System.out.println("Você escolheu " + midia_bibl.getGenero() + "!\n" +
                    "Você esta ouvindo: \n" +
                    "Musica: " + midia_bibl.getTitulo() +" do " + music_arts.getNome() + "\n" +
                    "Ano de lançamento: " + midia_bibl.getAno() + "\n" +
                    "Duração: " + musics.getDuracao() + "\n" +
                    "Nota: " + musics.getNota() + " estrelas."
            );

        }

    }
}
