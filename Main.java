public class Main {

    public static void main(String[] args) {
        // int myInt=9;
        // double myDouble = myInt; //Automatic casting: int to double

        // System.out.println(myInt); //Output 9 
        // System.out.println(myDouble); //Output 9.0

        //The code separates for showcasing two types of Casting

        double myDouble =9.78d;
        int myInt = (int) myDouble; //Manual casting: double to int

        System.out.println(myDouble);
        System.out.println(myInt);
    }
    
}
