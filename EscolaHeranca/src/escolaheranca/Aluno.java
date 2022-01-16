
package escolaheranca;


public class Aluno extends Pessoa {
    
    private int matricula;
    private String curso;
   

// MÉTODOS PRINCIPAIS
    
    public void cancelarMatricula(){
        
        System.out.println("Matricula Cancelada");
    }
    
    
//GETTERS E SETTERS
    
    public int getMatricula(){
            return matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public String setCurso(){
        return curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
}
