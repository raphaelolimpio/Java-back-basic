package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }  
        } 
        return livrosPorAutor; 
    }

    public List<Livro> pesquisaPorInervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }  
        } 
        return livrosPorIntervalo; 
    }


    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }  
        } 
        return livroPorTitulo; 
    }
    public static void main(String[] args) {

    CatalogoLivros catalogo = new CatalogoLivros();

    catalogo.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
    catalogo.adicionarLivro("1984", "George Orwell", 1949);
    catalogo.adicionarLivro("A Revolução dos Bichos", "George Orwell", 1945);
    catalogo.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);

    System.out.println(catalogo.pesquisarPorAutor("George Orwell"));
    System.out.println(catalogo.pesquisaPorInervaloAnos(1930, 1950));
    System.out.println(catalogo.pesquisarPorTitulo("O Hobbit"));

    }
}
