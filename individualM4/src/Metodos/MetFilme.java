package Metodos;

import Classes.Filme;
import Classes.Main;

import java.util.Scanner;

public class MetFilme {

    public static void main(String[] args) {

        Main.Midia midia_filmes = new Main.Midia("Jung_E",2023,"Sci-fi");

        Filme fila_filmes = new Filme(1.63,"longa metragem",
               "Kang Soo Yeon","Yeon Sang Ho","Climax studios");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Você está na sessão filmes do Kmax! Qual gênero de filmes você gostaria " +
                "que te indicassemos hoje? Digite o número de acordo com o que você deseja:\n" +
                "1 – Horror\n" +
                "2 - Sci – fi\n" +
                "3 – Action\n" +
                "4 – Romance\n" +
                "5 - Comedy\n");

        String number_genero = teclado.nextLine();

        //Horror ----------------------------------------------
        if (number_genero.equals("1")) {

            midia_filmes.setTitulo("The call");
            midia_filmes.setAno(2020);
            midia_filmes.setGenero("Horror");
            fila_filmes.setDuracao(1.86);
            fila_filmes.setTipo("Longa metragem");
            fila_filmes.setDiretor("Lee Chung Hyeon");
            fila_filmes.setProdutor("Yong film");

            System.out.println("Gênero escolhido: " + midia_filmes.getGenero());
            System.out.println("Título: " + midia_filmes.getTitulo());
            System.out.println("Ano: " + midia_filmes.getAno());
            System.out.println("Duração: " + fila_filmes.getDuracao());
            System.out.println(fila_filmes.getTipo());
            System.out.println("Diretor: " + fila_filmes.getDiretor());
            System.out.println("Produzido por " + fila_filmes.getProdutor());

            String[] el = {"Park Shin Hye","Jeon Jong Seo","Lee El"};

            fila_filmes.setElenco(el);

            System.out.println("Elenco:");

            for (int c=0; c<=2; c++){
                System.out.println(el[c]);
            }
        }

        // Action ----------------------------------------------
        else if (number_genero.equals("2")) {

            midia_filmes.setTitulo("Jung_E");
            midia_filmes.setAno(2023);
            midia_filmes.setGenero("Sci - fi");
            fila_filmes.setDuracao(1.63);
            fila_filmes.setTipo("Longa metragem");
            fila_filmes.setDiretor("Yeon Sang Ho");
            fila_filmes.setProdutor("Climax studios");

            System.out.println("Gênero escolhido: " + midia_filmes.getGenero());
            System.out.println("Título: " + midia_filmes.getTitulo());
            System.out.println("Ano: " + midia_filmes.getAno());
            System.out.println("Duração: " + fila_filmes.getDuracao());
            System.out.println(fila_filmes.getTipo());
            System.out.println("Diretor: " + fila_filmes.getDiretor());
            System.out.println("Produzido por " + fila_filmes.getProdutor());

            String[] el = {"Kang Soo Yeon","Kim Hyun Joo","Ryu Kyun Soo"};

            fila_filmes.setElenco(el);

            System.out.println("Elenco:");

            for (int c=0; c<=2; c++){
                System.out.println(el[c]);
            }
        }

        // Sci-fi --------------------------------------------------
        else if (number_genero.equals("3")) {

            midia_filmes.setTitulo("Time to hunt");
            midia_filmes.setAno(2020);
            midia_filmes.setGenero("Action");
            fila_filmes.setDuracao(2.23);
            fila_filmes.setTipo("Longa metragem");
            fila_filmes.setDiretor("Yoon Sung Hyun");
            fila_filmes.setProdutor("Sidus Pictures");

            System.out.println("Gênero escolhido: " + midia_filmes.getGenero());
            System.out.println("Título: " + midia_filmes.getTitulo());
            System.out.println("Ano: " + midia_filmes.getAno());
            System.out.println("Duração: " + fila_filmes.getDuracao());
            System.out.println(fila_filmes.getTipo());
            System.out.println("Diretor: " + fila_filmes.getDiretor());
            System.out.println("Produzido por " + fila_filmes.getProdutor());

            String[] el = {"Lee Je Hoon","Ahn Jae Hong","Choi Woo Shiik"};

            fila_filmes.setElenco(el);

            System.out.println("Elenco:");

            for (int c=0; c<=2; c++){
                System.out.println(el[c]);
            }
        }

        //Romance --------------------------------------------
        else if (number_genero.equals("4")) {

            midia_filmes.setTitulo("20th century girl");
            midia_filmes.setAno(2022);
            midia_filmes.setGenero("Romance");
            fila_filmes.setDuracao(1.98);
            fila_filmes.setTipo("Longa metragem");
            fila_filmes.setDiretor("Bang Woo Ri");
            fila_filmes.setProdutor("Yong film");

            System.out.println("Gênero escolhido: " + midia_filmes.getGenero());
            System.out.println("Título: " + midia_filmes.getTitulo());
            System.out.println("Ano: " + midia_filmes.getAno());
            System.out.println("Duração: " + fila_filmes.getDuracao());
            System.out.println(fila_filmes.getTipo());
            System.out.println("Diretora: " + fila_filmes.getDiretor());
            System.out.println("Produzido por " + fila_filmes.getProdutor());

            String[] el = {"Kim Yoo Jung","Byu Woo Suk","Park Jung Woo"};

            fila_filmes.setElenco(el);

            System.out.println("Elenco:");

            for (int c=0; c<=2; c++){
                System.out.println(el[c]);
            }
        }

        //Comedy ---------------------------------------------
        else if (number_genero.equals("5")) {

            midia_filmes.setTitulo("Twenty");
            midia_filmes.setAno(2015);
            midia_filmes.setGenero("Comedy");
            fila_filmes.setDuracao(1.91);
            fila_filmes.setTipo("Longa metragem");
            fila_filmes.setDiretor("Lee Byeong Heon");
            fila_filmes.setProdutor("Sidus pictures");

            System.out.println("Gênero escolhido: " + midia_filmes.getGenero());
            System.out.println("Título: " + midia_filmes.getTitulo());
            System.out.println("Ano: " + midia_filmes.getAno());
            System.out.println("Duração: " + fila_filmes.getDuracao());
            System.out.println(fila_filmes.getTipo());
            System.out.println("Diretora: " + fila_filmes.getDiretor());
            System.out.println("Produzido por " + fila_filmes.getProdutor());

            String[] el = {"Kim Woo Bin","Lee Jun Ho","Kang Na Haeul"};

            fila_filmes.setElenco(el);

            System.out.println("Elenco:");

            for (int c=0; c<=2; c++){
                System.out.println(el[c]);
            }
        }
        //Outra digitação
        else {
            System.out.println("Desculpe, acho que você digitou o numero escolhido incorretamente.\n" +
                    "Verifique e tente novamente.");
        }

    }

}
