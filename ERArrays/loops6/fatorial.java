package loops6;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multi = 1;

        System.out.println(fatorial +"! = ");
        for(int i = fatorial; i >= 1; i--) {
            multi = multi * i;
        }
        System.out.println(multi);

        scan.close();
    }
}
