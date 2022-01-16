
package escolaraiz;


public class Bolsista extends Aluno{
    
    private float bolsa;
    
//METODOS PRICIPAIS
    
     public void renovarBolsa(float bolsa){
         this.setBolsa(this.getBolsa() +bolsa);
         System.out.println("Bolsa renovada");
     }
     
     
     @Override
     public void pagarMensalidade(float mens){
         
         this.setBolsa(this.getBolsa() - mens);
     }
     

//GETTERS E STTERS

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    
}
