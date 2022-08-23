public class ordemInversa {
    public static void main (String[] args) {

        /** Crie um algoritmo que preencha um Array com 100 números inteiros aleatoriamente e  imprima os elementos. Além disso, deve-se realizar a impressao inversa também. */

        
        int [] array = new int[100];

        for(int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random()*100);
            
            array[i] = aleatorio;
        }

    
        for(int j = array.length -1; j >= 0; j--) {
            System.out.println(array[j]);
        }


    }
}