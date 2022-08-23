public class mediaArray {
    public static void main (String[] args) {

        /** Crie um algoritmo que preencha um Array com 100 números inteiros aleatoriamente e realize o calculo da media aritmetica. */

        double soma = 0;
        int [] arrayNumbs = new int [100];
        int aleatorio;
        double resultado;
        

        for(int i = 0; i < arrayNumbs.length  ; i++) {
            aleatorio = (int) (Math.random()*100);
            arrayNumbs[i] = aleatorio;
            soma+= arrayNumbs[i];
        }
        resultado = (soma / arrayNumbs.length);
        //System.out.println(soma);
        System.out.println("A media aritmetica é = " + resultado);



    }
}