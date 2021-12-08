package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args){
        Gato gato = new Gato();

        System.out.println(gato);

        Livros livros1 = new Livros("Manual do futebol americano",385);
        System.out.println(livros1);
//        int a = 5;
//        int b = 3;
//        System.out.println("hello world!"+ (a+b));


    }
    static class Livros{

        private String nome;
        private int npag;

        public Livros(String nome, int npag) {
            this.nome = nome;
            this.npag = npag;

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getNpag() {
            return npag;
        }

        public void setNpag(String npag) {
            this.npag = Integer.parseInt(npag);
        }

        @Override
        public String toString() {
            return "Livros{" +
                    "nome='" + nome + '\'' +
                    ", npag='" + npag + '\'' +
                    '}';
        }
    }
}
