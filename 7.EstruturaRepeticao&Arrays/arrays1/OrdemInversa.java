package arrays1;

/* Criar um *vetor* de 6 números inteiros e mostre-os na ordem inversa. */

public class OrdemInversa {
    public static void main(String[] args) {
            // ARRAY []
            // POSIÇÃO DE 0 - 5 (6 elementos)
        int [] vetor = {-10, -5, 15, 50, 8, 4};

        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
