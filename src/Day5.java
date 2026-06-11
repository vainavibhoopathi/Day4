import java.util.Scanner;

public class Day5 {
    void main(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String a = scanner.nextLine();
        System.out.println("\nEnter your department:");
        String b = scanner.nextLine();
        System.out.println("\nEnter your age:");
        String c = scanner.nextLine();
        String clean = a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("\nDetails:" + "");
        System.out.println("Enter your Name:"+a);
        System.out.println("Enter your department:"+b);
        System.out.println("Enter your age:"+c);

    }
}

