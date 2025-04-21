// import java.util.Scanner;

// public class conditional {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         // int x = sc.nextInt();
//         // int y = 20;
//         // int c = x+y;
//         // if (c > 20) {
//         //     System.out.println("x + y is greater than 20");
//         // } else {
//         //     System.out.println("x + y is smaller than 20");
//         // }
//         // System.out.println("x + y is greater than 20: "+(c > 20));


//         int num= sc.nextInt();
//         if (num>0) {
//             System.out.println("Num is greater than 0");
//         } else if(num<0){
//             System.out.println("Num is smaller than 0");
//         } else if (num>50){
//             System.out.println("num is greater than 50");
//         } else if (num<25) {
//             System.out.println("Num is smaller than 25");
//         } else{
//             System.out.println("Num is equal to 0");
//         }
//         sc.close();
//     }
    
// }

import java.util.Scanner;

public class conditional {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your year: "); 
        int year = sc.nextInt();
        System.out.println("Enter your marks: ");
        int marks =sc.nextInt();
        if (year==1){
            if (marks>=70){
                System.out.println("Your grade is first class");
            } else {
                System.out.println("Your grade is B");
            }
        } else {
            if (marks>=80) {
                System.out.println("Your grade is first class");
            } else {
                System.out.println("Your grade is B");
        }
        sc.close();
    }
}
}