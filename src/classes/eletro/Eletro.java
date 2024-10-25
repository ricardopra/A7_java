package src.classes.eletro;

import src.classes.produto.Produto;

public class Eletro extends Produto {
    private String fabricante;

    public Eletro(String nome, double preco, int codigo, String fabricante) {
        super(nome, preco, codigo);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Eletro [nome=" + getNome() + ", preco=" + preco + ", codigo=" + getCodigo() + ", fabricante=" + fabricante + "]";
    }
}
