package youtubeexercicio;

public class Video implements AcoesVideos {
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
  
    
    
//  Metodos Principais
       @Override
    public void play() {
        if(this.getReproduzindo()){
            System.out.println("reproduzir video");
        }
    }

    @Override
    public void pause() {
            
        if(!this.getReproduzindo()){
            System.out.println("Pausar o video");
        }
        
    }

    @Override
    public void like() {
        
        this.setCurtidas(this.getCurtidas()+1);
        
        
    }
       
    
    
    
//GETTERS E SETTERS

    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String tit){
        this.titulo = tit;
    }
    
    public int getAvaliacao(){
        return this.avaliacao;
    }
    
    public void setAvaliacao(int av){
        this.avaliacao = av;
    }
    
    public int getViews(){
        return this.views;
    }
    
    public void setViews(int vi){
        this.views = vi;
    }
    
    public int getCurtidas(){
        return curtidas;
    }
    
    public void setCurtidas(int curt){
        this.curtidas = curt;
    }
    
    public boolean getReproduzindo(){
        return reproduzindo;
   }
    
    public void setReproduzindo(boolean rep){
        this.reproduzindo = rep;
    }

      
    
}
