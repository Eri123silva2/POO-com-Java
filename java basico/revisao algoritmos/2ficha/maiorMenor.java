public class maiorMenor {
    public static void main(String[] args) {

        /**Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima o maior e menor elemento. */


        int aleatorio, maior, menor;
        int [] array = new int [100];

        maior = array[0];
        menor =  array.length -1;


        for(int i = 0; i < array.length; i++) {
            aleatorio = (int) (Math.random()*100);
            array[i] = aleatorio;

            //maior:
            System.out.println(array[i]);

           if(array[i] > maior) {
            maior = array[i];
           }

           //menor:
           if( array[i] < menor) {
            menor = array[i];
           }
        
        }

        System.out.println("O maior elemento do array é: " + maior + "!\n E o menor é : " + menor+"!");
    }
}
