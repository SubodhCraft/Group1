import java.util.Scanner;
public class PrimitiveTypeCasting {
public static void main(String[] args) {  
Scanner scanner = new Scanner(System.in);  

    // Taking input for different primitive types  
    System.out.print("Enter an integer (int): ");  
    int intValue = scanner.nextInt();  

    System.out.print("Enter a float: ");  
    float floatValue = scanner.nextFloat();  

    System.out.print("Enter a double: ");  
    double doubleValue = scanner.nextDouble();  

    System.out.print("Enter a character: ");  
    char charValue = scanner.next().charAt(0);  

    float autoFloat = intValue;   
   
    double autoDouble = floatValue;   

    float manualFloat = (float) doubleValue;   
     
    int manualInt = (int) floatValue;   
 
    System.out.println("Integer to Float: " + autoFloat);  
    System.out.println("Float to Double: " + autoDouble);  

    System.out.println("Double to Float: " + manualFloat);  
    System.out.println("Float to Integer: " + manualInt);  

    System.out.println("\nCharacter Input: " + charValue);  

    scanner.close();  
}  

}

