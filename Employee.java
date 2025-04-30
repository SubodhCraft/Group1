// public class Employee {

//     String name;
//     double salary;

//     static String companyName = "Digital Company Hamro";

//     Employee(String name, double salary) {
//         this.name = name;
//         this.salary = salary;
//     }

//     void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Salary: NRs" + salary);
//         System.out.println("Company: " + companyName);
//     }

//     public static void main(String[] args) {
//         Employee emp1 = new Employee("Ram", 17000);
//         Employee emp2 = new Employee("Hari", 27000);
//         Employee emp3 = new Employee("Sita", 70000);

//         emp1.displayInfo();
//         emp2.displayInfo();
//         emp3.displayInfo();
//     }
// }

import java.util.Scanner;

public class Employee {

    public static void main(String[] args) {
    
        String correctUsername = "admin";
        String correctPassword = "123";
        String correctOTP = "333";

        // Create scanner for input
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Enter OTP: ");
        String otp = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword) && otp.equals(correctOTP)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else if (!username.equals(correctUsername)) {
            System.out.println("Incorrect username.");
        } else if (!password.equals(correctPassword) && !otp.equals(correctOTP)) {
            System.out.println("Both password and OTP are incorrect.");
        } else if (!password.equals(correctPassword)) {
            System.out.println("Incorrect password.");
        } else if (!otp.equals(correctOTP)) {
            System.out.println("Incorrect OTP.");
        } else {
            System.out.println("Login failed due to unknown error.");
        }

        scanner.close();
    }
}
