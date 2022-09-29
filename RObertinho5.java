package robertinho;

import java.util.Scanner;

public class RObertinho5 {
    
    public static void main(String[] args) {
        float x, resp;
        int i, inicio, fim;
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva o valor de x");
        x = in.nextFloat();
        
        System.out.println("Escreva o início");
        inicio = in.nextInt();
        
        System.out.println("Escreva o fim");
        fim = in.nextInt();
        
        for (i = inicio; i <= fim; i++) {
            resp = x * i;
            System.out.println(x + " x " + i + " = " + resp);
        }
        
    } 
}
