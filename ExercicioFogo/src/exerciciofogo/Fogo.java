package exerciciofogo;

public class Fogo {
    
    String cor = "vermelho";
    int intensidade =50 ;
    boolean aceso = true;
    
    void ApagarFogo(){
        if(aceso && intensidade != 0){
            aceso = false;
            intensidade =0;
        }
    }
    void AumentarIntensidade(){
        intensidade+=5;
    }
    
    void DiminuirIntensidade(){
        intensidade-=5;
    }
    
    void Status(){
        System.out.println("-------");
        System.out.println("Cor: "+ cor);
        System.out.println("Aceso: "+aceso);
        System.out.println("Intensidade: "+ intensidade);
    }
    
    
    
}
