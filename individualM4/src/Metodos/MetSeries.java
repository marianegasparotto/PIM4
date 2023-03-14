package Metodos;

import Classes.Main;

import Classes.Serie;

import java.util.Scanner;

public class MetSeries {
    public static void main(String[] args) {
        Main.Midia midia_filmes = new Main.Midia("Bad and crazy",2021,"Action");

        Serie fila_serie = new Serie(10,"Lee Dong Wook, Wi Ha Joon, Han Ji Eun");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Você está na sessão de séries do Kmax! Qual genero de série você gostaria que " +
                "te indicassemos hoje? Digite o número de acordo com o que você deseja:\n" +
                "1 – Horror\n" +
                "2 - Sci – fi / Fantasy\n" +
                "3 – Action\n" +
                "4 – Historical\n" +
                "5 – Drama\n" +
                "6 – Romance\n" +
                "7 - Comedy\n");

        String number_gener = teclado.nextLine();

        //Horror--------------------------------------------
        if (number_gener.equals("1")) {

            midia_filmes.setTitulo("Stranger from hell");
            midia_filmes.setAno(2019);
            midia_filmes.setGenero("Horror");
            fila_serie.setEpisodios(10);

            System.out.println("Gênero escolhido: " + midia_filmes.getGenero());
            System.out.println("Título: " + midia_filmes.getTitulo());
            System.out.println("Ano: " + midia_filmes.getAno());
            System.out.println(fila_serie.getEpisodios() + " episódios");

            String[] el = {"Lee Dong Wook", "Yim Si Wan", "Kim Ji Eun"};

            fila_serie.setElenco(el);

            System.out.println("Elenco:");

            for (int c=0; c<=2; c++){
                System.out.println(el[c]);
            }
        }

        //Sci - fi ----------------------------------------------
        else if (number_gener.equals("2")) {

            midia_filmes.setTitulo("The silent sea");
            midia_filmes.setAno(2021);
            midia_filmes.setGenero("Sci - fi");
            fila_serie.setEpisodios(8);

            System.out.println("Gênero escolhido: " + midia_filmes.getGenero());
            System.out.println("Título: " + midia_filmes.getTitulo());
            System.out.println("Ano: " + midia_filmes.getAno());
            System.out.println(fila_serie.getEpisodios() + " episódios");

            String[] el = {"Bae Doo Na", "Gong Yoo", "Lee Joon"};

            fila_serie.setElenco(el);

            System.out.println("Elenco:");

            for (int c=0; c<=2; c++){
                System.out.println(el[c]);
            }
        }

        //Action ----------------------------------------------
        else if (number_gener.equals("3")) {

            midia_filmes.setTitulo("Bad and Crazy");
            midia_filmes.setAno(2021);
            midia_filmes.setGenero("Action");
            fila_serie.setEpisodios(12);

            System.out.println("Gênero escolhido: " + midia_filmes.getGenero());
            System.out.println("Título: " + midia_filmes.getTitulo());
            System.out.println("Ano: " + midia_filmes.getAno());
            System.out.println(fila_serie.getEpisodios() + " episódios");

            String[] el = {"Lee Dong Wook", "Wi Ha Joon", "Han Ji Eun"};

            fila_serie.setElenco(el);

            System.out.println("Elenco:");

            for (int c=0; c<=2; c++){
                System.out.println(el[c]);
            }
        }

        //Historical --------------------------------------------
        else if (number_gener.equals("4")) {

            midia_filmes.setTitulo("My country");
            midia_filmes.setAno(2019);
            midia_filmes.setGenero("Historical");
            fila_serie.setEpisodios(16);

            System.out.println("Gênero escolhido: " + midia_filmes.getGenero());
            System.out.println("Título: " + midia_filmes.getTitulo());
            System.out.println("Ano: " + midia_filmes.getAno());
            System.out.println(fila_serie.getEpisodios() + " episódios");

            String[] el = {"Yang Se Jong", "Woo Doo Hwan", "Kim Seol Hyun"};

            fila_serie.setElenco(el);

            System.out.println("Elenco:");

            for (int c=0; c<=2; c++){
                System.out.println(el[c]);
            }
        }

        //Drama -------------------------------------------------
        else if (number_gener.equals("5")) {

            midia_filmes.setTitulo("Move to heaven");
            midia_filmes.setAno(2021);
            midia_filmes.setGenero("Drama");
            fila_serie.setEpisodios(10);

            System.out.println("Gênero escolhido: " + midia_filmes.getGenero());
            System.out.println("Título: " + midia_filmes.getTitulo());
            System.out.println("Ano: " + midia_filmes.getAno());
            System.out.println(fila_serie.getEpisodios() + " episódios");

            String[] el = {"Tang Jun Sang", "Hong Seung Hee", "Lee Je Hoon"};

            fila_serie.setElenco(el);

            System.out.println("Elenco:");

            for (int c=0; c<=2; c++){
                System.out.println(el[c]);
            }
        }

        //Romance---------------------------------------------------
        else if (number_gener.equals("6")) {

            midia_filmes.setTitulo("Crash landing on you");
            midia_filmes.setAno(2019);
            midia_filmes.setGenero("Romance");
            fila_serie.setEpisodios(16);

            System.out.println("Gênero escolhido: " + midia_filmes.getGenero());
            System.out.println("Título: " + midia_filmes.getTitulo());
            System.out.println("Ano: " + midia_filmes.getAno());
            System.out.println(fila_serie.getEpisodios() + " episódios");

            String[] el = {"Hyun Bin", "Son Ye Jin", "Seo Ji Hye"};

            fila_serie.setElenco(el);

            System.out.println("Elenco:");

            for (int c=0; c<=2; c++){
                System.out.println(el[c]);
            }
        }

        //Comedy ---------------------------------------------------------
        else if (number_gener.equals("7")) {

            midia_filmes.setTitulo("Bad prosecutor");
            midia_filmes.setAno(2022);
            midia_filmes.setGenero("Comedy");
            fila_serie.setEpisodios(12);

            System.out.println("Gênero escolhido: " + midia_filmes.getGenero());
            System.out.println("Título: " + midia_filmes.getTitulo());
            System.out.println("Ano: " + midia_filmes.getAno());
            System.out.println(fila_serie.getEpisodios() + " episódios");

            String[] el = {"Doh Kyung Soo", "Lee Se Hee", "Song Ha Joon"};

            fila_serie.setElenco(el);

            System.out.println("Elenco:");

            for (int c=0; c<=2; c++){
                System.out.println(el[c]);
            }
        }

        else{
            System.out.println("Desculpe, acho que você digitou o numero escolhido incorretamente.\n" +
                    "Verifique e tente novamente.");
        }

    }
}
