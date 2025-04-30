// import java.util.Scanner;
// public class ReviseW1and3 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter an int: ");
//         int intVal = scanner.nextInt();

//         System.out.print("Enter a float: ");
//         float floatVal = scanner.nextFloat();

//         System.out.print("Enter a double: ");
//         double doubleVal = scanner.nextDouble();

//         System.out.print("Enter a character: ");
//         char charVal = scanner.next().charAt(0);

//         // Widening Casting 
//         double widenedFromInt = intVal;       // int -> double
//         double widenedFromFloat = floatVal;   // float -> double

//         // Narrowing Casting
//         int narrowedFromDouble = (int) doubleVal;  // double -> int
//         int asciiFromChar = (int) charVal;         // char -> int (ASCII)

//         System.out.println("int to double: " + widenedFromInt);
//         System.out.println("float to double: " + widenedFromFloat);

//         System.out.println("double to int: " + narrowedFromDouble);
//         System.out.println("char to ASCII int: " + asciiFromChar);

//         // Parsing Strings 
//         if (args.length >= 2) {
//             int parsedInt = Integer.parseInt(args[0]);
//             double parsedDouble = Double.parseDouble(args[1]);

//             System.out.println("Parsed int: " + parsedInt);
//             System.out.println("Parsed double: " + parsedDouble);
//         } else {
          
//         }

//         scanner.close();
//     }
// }


//     public static void main(String[] args) {
//         if (args.length != 3) {
//             System.out.println("Error");
//             return;
//         }
//         int firstnum = Integer.parseInt(args[0]);
//         String operator = args[1];
//         int secondnum = Integer.parseInt(args[2]);

//         switch (operator) {
//             case "+":
//                 System.out.println("Result: "+ (firstnum + secondnum));
//                 break;
//             case "-":
//             System.out.println("Result: "+ (firstnum - secondnum));
//                 break;
//             case "*":
//             System.out.println("Result: "+ (firstnum * secondnum));
//                 break;
//             case "/":
//                 if (secondnum == 0) {
//                     System.out.println("Error: Division by zero.");
//                     return;
//                 } else {
//                     System.out.println("Result:"+ (firstnum / secondnum));
//                 }
               
//                 break;
//             default:
//                 System.out.println("Invalid operator. Use +, -, *, or /");
                
//         }
//     }
// }

// public class ReviseW1and3 {
//             public static void main(String[] args) {
//             if (args.length != 3) {
//                 System.out.println("Use command line");
//                 return;
//             }
    
//             try {
//                 int num1 = Integer.parseInt(args[0]);
//                 String operator = args[1];
//                 int num2 = Integer.parseInt(args[2]);
    
//                 switch (operator) {
//                     case "+":
//                         System.out.println("Result: " + (num1 + num2));
//                         break;
//                     case "-":
//                         System.out.println("Result: " + (num1 - num2));
//                         break;
//                     case "*":
//                         System.out.println("Result: " + (num1 * num2));
//                         break;
//                     case "/":
//                         if (num2 == 0) {
//                             System.out.println("Error: Division by zero.");
//                         } else {
//                             System.out.println("Result: " + (num1 / num2));
//                         }
//                         break;
//                     default:
//                         System.out.println("Error: Invalid operator. Use +, -, *, or /");
//                 }
    
//             } catch (NumberFormatException e) {
//                 System.out.println("Error: Please enter valid integers.");
//             }
//         }
// }

public class ReviseW1and3 {

        int instanceVar = 70;
        static int staticVar = 17;
    
        public void showVariables() {

            int localVar = 7;
    
            System.out.println("Local Variable: " + localVar);
            System.out.println("Instance Variable: " + instanceVar);
            System.out.println("Static Variable: " + staticVar);
        }
    
        public static void main(String[] args) {
            ReviseW1and3 obj1 = new ReviseW1and3();
            ReviseW1and3 obj2 = new ReviseW1and3();
    
            // Change instanceVar in obj1
            obj1.instanceVar = 27;
    
            // Change staticVar via obj2
            obj2.staticVar = 77;
    
            System.out.println("obj1 Variables");
            obj1.showVariables();
    
            System.out.println("\nobj2 Variables");
            obj2.showVariables();
    }
}