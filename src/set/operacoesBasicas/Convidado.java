package set.operacoesBasicas;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(int codigoConvite, String nome) {
        this.codigoConvite = codigoConvite;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Convidado{");
        sb.append("nome=").append(nome);
        sb.append(", codigoConvite=").append(codigoConvite);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.codigoConvite;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Convidado other = (Convidado) obj;
        return this.codigoConvite == other.codigoConvite;
    }

    




}
