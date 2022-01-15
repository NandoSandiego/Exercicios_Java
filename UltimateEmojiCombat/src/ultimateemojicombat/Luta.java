
package ultimateemojicombat;


public class Luta {
   //Atributos
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    //Métodos Principais
    
    public void marcarLuta(){
        if(getDesafiado().getCategoria() == getDesafiante().getCategoria()){
            this.setAprovada(true);
        }
        
    }
    
    public void lutar(){
        
    }
    
    
    //Construtor

    public Luta() {
        this.rounds = 0;
        this.aprovada = false;
    }
    
    //Getters e Setters

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
    
    
    
    
} 
