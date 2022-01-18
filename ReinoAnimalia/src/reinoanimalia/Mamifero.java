
package reinoanimalia;


public  class Mamifero extends Animal{
    
    private String corPelo;

    
//Métodos Principais    
    
    @Override
    public void locomover() {
        System.out.println("Andando ;;;");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo carne");
    }

    @Override
    public void emitirSom() {
            System.out.println("Som de Mamifero");
    }
    
    
//GETTERS E SETTERS     
    
    public String getCorPelo(){
        return this.corPelo;
    }
    
    public void setCorPelo(String cor){
        this.corPelo = cor;
    }
    
}
