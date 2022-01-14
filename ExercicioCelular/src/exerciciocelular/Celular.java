
package exerciciocelular;


public class Celular {
    String marca;
    String cor = "Prata";
    int porcentagem = 25;
    boolean ligado;
    
    void ligar(){
        if(ligado){
            System.out.println("Celular já ligado");
        }else{
            System.out.println("Ligando celular");
        }
        
    }
    
    void desligar(){
        if(ligado){
            System.out.println("Pressione desligar");
        }else{
            System.out.println("Desligando celular...");
        }        
    }
    
    void carregar(){
        for(int c = porcentagem; c<100;c+=1){
            porcentagem = + c;
            System.out.println(porcentagem);
        }    
    }
    
    void usarAp(){
        if(ligado && porcentagem>1){
            System.out.println("Usando Apps");
        }
        
    }
    
    void status(){
        System.out.println("----------");
        System.out.println(marca);
        System.out.println("Cor: "+cor);
        System.out.println(porcentagem+"%");
        System.out.println(ligado);
        System.out.println("---------");
        
    }
    
    
    
}
