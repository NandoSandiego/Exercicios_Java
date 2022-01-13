/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadorcomjoptionpane;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author fxzkh
 */
public class ContadorComJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, soma = 0;
        int totValores = 0; 
        int totPares = 0;
        int totImpares = 0;
        int acima100 = 0;
        int media;
        
               
        do{
         
         num = Integer.parseInt(JOptionPane.showInputDialog(null,
                 "<html>Digite um número: <br><em>(valor '0' interrompe)<em></html>"));
        
         soma += num;
         totValores += 1;
         
            if(num % 2 == 0){
                totPares +=1;
            }else{
                totImpares += 1;
            }
            
            if(num > 100){
                acima100 +=1;
            }
            
        
                         
        }while (num != 0);
        
        media = soma/totValores;
        
        JOptionPane.showMessageDialog(null, "<html><hr>Soma:"+soma+ 
                "<br>Total de valores: "+totValores+
                "<br>Total de Pares: "+totPares+
                "<br>Total de Impares:"+totImpares+
                "<br>Acima de 100: "+acima100+
                "<br>Média: "+media+"</html>");
        
        
        
    }
    
}
