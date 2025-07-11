package map.ORDENACAO;

public class Evento {

    private String nomeEvento;
    private String atracao;

    public Evento(String nomeEvento, String atracao) {
        this.nomeEvento = nomeEvento;
        this.atracao = atracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento [nomeEvento=" + nomeEvento + ", atracao=" + atracao + "]";
    }
    
    

}
