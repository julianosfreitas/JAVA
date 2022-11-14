package java;
import java.util.Scanner;
public class Aluno {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        char s = 's';
        while (s == 's'){

    System.out.print("A CLASSE DO ALUNO: ");
    String aluno = sc.next();

        if (aluno == "A") {
            System.out.println("Excelente");
        } else if (aluno == "B") {
             System.out.println("Media");
        } else {
            System.out.println("Reprovado");
        }

    System.out.print("Digite s(Continuar) ou n(Sair): ");
    s = sc.next().charAt(0);
        }
    }
}