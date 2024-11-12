
package comandoscondicionais;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para saber se ele é impar ou par: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("o número" + numero + "é par.");

        } else {
            System.out.println("o número" + numero + "é impar");
        }
    }
}
