import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
    static List<String> names = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("1. Add new name\n2. Check for name\n0. Exit");
            System.out.print("Enter selection: ");
            int choise = Integer.parseInt(sc.nextLine());

            boolean flag = false;

            switch(choise){
                case 1 -> {
                    System.out.print("Enter a name: ");
                    String name = sc.nextLine();
                    addName(name);
                    System.out.println("Name added successfully\n");
                }

                case 2 -> {
                    System.out.print("Enter a name: ");
                    String name = sc.nextLine();
                    System.out.println(checkName(name) + "\n");
                }

                case 0 -> {
                    System.out.println("Exiting...");
                    flag = true;
                }
            }

            if(flag) break;
        } while(true);

        sc.close();
    }

    public static void addName(String str){
        names.add(str);
    }

    public static String checkName(String str){
        return names.contains(str) ? "Name found" : "Name not found";
    }
}
