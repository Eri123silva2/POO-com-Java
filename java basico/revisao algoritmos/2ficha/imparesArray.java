public class imparesArray {
    public static void main (String[] args) {

        /**Crie um algoritmo que preencha um Array com 100 números inteiros aleatoriamente e imprima os elementos numericos que sejam  ́ımpares. */
        
        int [] arrayNumeros = new int[100];
        
        int aleatorio;

        for(int i = 0; i < 100; i++) {
            aleatorio = (int) (Math.random()*100);
            arrayNumeros[i] = aleatorio;

            if(arrayNumeros[i] % 2 != 0) {
                System.out.println(arrayNumeros[i]);
            }
        }

    }
}