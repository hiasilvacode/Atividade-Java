package comandoscondicionais;
import java.util.Scanner;

public class DoisNumerosMaiores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        float numero = entrada.nextFloat();

        System.out.println("Digite o segundo numero: ");
        float numero1 = entrada.nextFloat();

        if (numero > numero1){
            System.out.println(numero + "é maior que");

            }   else if (numero > numero1){
            System.out.println(numero1 + "é maior que" + numero);

        } else {
            System.out.println(numero + "e" + numero1 + "são iguais");
        }
        }
    }

