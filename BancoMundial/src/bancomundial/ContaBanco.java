
package bancomundial;


public class ContaBanco {
    
    
    
    String dono,tipoConta;
    int numConta;
    float saldo;
    boolean aberta;
    
//MÉTODO CONSTRUTOR

    public ContaBanco(String dono, String tipoConta) {
        this.dono = dono;
        this.tipoConta = tipoConta;
        this.setAberta(false);
        int numcont =(int) Math.random();
        this.setNumConta(numcont);
    }
    
    
    
//METODOS GETTERS E SETTERS

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
    
    
    
    
}
