package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }
    public void exibirProdutos() {
        System.out.println(produtoSet);
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreço());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(1, "Produto A", 10.0, 5);
        cadastro.adicionarProduto(2, "Produto B", 20.0, 3);
        cadastro.adicionarProduto(3, "Produto C", 15.0, 8);
        
        System.out.println("Produtos cadastrados:");
        cadastro.exibirProdutos();
        
        System.out.println("\nProdutos ordenados por nome:");
        Set<Produto> produtosPorNome = cadastro.exibirProdutosPorNome();
        produtosPorNome.forEach(System.out::println);
        
        System.out.println("\nProdutos ordenados por preço:");
        Set<Produto> produtosPorPreco = cadastro.exibirProdutosPorPreco();
        produtosPorPreco.forEach(System.out::println);
    }
        

}
