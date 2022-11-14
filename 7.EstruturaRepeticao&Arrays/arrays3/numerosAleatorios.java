package arrays3;

import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); 

        int[] numerosAleatorios = new int[20];

        for(int i = 0;i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos Numeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1)+ " ");
        }

        System.out.print("\nAntecessores dos Numeros Aleatiros: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero-1)+ " ");
        }
    }
}