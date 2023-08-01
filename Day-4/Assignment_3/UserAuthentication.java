import java.util.Scanner;

public class UserAuthentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = "admin@gmail.com";
        String pass = "admin123";

        System.out.print("Enter username: ");
        String username = sc.next();

        System.out.print("Enter password: ");
        String password = sc.next();

        if(user.equals(username)){
            if(pass.equals(password)){
                System.out.println("Authentication successful.");
            } else {
                System.out.println("Authentication failed. Incorrect Password!!!");
            }
        } else {
            System.out.println("Authentication failed. Incorrect username");
        }

        sc.close();
    }
}
