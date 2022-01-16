/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ultimateemojicombat;

/**
 *
 * @author fxzkh
 */
public class UltimateEmojiCombat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lutador lutador[] = new Lutador[6];
        
        lutador[0] = new Lutador("Alexuz", "Narnia", 112, 1.64f, 60.4f, 5, 3, 1);
        lutador[1] = new Lutador("Marmoro", "Pluto", -5, 3.54f, 64.3f, 3, 7, 1);
        lutador[2] = new Lutador("Arqna", "Laketony", 45, 1.64f, 77.5f, 1, 0, 0);
        lutador[3] = new Lutador("Ako", "Zyon", 3332, .75f, 80f, 8, 7, 3);
        lutador[4] = new Lutador("Strain", "Takeshy", 54, 1.99f, 99.9f, 3, 1, 3);
        lutador[5] = new Lutador("Repto", "Troglo", 32, 3.5f, 110.1f, 0, 0, 0);
        
        Luta luta001 = new Luta();
        luta001.marcarLuta(lutador[0], lutador[1]);
        
        lutador[0].status();
        lutador[1].status();
        
        luta001.lutar();
        
        
        
        
        
       
        
    }
    
}
