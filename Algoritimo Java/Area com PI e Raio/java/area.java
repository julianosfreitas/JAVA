package java;
import java.util.Scanner;

public class area{
    public static void main(String[] args){
        Scanner robo = new Scanner(System.in);
        System.out.print("Digite o valor do Raio: ");
        int raio = robo.nextInt();
        System.out.print("O Raio é de : " + raio);
        robo.close();
    }
}