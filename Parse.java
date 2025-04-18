public class Parse {
    public static void main(String[] args) {
        if (args.length <2){
            System.out.println("Please enter the name and age");
            return;
        }

        String name= args[0];

        int age = Integer.parseInt(args[1]);

        System.out.println(name);
        System.out.println(age);
    }
}
