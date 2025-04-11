import java.util.Scanner;

public class Enter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String str=sc.nextLine();
        System.out.println("My name is " +str);
        sc.close();
    }
}
