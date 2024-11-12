package comandoscondicionais;
import java.util.Scanner;

public class votoidade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        if (idade >= 15) {
            System.out.println("Não pode votar!");

        } else if (idade >= 18 && idade <= 70) {
            System.out.println("voto obrigátorio!");

        } else {
            System.out.println("Voto facultativo");
        }
    }
}
