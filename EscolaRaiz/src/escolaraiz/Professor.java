
package escolaraiz;


public class Professor extends Pessoa {
    
    private String especialidade;
    private float salario;
    
   
    
// METODOS PRINCIPAIS
    
    public void receberAumento(float aumento){
        
        this.setSalario(this.getSalario()+aumento);
    }
    

//GETTERS E SETTERS


    public String getEspecialidade(){
        return especialidade;
    }
    
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario){
        this.salario += salario;
    }
    
}
