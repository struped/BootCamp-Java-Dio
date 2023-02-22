package br.com.dio;

import br.com.dio.model.Gato;

public class FirstProgram {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro Livro = new Livro("O problema dos 3 corpos", 300);
        System.out.println(Livro);
           /* double a = 5;
            double b = 2;

            System.out.println("Hello World! " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPagina;

    public Livro(String nome, Integer numPagina) {
        this.nome = nome;
        this.numPagina = numPagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPagina=" + numPagina +
                '}';
    }

    public Integer getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(Integer numPagina) {
        this.numPagina = numPagina;
    }
}