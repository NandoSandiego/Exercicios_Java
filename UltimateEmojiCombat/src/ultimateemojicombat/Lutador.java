
package ultimateemojicombat;


public class Lutador {
    
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //Métodos
    
    //CONSTRUTOR

    public Lutador(String no, String na, 
            int id,float al, float pe, 
            int vi, int de, int em) {
        
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
        
              
        
    }
    
    
    //MÉTODOS PRINCIPAIS
    
    public void apresentar(){
        System.out.println("-----------");
        System.out.println("E com vocês!!!"+ this.getNome());
        System.out.println("Direto do "+ this.getNacionalidade());
        System.out.println("Pesando "+this.getPeso()+" Kg pela categoria "+ this.getCategoria() );
        System.out.println(" Com "+this.getVitorias()+" vitórias, "+this.getDerrotas()+
                " derrotas e "+this.getEmpates()+" empates");
        System.out.println("----------------");
    }
    
    public void status(){
        System.out.println(this.getNome()+", do "+this.getNacionalidade());
        System.out.println("Vitorias: "+this.getVitorias()+" Derrotas: "+this.getDerrotas()+" e "+this.getEmpates()+" empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    
    //GETTERS E SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
        
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        
        
        if(this.peso<52.2){
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3){
            this.categoria="Leve";
        } else if(this.peso <= 80.3){
            this.categoria = "Medio";
        } else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
        
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
}
