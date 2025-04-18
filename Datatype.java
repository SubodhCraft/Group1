import java.util.Scanner;

public class Datatype {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String result = sc.nextLine();
        System.out.println(result);

        System.out.println("Enter age");
        int result1 = sc.nextInt();
        System.out.println(result1);

        System.out.println("Enter word");
        String result2 = sc.next();
        System.out.println(result2);

        System.out.println("Enter char");
        char result3 = sc.next().charAt(0);
        System.out.println(result3);

        sc.close();
    }
    
}