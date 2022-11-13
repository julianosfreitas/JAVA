import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qntNumeros;
        int numero;
        int qntPares = 0, qntInpares = 0;

        System.out.println("Quantidade de números: ");
        qntNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) qntPares++;
                else qntInpares++;

            count++;
        } while(count < qntNumeros);

        System.out.println("Quantidade Par: " + qntPares);
        System.out.println("Quantidade Impar: " + qntInpares);

        scan.close();
    }
}
