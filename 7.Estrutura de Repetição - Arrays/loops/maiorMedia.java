import java.util.Scanner;

public class maiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // TIPO + VARIÁVEL
        int numero;
        int maior = 0;
        int soma = 0;
        // TIPO + VARIÁVEL + VALOR
        int count = 0;
        // ESTRUTURA DE REPETIÇÃO
        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            System.out.println("Soma: " + soma);

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
    }
}
