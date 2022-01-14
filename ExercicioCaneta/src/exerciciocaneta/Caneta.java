
package exerciciocaneta;


public class Caneta {

    public String modelo;
    private float ponta;

//Método CONSTRUTOR

    public Caneta(String modelo, int ponta) {
        this.modelo = "Bic Crystal";
        this.ponta = 0.4f;
    }
    
    
//Metodos GETTERS e SETTERS

    public  String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }
    
    
    
}
