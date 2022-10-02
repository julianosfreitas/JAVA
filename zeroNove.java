import java.util.Scanner;

public class zeroNove {
    
    public static void main(String[] args){

        int valor1, valor2;

        Scanner olae = new Scanner(System.in);

            System.out.print("Digite um valor: ");
            valor1 = olae.nextInt();

            System.out.print("Digite um segundo valor: ");
            valor2 = olae.nextInt();

            olae.close();
        
            if (valor1 > valor2) {
                System.out.println(valor1 +  " É maior que " + valor2);
            } else {
                System.out.println(valor2 + " É maior que " + valor1);
            }
    }
}