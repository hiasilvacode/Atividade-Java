import java.util.Scanner;

public class tresnumerosmaiores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = entrada.nextInt();

        System.out.println("Digite um numero: ");
        int numero2 = entrada.nextInt();

        System.out.println("Digite um numero: ");
        int numero3 = entrada.nextInt();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("o menor número é" + numero3);

        } else if (numero2 > numero1 && numero2 > numero2){
            System.out.println("o menor numero é" + numero2);


        } else if (numero3 > numero1 && numero3 > numero1) {
            System.out.println("o menor é" + numero1);


        } else if (numero1 > numero2 && numero2 > numero3) {
          System.out.println("os numeros são iguais.");
        }


    }
}
