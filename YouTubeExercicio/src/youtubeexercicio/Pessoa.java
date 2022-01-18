package youtubeexercicio;

public class  Pessoa {
    
    protected String pessoa;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    
    
//Métodos Principais

    protected void ganharExperiencia(){
        this.setExperiencia(this.getExperiencia()+1);
    }
    
//GETTERS E SETTERS

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
    
    
    
    
}
