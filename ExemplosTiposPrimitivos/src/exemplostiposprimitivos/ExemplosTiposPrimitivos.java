/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplostiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author fxzkh
 */
public class ExemplosTiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String nome = new String();
        float media;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        nome = teclado.nextLine();
       
        System.out.print("Digite a 1º nota: ");
        Float nota_1 = teclado.nextFloat();
        System.out.print("Digite a 2º nota: ");
        Float nota_2 = teclado.nextFloat();
        media = (nota_1 + nota_2)/2;
        
        System.out.println("A MEDIA de "+ nome+" é "+ media);
          
                
        
        
        
        
        
        
        
    }
    
}
