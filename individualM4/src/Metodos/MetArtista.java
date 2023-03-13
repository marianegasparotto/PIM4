package Metodos;

import Classes.Artista;

import java.util.Scanner;

public class MetArtista {
    public static void main(String[] args) {
        Artista arts = new Artista("Wi Ha Joon",
                "Ator",
                "05/08/1991",
                "Masculino",
                "BaekSang Arts Award: Melhor Ator Estreante (2019)");


        Scanner teclado = new Scanner(System.in);

        System.out.println("Quer conhecer mais sobre um artista? A Kmax te ajuda!\n" +
                "Digite o nome de quem você gostaria de conhecer melhor:\n");

        String nome_artista = teclado.nextLine();
        // Ator Wi Ha Joon
        if (nome_artista.equalsIgnoreCase("Wi Ha Joon")) {
            arts.setNome("Wi Ha Joon");
            arts.setAtorOrCantor("Ator");
            arts.setDataNascimento("05/08/1991");
            arts.setGenero("masculino");
            arts.setPremiacoes("BaekSang Arts Award: Melhor Ator Estreante (2019)");

            System.out.println("Este é " + arts.getNome() + "!\n" +
                    arts.getAtorOrCantor() + " do gênero " + arts.getGenero() + " que ja ganhou prêmios como\n" +
                    arts.getPremiacoes());

        }
        //Atriz Son Ye Jin
        else if (nome_artista.equalsIgnoreCase("Son Ye Jin")) {
            arts.setNome("Son Ye Jin");
            arts.setAtorOrCantor("Atriz");
            arts.setDataNascimento("11/01/1982");
            arts.setGenero("feminino");
            arts.setPremiacoes("Baeksang Arts Award for Most Popular Actress (2020)");

            System.out.println("Esta é " + arts.getNome() + "!\n" +
                    arts.getAtorOrCantor() + " do gênero " + arts.getGenero() + " que ja ganhou prêmios como\n" +
                    arts.getPremiacoes());

        }
        //Ator Choi Woo Shik
        else if (nome_artista.equalsIgnoreCase("Choi Woo Shik")) {
            arts.setNome("Choi Woo Shik");
            arts.setAtorOrCantor("Ator");
            arts.setDataNascimento("26/03/1990");
            arts.setGenero("masculino");
            arts.setPremiacoes("Blue Dragon Film Award: Melhor Novo Ator (2015)");

            System.out.println("Este é " + arts.getNome() + "!\n" +
                    arts.getAtorOrCantor() + " do gênero " + arts.getGenero() + " que ja ganhou prêmios como\n" +
                    arts.getPremiacoes() + " e esteve presente no filme Parasita,\n" +
                    "vencedor do Oscar de melhor filme em 2020");

        }
        //Cantora IU
        else if (nome_artista.equalsIgnoreCase("Lee Ji Eun") || nome_artista.equalsIgnoreCase
                ("IU") ) {
            arts.setNome("Lee Ji Eun");
            arts.setAtorOrCantor("Cantora");
            arts.setDataNascimento("16/05/1993");
            arts.setGenero("feminino");
            arts.setPremiacoes("Seoul Music Awards: Bonsang Award (2022)");

            System.out.println("Esta é " + arts.getNome() + "! Também conhecida por IU é uma \n" +
                    arts.getAtorOrCantor() + " do gênero " + arts.getGenero() + " que ja ganhou prêmios como\n" +
                    arts.getPremiacoes());

        }
        //Cantor Lee Tae min
        else if (nome_artista.equalsIgnoreCase("Lee Tae Min")) {
            arts.setNome("Lee Tae Min");
            arts.setAtorOrCantor("Cantor e dançarino");
            arts.setDataNascimento("18/07/1993");
            arts.setGenero("masculino");
            arts.setPremiacoes("Seoul Music Awards: Prêmio de Popularidade (2015, 2018)");

            System.out.println("Esta é " + arts.getNome() + "!\n" +
                    arts.getAtorOrCantor() + " do gênero " + arts.getGenero() + " que ja ganhou prêmios como\n" +
                    arts.getPremiacoes());

        }
        //Cantor e guitarrista Jae
        else if (nome_artista.equalsIgnoreCase("Park Jae hyung") || nome_artista.equalsIgnoreCase
                ("Jae") ) {
            arts.setNome("Park Jae hyung");
            arts.setAtorOrCantor("Cantor e guitarrista");
            arts.setDataNascimento("15/09/1992");
            arts.setGenero("masculino");
            arts.setPremiacoes("Seoul Music Awards: Bonsang Award (2022)");

            System.out.println("Este é " + arts.getNome() + "! Também conhecido por Jae é um \n" +
                    arts.getAtorOrCantor() + " do gênero " + arts.getGenero() + " que ja ganhou prêmios como\n" +
                    arts.getPremiacoes() + " juntamente com sua banda musical Day6");

        }

        else{
            System.out.println("Desculpe, acho que você digitou o nome do artista incorretamente.\n" +
                    "Verifique e tente novamente.");
        }

    }
}
