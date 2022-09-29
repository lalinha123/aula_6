package robertinho;

import java.util.Scanner;

public class RObertinho {

    public static void main(String[] args) {
        float nota1, nota2, media;
        int cont;
        cont = 1;
        Scanner in = new Scanner(System.in);
        
        while (cont <= 10) {
            System.out.println("Digite a nota do " + cont + "° aluno");
            nota1 = in.nextFloat();
            System.out.println("Insira a segunda nota");
            nota2 = in.nextFloat();

            media = (nota1 + nota2)/2;
            cont++;

            System.out.println("A média do aluno é: " + media);
        }
    }
    
}
