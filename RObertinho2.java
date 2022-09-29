package robertinho;

import java.util.Scanner;

public class RObertinho2 {
    
   public static void main(String[] args) {
        float x, r;
        String resp;
        resp = "sim";
        Scanner in = new Scanner(System.in);
        
        while (resp.equalsIgnoreCase("sim")) {
            System.out.println("Digite o valor de x");
            x = in.nextFloat();
            
            r = x * 3;
            
            System.out.println("O valor de r é: " + r);
            System.out.println("Deseja continuar? (sim/não)");
            resp = in.next();
        }
    } 
   
}
