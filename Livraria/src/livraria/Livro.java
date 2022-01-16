
package livraria;


public class Livro implements Publicacao {
    
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    

//MÉTODOS PRINCIPAIS
    
    public void detalhes(){
        System.out.println("Titulo: "+ this.getTitulo()+" de "+this.getAutor());
        System.out.println("Leitor: "+ this.getLeitor().getNome());
        
        if(getAberto()){
            System.out.println("Aberto na pagina "+this.getPagAtual()+"de um total"+this.getTotPaginas()+" paginas");
        }else {
            System.out.println("O livro está fechado");
        }
        
        
        
        
    }
    
// METODOS DA INTERFACE

 @Override
    public void abrir() {
        this.setAberto(true);
        this.setPagAtual(1);
        
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }
    

    @Override
    public void folhear(int pag) {
        this.setPagAtual(pag);
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }


//CONSTRUTOR
    public Livro(String titulo, String autor, int totPaginas, int pagAtual, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }
        

    
    
    
//GETTERS E SETTERS   

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

   
    
    
    
}
