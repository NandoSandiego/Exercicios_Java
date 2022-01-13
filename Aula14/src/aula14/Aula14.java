/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author fxzkh
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        
       // System.out.println("Digite um numero: ");
        //int val = teclado.nextInt();
        
        //int num[] = new int[val];
        int num[] ={2,6,-4,2};
        
        int p = Arrays.binarySearch(num, 2);
        
        System.out.println(p);
      
    }
    
}
