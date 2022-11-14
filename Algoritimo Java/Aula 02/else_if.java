import java.util.Scanner;

public class oxe {
    public static void main(String[] args){
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Digite o valor da prineira nota: ");
        float nota1 = teclado.nextFloat();
            System.out.print("Digite o valor da segudna nota: ");
        float nota2 = teclado.nextFloat();
        float media = (nota1 + nota2) /2;
        System.out.print("A media é = " + media);
        if (media >= 9) {
            System.out.print(" Você foi aprovado com EXELÊNCIA!");
        } else if (media >= 7) {
            System.out.print(" Você foi aprovado.");
        } else if (media >= 4) {
            System.out.print(" Você esta em recuperação.");
        } else {
            System.out.print(" Você foi Reprovado.");
        }
        }
    }
}