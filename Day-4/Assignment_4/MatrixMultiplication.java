import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dimensions of matrix: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[][] mat1 = new int[x][y];

        System.out.println("Enter first matrix: ");
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                mat1[i][j] = sc.nextInt();
            }
        }

        int[][] mat2 = new int[x][y];

        System.out.println("Enter second matrix: ");
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Result: ");
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.print(mat1[i][j] * mat2[i][j] + " ");
            }

            System.out.println();
        }


        sc.close();
    }
}
