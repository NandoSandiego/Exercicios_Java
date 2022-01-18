
package reinoanimalia;


public class Reptil extends Animal{
    
    private String corEscama;

//Métodos Principais    
    
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de réptil");
    }
    
    public String getCorEscama(){
        return this.corEscama;
    }
    
    public void setCorEscama(String cor){
        this.corEscama = cor;
    }
    
}
