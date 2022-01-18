
package reinoanimalia;


public class Ave extends Animal {
    
    private String corPena;
    
    



//Métodos Principais
    @Override
    public void locomover() {
        System.out.println("Andando pelas patas");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    
//GETTERS E SETTERS    
    
    public String getCorPena(){
        return this.corPena;
    }
    
    public void setCorPena(String cor){
        this.corPena = cor;
    }
    
}
