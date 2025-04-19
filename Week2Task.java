// public class Week2Task {
//     public static void main(String[] args) {
//         double principleAmount = 5000;
//         int time = 3;
//         double rate = 5;

//         double simpleInterest = (principleAmount * time * rate)/100;
//         System.out.println("Simple Interest: " + simpleInterest);

//     }
// }

// public class Week2Task {

//      public static void main(String[] args) {
//         double base = 10;
//         double height = 5;
//         double areaTriangle = (base * height)/2;
//         System.out.println("Area of triangle: " + areaTriangle);
//     }
// }

// public class Week2Task {

//     public static void main(String[] args) {
//         double base = 10;
//         double height =5;
//         double areaTriangle = (base * height)/2;
//         System.out.println("Area of triangle: " + areaTriangle);

//         double side = 4;
//         double volumeCube = side * side * side;
//         System.out.println("Volume of Cube: " + volumeCube);

//         double length = 6;
//         double width =3;
//         double heightCuboid = 8;
//         double volumeCuboid = length * width * heightCuboid;
//         System.out.println("Volume of the cuboid: "+ volumeCuboid);
//     }
// }

// import java.util.Scanner;

// public class Week2Task {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your age: ");
//         int age = sc.nextInt();

//         if (age <= 18) {
//             System.out.println("You are not eligible to vote ");
//         }else if (age >=18) {
//             System.out.println("You are eligible to vote");
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Week2Task {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter another number: ");
//         int b = sc.nextInt();
//         System.out.println("The sum is: "+(a+b));
//         System.out.println("The product is: "+(a*b));
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Week2Task {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter another number: ");
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println("The sum is: "+ sum);
//         int product= a*b;
//         System.out.println("The product is: "+ product);
//         double div = sum/product;
//         System.out.println("The division is: "+ div);
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Week2Task {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name: ");
//         String name = sc.nextLine();
//         System.out.println("Enter your roll no: ");
//         int rollno = sc.nextInt();
//         sc.nextLine();
//         System.out.println("Enter your field of interest: ");
//         String field = sc.nextLine();
//         System.out.println("Hey, my name is "+name+ " and my roll number is "+rollno +". MY field of interest is "+field+".");
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Week2Task {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter side of the square: ");
//         double side = sc.nextDouble();
//         double areaSqaure = side * side;
//         double perimeterSquare = 4 * side;
//         System.out.println("Area of the square: " + areaSqaure);
//         System.out.println("Perimeter of the square: " + perimeterSquare);

//         System.out.print("Enter principal amount: ");
//         double principal = sc.nextDouble();
//         System.out.print("Enter rate of interest: ");
//         double rate = sc.nextDouble();
//         System.out.print("Enter time in years: ");
//         int time =sc.nextInt();
//         double simpleInterest = (principal * rate * time)/100;
//         System.out.println("Simple Interest: "+ simpleInterest);

//         System.out.print("Enter base of the triangle: ");
//         double base= sc.nextDouble();
//         System.out.print("Enter height of the triangle: ");
//         double height =sc.nextDouble();
//         double areaTriangle = (base * height)/2;
//         System.out.println("Area of the triangle: " + areaTriangle);

//         System.out.print("Enter side of the cube: ");
//         double cubeSide = sc.nextDouble();
//         double volumeCube= cubeSide*cubeSide*cubeSide;
//         System.out.println("Volume of the cube: "+volumeCube);

//         System.out.print("Enter length of the cuboid: ");
//         double length = sc.nextDouble();
//         System.out.print("Enter width of the cuboid: ");
//         double width = sc.nextDouble();
//         System.out.print("Enter height of the cuboid: ");
//         double heightCuboid = sc.nextDouble();
//         double volumeCuboid = length* width* heightCuboid;
//         System.out.println("Volume of the cuboid: "+ volumeCuboid);
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Week2Task {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter length of the rectangle: ");
//         double length = sc.nextDouble();
//         System.out.print("Enter breadth of the rectangle: ");
//         double breadth = sc.nextDouble();

//         int areaRectangle = (int) (length*breadth);
//         System.out.println("Area of the rectangle: "+areaRectangle);

//         sc.close();
//     }
// }

import java.util.Scanner;

public class Week2Task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for subject 1: ");
        double subject1=sc.nextDouble();
        System.out.print("Enter marks for subject 2: ");
        double subject2=sc.nextDouble();
        System.out.print("Enter marks for subject 3: ");
        double subject3=sc.nextDouble();
        System.out.print("Enter marks for subject 4: ");
        double subject4=sc.nextDouble();

        double totalMarks= subject1+subject2+subject3+subject4;
        double percentage = (totalMarks/400)*100;

        System.out.println("Total marks: "+totalMarks);
        System.out.printf("Percentage: ", percentage);

        String result = (percentage >=70) ? "First class":
                        (percentage >59) ?"Upper Second class":
                        (percentage>49) ? "Second class":
                        (percentage>39) ? "Third class" : "Fail";

        System.out.println("Result : "+result);
        sc.close();
    }
}