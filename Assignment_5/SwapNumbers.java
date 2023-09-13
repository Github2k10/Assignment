package Assignment_5;

public class SwapNumbers {
    public static void swapNumbers(int a, int b){
        System.out.println("Numbers before swapping: a = " + a + ", b = " + b);

        a += b;
        b = a - b;
        a = a - b;

        System.out.println("Numbers after swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swapNumbers(a, b);
    }
}
