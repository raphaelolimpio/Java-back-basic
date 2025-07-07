package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
       
    }

    public List<Pessoa> ordenarPorNome() {
        List<Pessoa> pessoasPorNome = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorNome, (p1, p2) -> p1.getNome().compareTo(p2.getNome()));
        return pessoasPorNome;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacao = new OrdenacaoPessoa();
        ordenacao.adicionarPessoa("Murilo", 30, 1.75);
        ordenacao.adicionarPessoa("Ana", 25, 1.65);
        ordenacao.adicionarPessoa("Carlos", 28, 1.80);
        ordenacao.adicionarPessoa("Beatriz", 22, 1.70);
        ordenacao.adicionarPessoa("Daniel", 35, 1.90);

        System.out.println(ordenacao.ordenarPorIdade());
        System.out.println(ordenacao.ordenarPorAltura());
        System.out.println(ordenacao.ordenarPorNome());
        System.out.println(ordenacao.pessoaList);
        
    }
}
