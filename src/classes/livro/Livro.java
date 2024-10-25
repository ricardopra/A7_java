package src.classes.livro;

import src.classes.produto.Produto;

public class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, int codigo, String autor) {
        super(nome, preco, codigo);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro [nome=" + getNome() + ", preco=" + preco + ", codigo=" + getCodigo() + ", autor=" + autor + "]";
    }
}
