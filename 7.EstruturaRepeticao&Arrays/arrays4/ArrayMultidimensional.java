package arrays4;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        // MATRIZ (Vetores dentro de Vetores)
        int[][] M = new int[4][4];
        // 0 - 1 - 2 - 3 (4 elementos) != 0 - 1 - 2 - 3 - 4 (5 elementos)

        // ESTRUTURA DE REPETIÇÃO COM (for)
        for(int i = 0; i < M.length; i++) {
            for(int c = 0; c < M[i].length; c++) {
                M[i][c] = random.nextInt(9);
            }
        }


    }
}
