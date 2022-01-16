
package escolaheranca;


public class Funcionario extends Pessoa{
    
    
    private String setor;
    private boolean trabalhando;
    
    
    

//MÉTODOS PRINCIPAIS

    public void mudarSetor(String setor){
        this.setSetor(setor);
    }
    
    
//GETTERS E SETTERS
    
    public String getSetor(){
        return setor;
    }
    
    public void setSetor(String setor){
        this.setor = setor;
    }
    
    public boolean getTrabalhando(){
        return trabalhando;
    }
    
    public void setTrabalhando(boolean trabalhando){
        this.trabalhando = trabalhando;
    }
    
    
}
