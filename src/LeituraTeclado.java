package src;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome abixo");
        String next = input.nextLine();
        System.out.println(next);
        System.out.println("Digite sua idade");
        int idade = input.nextInt();
        System.out.println("Qual teu sexo");
         char sex = input.next().charAt(0);


        System.out.println(next + idade + sex);
        
    }

}
