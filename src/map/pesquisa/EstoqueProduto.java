package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProduto() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome,  int quantidade, double preco) {
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }

        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MAX_VALUE;
        if(!estoqueProdutoMap.isEmpty()){
            for(Produto p : estoqueProdutoMap.values()){
                if(p.getPreco() > maiorPreco){
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
            
        }
        return produtoMaisCaro;
    }
    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.adicionarProduto(1L, "Produto 1", 10, 5.99);
        estoque.adicionarProduto(2L, "Produto 2", 15, 3.49);
        estoque.adicionarProduto(3L, "Produto 3", 20, 2.99);
        estoque.exibirProdutos();
        double valorTotal = estoque.calcularValorTotalEstoque();
        System.out.println("Valor total do estoque: " + valorTotal);
    }

}
