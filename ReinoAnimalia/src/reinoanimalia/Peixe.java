
package reinoanimalia;


public class Peixe extends Animal {
    
    private String corEscama;
    
//Métodos Principais

    public void SoltarBolhas(){
        System.out.println("Emitindo Bolhas...");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("comendo dejetos marinhos");
    }

    @Override
    public void emitirSom() {
            System.out.println("Glub - Glub");
    }    

//GETTERS E SETTERS
    
    public String getCorEscama(){
        return this.corEscama;
    }
    
    public void setCorEscama(String cor){
        this.corEscama = cor;
    }


    
    
    
    
}
