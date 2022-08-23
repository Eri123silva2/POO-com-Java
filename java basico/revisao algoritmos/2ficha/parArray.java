public class parArray {
    public static void main(String[] args) {

        /**Crie um algoritmo que preencha um Array com 100 numeros inteiros aleatoriamente e imprima os elementos numericos que sejam pares. */

        int [] array = new int[100];
        int aleatorio;

        

        for(int i = 0; i < array.length; i++) {
            aleatorio =  (int) (Math.random()*100);
            array[i] = aleatorio;

            if(array[i] % 2 ==0) {
                System.out.println(array[i]);
            }
        }



    }
}