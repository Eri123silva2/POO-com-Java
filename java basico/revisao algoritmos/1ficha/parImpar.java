import java.util.Scanner;
public class parImpar{
     public static void main (String[] args) {

          //Elabore um algoritmo em Java para identificar se um número  ́e par ou  ́ımpar.
        
          int num;

          Scanner verificar = new Scanner(System.in);

          System.out.println("Digite um número inteiro: ");
          num = verificar.nextInt();

          if(num % 2 == 0) {
               System.out.println(num + " é par!");
          } else {
               System.out.println(num + " é impar!");
          }
        
     }
} 