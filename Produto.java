package Aula01;

import java.util.ArrayList;

public class Produto {
    String nome;
    float preco;
    String descricao;

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "Celular";
        produto1.preco = 999.99f;
        produto1.descricao = "Smartphone top de linha";

        Produto produto2 = new Produto();
        produto2.nome = "Notebook";
        produto2.preco = 1999.99f;
        produto2.descricao = "Notebook com alta performance";

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        System.out.println("Lista de produtos:");
        for (Produto produto : listaProdutos) {
            System.out.println("Nome: " + produto.nome);
            System.out.println("Preço: " + produto.preco);
            System.out.println("Descrição: " + produto.descricao);
            System.out.println();
        }
    }
}