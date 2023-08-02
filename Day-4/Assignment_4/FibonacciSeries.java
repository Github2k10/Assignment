import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n == 1){
            System.out.print("0");
        } else if(n == 2){
            System.out.print("0 1");
        } else {
            int pre = 1;
            int pree = 0;
            System.out.print("0 1 ");

            for(int i = 3; i <= n; i++){
                int cur = pre + pree;
                pree = pre;
                pre = cur;
                System.out.print(cur + " ");
            }
        }
        sc.close();
    }
}
