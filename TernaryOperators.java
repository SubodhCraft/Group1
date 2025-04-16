import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();

        String result = (age<=18) ? "You are not eligible to vote" :
        "You are eligible";
        System.out.println(result);

        sc.close();

        // The ternary operators are used during conditions to validate whether a given condition is true or false
    }
    
}
