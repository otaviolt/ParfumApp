package br.com.etecia.parfumapp;

public class PerfumeLacrado {
    private String titulo;
    private int imagem;

    //construtor da classe

    public PerfumeLacrado(String titulo, int imagem) {
        this.titulo = titulo;
        this.imagem = imagem;
    }

    //métodos de acesso get e set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
