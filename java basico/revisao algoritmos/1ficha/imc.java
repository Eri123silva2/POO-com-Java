import java.util.Scanner;
public class imc {
    public static void main(String[] args) {

      /*Crie um algoritmo em Java para realizar o calculo de IMC. A sa ́ıda do algoritmo deve ser o valor do IMC no console (e.g. ”O valor do seu IMC  ́e ”). A formula é: IMC = peso / (altura^2)  */

      Scanner ac= new Scanner(System.in);

      float imc;
      float altura;
      float peso;

      System.out.println("Insira seu peso em Kg: ");
      peso = ac.nextFloat();

      System.out.println("Insira sua altura: ");
      altura = ac.nextFloat();

      imc = (peso / (altura* altura));

      System.out.printf("Seu imc é  = %.2f  %n", imc);

      if(imc <= 18.5) {
        System.out.print("Você está abaixo do peso.");
      } else if(imc <=24.9) {
        System.out.print("Parabéns! Você está no peso ideal!");
      } else if ( imc<= 29.9) {
        System.out.print("Você está com sobrepeso.");
      } else if (imc <= 34.9) {
        System.out.print("Você está com obesidade grau I.");
      } else if (imc <= 39.9) {
        System.out.print("Você está com obesidade grau II.");
      } else if (imc > 40) {
        System.out.print("Você está com obesidade grau III.");
      }
    }
}