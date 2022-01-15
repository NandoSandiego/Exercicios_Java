/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancomundial;

/**
 *
 * @author fxzkh
 */
public class BancoMundial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco cliente1 = new ContaBanco("Nando", "CC");
        
        System.out.println(cliente1.getNumConta());
    }
    
}
