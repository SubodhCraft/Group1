public class ParseInt {
    public static void main(String[] args) {
        
        // Parse a string into an integer 
        float x= Float.parseFloat("11");
        System.out.println(x);

        // Parse a string into a double 
        double c =Double.parseDouble("11");
        System.out.println(c);

        // Parse a string in binary format into an integer
        int b= Integer.parseInt("100", 2);
        System.out.println(b);

        // Print the results 
        // System.out.println(Float.parseFloat("11"));
        // System.out.println(Double.parseDouble("11"));
        System.out.println(Integer.parseInt("100", 2));
        System.out.println(Integer.parseInt("101", 8));
    }
}
