/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritméticos;

import java.util.Scanner;

/**
 *
 * @author fxzkh
 */
public class OperadoresAritméticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1,num2, soma, sub,div,mul,res;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num1 = teclado.nextFloat();
        System.out.print("Digite outro número: ");
        num2 = teclado.nextFloat();
        soma = num1 + num2;
        sub = num1  - num2;
        mul = num1*num2;
        div = num1/num2;
        res = num1 % num2;
        System.out.println("Soma:"+soma);
        System.out.println("Subtração:"+sub);
        System.out.println("Multiplicação:"+mul);
        System.out.println("Divisão:"+div);
        System.out.println("Resto:"+res);
        
        
        
        
        
    }
    
}
