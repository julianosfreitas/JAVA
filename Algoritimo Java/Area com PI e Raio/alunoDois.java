import java.util.Scanner;
public class alunoDois {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char conceito;

        System.out.print("Qual o Conceito do aluno: (A-B-C-D-E-F): ");
        conceito = sc.next().charAt(0);

        sc.close();

        switch(conceito){

            case 'A':
                System.out.println("Exelente");
            break;

            case 'B':
                System.out.println("Ótimo");
            break;

            case 'C':
                System.out.println("Bom");
            break;

            case 'D':
                System.out.println("Regular");
            break;

            case 'E':
                System.out.println("Ruim");
            break;

            case 'F':
                System.out.println("Nós vemos de novo próximo ano.");
            break;
        }
    }
}
