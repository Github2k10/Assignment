package Assignment_5;

public class CheckPrime {
    public static boolean isPrime(int n){
        if(n <= 1) return false;

        for(int i = 2; i < Math.sqrt(n); i++)
            if(n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;

        System.out.println(n + " is " + (isPrime(n) ? "" : "not ") + "a prime number.");
    }
}
