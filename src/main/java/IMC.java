package comandoscondicionais;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso");
        float peso = entrada.nextFloat();

        System.out.println("Digite o seu altura");
        float altura = entrada.nextFloat();

       float imc = peso/(altura*altura);
       System.out.println("IMC: " + imc);

       if (imc <= 18.5) {
           System.out.println("Abaixo do peso");

       } else if (imc >= 18.5 && imc <= 24.9) {
           System.out.println("Peso ideal");
       } else if (imc >= 25 && imc <= 29.9) {
           System.out.println("Obesidade Igual");
       }else if (imc >= 30 && imc <= 39.9) {
           System.out.println("Obesidade Obesidade Igual");

       } else if (imc >= 40 && imc <= 49.9) {
           System.out.println("Obesidade Obesidade 2");

       } else {
           System.out.println("Obesidade Obesidade 3");
       }

    }
}
