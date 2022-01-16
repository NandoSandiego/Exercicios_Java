
package escolaraiz;


public class Aluno extends Pessoa {
    
    private int matricula;
    private float mensalidade;
    private String curso;
    

    
//METODOS PRICIPAIS

    public void pagarMenssalidade(float mens){
        this.mensalidade +=mens;        
    }
    

//GETTERS E SETTERS 

    
    public int getMatricula(){
        return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
}
