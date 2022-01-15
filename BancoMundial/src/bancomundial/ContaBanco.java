
package bancomundial;


public class ContaBanco {
    
    
    
    private String dono;
    protected String tipoConta;
    public int numConta;
    private float saldo;
    private boolean aberta;
    
//MÉTODO CONSTRUTOR

    public ContaBanco(String dono, String tipoConta) {
        this.dono = dono;
        this.tipoConta = tipoConta;
        this.aberta = false;
        this.saldo = 0;
        //int numcont =(int) Math.random();
        //this.setNumConta(numcont);
        
        if(this.tipoConta == "CP"){
            this.saldo =+150;
        }else{
            this.saldo =+50;
        }
    }
    

//Status
    
    void status(){
        System.out.println("---------------------");
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Tipo: "+ this.getTipoConta());
        System.out.println("Saldo: "+ this.getSaldo());
        System.out.println("Esta aberta: "+this.getAberta());
        System.out.println("---------------------");
    }
    
//METODOS GETTERS E SETTERS

    public String getDono()  {
        return this.dono;
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
    
    
    
//MÉTODOS PRINCIPAIS
    
    void abrirConta(String tipo){
        if(this.getAberta()){
            System.out.println("A conta já está aberta");
        }else{
            
            this.setAberta(true);
            System.out.println("Abrindo a conta. . . ");
            if(tipo == "CC"){
                this.setSaldo(this.getSaldo()+70);
            }else if (tipo == "CP"){
                this.setSaldo(this.getSaldo()+120);
            }
        }
        
    }
    
    void fecharConta(){
        if(this.getSaldo() < 0){
            System.out.println("Voce está com saldo negativo");
            
            
        } else if (this.getSaldo() ==  0) {
            System.out.println("Fechando a conta . . . ");
            this.setAberta(false);
        } else{
            System.out.println("Voce ainda possui dinheiro no banco");
        }
    }
       
    void depositar(float deposito){
      
        if(this.getAberta()){
        this.setSaldo(this.getSaldo() + deposito);
        } 
    }
    
    void sacar(float deposito){
        if(getAberta()&& this.getSaldo()>deposito ){
        this.setSaldo(this.getSaldo() - deposito);
        } else{
            System.out.println("Saldo indisponível");
        }
    }
    
    void pagarMensal(){
        
        if(this.getTipoConta()=="CP"){
            this.setSaldo(this.getSaldo() - 12);
        }else if (this.getTipoConta() == "CC"){
            this.setSaldo(this.getSaldo() - 20);
        }
        
        
        
        
        
        
    }
    
    
    
    
    
}
