package Classes;

public class Main {
         public static class Midia{
            String titulo;
            int ano;
            String genero;

             public Midia(String titulo, int ano, String genero) {
                 this.titulo = titulo;
                 this.ano = ano;
                 this.genero = genero;
             }

             public String getTitulo() {
                 return titulo;
             }

             public void setTitulo(String titulo) {
                 this.titulo = titulo;
             }

             public int getAno() {
                 return ano;
             }

             public void setAno(int ano) {
                 this.ano = ano;
             }

             public String getGenero() {
                 return genero;
             }

             public void setGenero(String genero) {
                 this.genero = genero;
             }
         }

//    public static void main(String[] args) {
//        musicaEscolhida = new Musica("Rush Hour");
//        artistaReferente = new Artista();
//
//
//        System.out.println("Olá, escolha a musica" + musicaEscolhida.titulo);
//        }
}