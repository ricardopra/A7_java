import src.classes.livro.Livro;
import src.classes.eletro.Eletro;
import src.classes.produto.Produto;

public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];

        produtos[0] = new Livro("Java Básico", 59.90, 101, "John Doe");
        produtos[1] = new Livro("Estruturas de Dados", 79.90, 102, "Jane Doe");
        produtos[2] = new Eletro("Notebook", 2999.90, 201, "Dell");
        produtos[3] = new Eletro("Smartphone", 1999.90, 202, "Samsung");
        produtos[4] = new Livro("Algoritmos", 89.90, 103, "Martin Fowler");

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
