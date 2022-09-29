package robertinho;

import java.util.Scanner;

public class RObertinho4 {
    
    public static void main(String[] args) {
        float x, r = 0;
        String resp;
        Scanner in = new Scanner(System.in);
        
        do{
            System.out.println("Digite o valor de x");
            x = in.nextFloat();
            
            if (x%2 == 0) {
               r += x; 
            }
            
            System.out.println("Deseja continuar? (sim/não)");
            resp = in.next();
        } while (resp.equalsIgnoreCase("sim"));
        
        System.out.println("A soma dos números pares é: " + r);
        
    } 
}
