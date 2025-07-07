package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(int codigoConvite, String nome) {
        convidadoSet.add(new Convidado(codigoConvite, nome));
    }

    public void removerConvidado(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidado conjunto = new ConjuntoConvidado();

        System.out.println("Total de convidados: " + conjunto.contarConvidados());

        conjunto.adicionarConvidado(1, "Alice");
        conjunto.adicionarConvidado(2, "Bob");
        conjunto.adicionarConvidado(3, "Charlie");
        conjunto.adicionarConvidado(4, "Diana");
        conjunto.adicionarConvidado(5, "Eve");
        System.out.println("Total de convidados: " + conjunto.contarConvidados());

        conjunto.removerConvidado(2);
        System.out.println("Total de convidados: " + conjunto.contarConvidados());

        conjunto.exibirConvidados();
    }

}
