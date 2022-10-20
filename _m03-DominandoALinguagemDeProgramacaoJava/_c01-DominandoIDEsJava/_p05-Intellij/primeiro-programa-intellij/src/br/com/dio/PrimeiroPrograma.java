package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problemas dos três corpos", 300);
        System.out.println(livro1);
        /*int numero1 = 2;
        int numero2 = 3;
        System.out.println("Hello, World! " + (numero2 + numero1));*/

    }
}

class Livro{
    private String nome;
    private Integer numeroDePaginas;

    public Livro(String nome, Integer numeroDePaginas){
        this.nome = nome;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                '}';
    }
}