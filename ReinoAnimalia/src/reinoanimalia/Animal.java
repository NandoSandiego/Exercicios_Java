
package reinoanimalia;

public abstract class Animal {
    
    private float peso;
    private int idade;
    private int membros;
    

//MÉTODOS PRINCIPAIS

    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    
    
    
//METODOS GETTERS E SETTERS 

    public float getPeso(){
        return this.peso;
    }
    
    public void setPeso(int pe){
        
        this.peso = pe;
        
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int id){
        this.idade = id;
    }
    
    public int getMembros(){
        return this.membros;
    }
    
    public void setMembros(int me){
        this.membros = me;
    }
    
}
