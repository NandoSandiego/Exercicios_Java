package youtubeexercicio;

public class Visualizacao {
    
    private Gafanhoto espectador;
    private Video filme;

//Classes Principais
    
    public void avaliar(){
        this.filme.setAvaliacao((5));
    }
    
    public void avaliarNota(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliarNota(float porc){
        int tot = 0;
        
        if(porc <= 20){
            tot = 3;
        } else if(porc<=50){
            tot = 5;
        }else if(porc <=80){
            tot = 8;
        }else{
            tot = 10;
        }
        
        this.filme.setAvaliacao(tot);
    }
    

// GETTERS E SETTERS

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    
    
}
