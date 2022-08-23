import java.util.Scanner;
public class areaTrapezioRetag {
    public static void main (String[] args) {

        //Escreva um algoritmo em Java para realizar o calculo de  area de um trapézio retângulo.

        Scanner sc = new Scanner(System.in);

        float bMaior; 
        float bMenor;
        float  altura;
        float area; 

        System.out.println("Digite a base maior:");
        bMaior = sc.nextFloat();

        System.out.println("Digite a base menor: ");
        bMenor = sc.nextFloat();

        System.out.println("Digite a altura: ");
        altura = sc.nextFloat();

        area = ((bMaior * bMenor) * altura) /2;

        System.out.println("A área é = " + area);
    }
}