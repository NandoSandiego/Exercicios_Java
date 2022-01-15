
package exerciciocontroleremoto;

public class ControleRemoto implements Controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
//METODO CONSTRUTOR

    public ControleRemoto()  {
        this.setTocando(false);
        this.setLigado(false);;
        this.setVolume(50);
    }
    
//MÉTODOS GETTERS E SETTERS

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
//MÉTODOS ESPECIAIS

    @Override
    public void ligar(){
        this.setLigado(true);
        System.out.println("TV ligando...");
    }
    
    @Override
    public void desligar(){
        this.setLigado(false);
        
    }
    
    public void abrirMenu(){
        if(this.getLigado()){
            System.out.print("Volume: "+ this.getVolume());
            
          
           for(int c = 1; c <= this.volume ; c+=10){
                System.out.print("|||");
            }
            
        }
        
    } 
    
    @Override
    public void fecharMenu(){
        if(this.getLigado()){
            System.out.println("Fechando menu");
        }
        
    }
    
    @Override
    public void maisVolume(){
        this.setVolume(getVolume() +5);
    }
    
    @Override
    public void menosVolume(){
        this.setVolume(this.getVolume() - 5);
        
    }
    @Override
    public void ligarMudo(){
        
        if(this.getVolume()> 0 && this.getLigado()){
            this.setVolume(0);
        }
        
    }
    @Override
    public void desligarMudo(){
        if(this.getVolume() == 0 && this.getLigado()){
            this.setVolume(50);
        }
    }
    
    public void play(){
        if(this.getLigado() && ! (this.getTocando())){
            this.setTocando(true);
        }
        
    }
    
    public void pause(){
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
        
    }

    
    
    
    
}
