
package ultimateemojicombat;

import java.util.Random;


public class Luta {
   //Atributos
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    //Métodos Principais
    
    public void marcarLuta(Lutador lutador1, Lutador lutador2 ){
        
        
            if(lutador1 != lutador2){
                 this.setAprovada(true);
                 
                 this.desafiado = lutador1;
                 this.desafiante = lutador2;
            } else {
                this.setAprovada(false);
                this.desafiado = null;
                this.desafiante = null;
            }
        
        
    }
    
    public void lutar(){
        
        if(this.getAprovada()){
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            
            //int vencedor = (int)  Math.random()*(1-2);
            
            Random alea = new Random();
            int vencedor = alea.nextInt(3); 
            
            switch (vencedor){
                case 0: //Empate 
                    System.out.println("Empatou!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                case 1: 
                    System.out.println(this.getDesafiado().getNome()+" GANHOU A LUTA!!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 2:
                    System.out.println(this.getDesafiante().getNome()+" GANHOU A LUTA!!!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                    
            }
            
            
        }else{
            System.out.println("Luta nao pode acontecer...");
        }
        
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
