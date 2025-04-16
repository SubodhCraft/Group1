public class locals {

    int age;
    String name;
    static int companyCode =78;
    // the static keyword here is used to globalize the variable in the class
    // static works similar like global keyword

    void display(){
        int age=8;
        System.out.println(age + name);
    }
    public static void main(String[] args) {

        // this block of code can be un-commented if we dont use the static keyword line of code 
        // locals s1= new locals();
        // s1.display();
        // s1.age = 77;
        // s1.display();

        System.out.println(locals.companyCode);

        locals s2= new locals();

        s2.age= 77;
        s2.display();
        
        // this was done by me, but aobve mentioned approach is better
        // String name="RAJ";
        // System.out.println(name);

        
    }

}
