package youtubeexercicio;

public class Gafanhoto extends Pessoa   {
    
    
    private String login;
    private int totAssistido = 0 ;
    

//Métodos Principais


    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()  +1);
    }


//GETTERS E SETTERS
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    
    
    
}
