public class quantImparesEpares {
    public static void main (String[] args) {

        /**Crie um algoritmo que preencha um Array com 100 números inteiros aleatoriamente e  realize os calculo de quantos impares e pares há no array.*/

        int aleatorio;
        int pares = 0;
        int impares = 0; 
        int [] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            aleatorio = (int) (Math.random()*100);
            array[i] = aleatorio;

            if(array[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Há " + pares + " pares no array e " + impares + " impares!");

    }
}