import java.util.Scanner;
public class maior {
    public static void main(String[] args) {

        /**Construa um algoritmo que fa ̧ca a leitura de dois números inteiros e imprima no console  qual é o  menor e  o maior, se o primeiro ou o segundo. */

        int num1; 
        int num2;

        Scanner numeros =  new Scanner(System.in);

        System.out.println("Digite um número: ");
        num1 = numeros.nextInt();

        System.out.println("Digite outro número: ");
        num2 = numeros.nextInt();


        if(num1 > num2) {
            System.out.println("O maior número digitado foi: " + num1);
        } else if (num1 == num2) {
            System.out.println("Ambos os números são iguais");
        } else {
            System.out.println("O maior número digitado foi: " + num2);
        }

    }

}