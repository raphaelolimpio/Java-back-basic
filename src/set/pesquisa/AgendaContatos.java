package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
            System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
       Set<Contato> contatoPorNome = new HashSet<>();
       for(Contato c : contatoSet) {
           if(c.getNome().startsWith(nome)) {
               contatoPorNome.add(c);
           }
       }
       return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Alice", 123456789);
        agenda.adicionarContato("Bob", 987654321);
        agenda.adicionarContato("Alice", 123456789);
        agenda.adicionarContato("Bob", 987654321);
        agenda.adicionarContato("Charlie", 555555555);

        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();

        System.out.println("\nPesquisando contatos com nome começando por 'A':");
        Set<Contato> contatosEncontrados = agenda.pesquisarPorNome("A");
        System.out.println(contatosEncontrados);

        System.out.println("\nAtualizando número do contato 'Alice' para 111111111:");
        Contato contatoAtualizado = agenda.atualizarNumeroContato("Alice", 111111111);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("\nContatos na agenda após atualização:");
        agenda.exibirContatos();
    }

}


