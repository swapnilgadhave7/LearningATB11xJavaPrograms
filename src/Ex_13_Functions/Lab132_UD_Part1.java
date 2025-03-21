package Ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
        //1. Without parameter and without Return Type
        wp_wr_greet();
        //2. Without parameter and with return type
        String msg=greet_with_hello_wp_with_rt();
        System.out.println(msg);
        //3. With parameter and without Return Type (90% times using)
        greet_with_details("Swapnil",35,100);
        greet_with_details("Pramod",65,100);

        //4. With Paramter and with return Type
        int result=sum_of_two_number(3,4);
        System.out.println(result);
    }
    //1. Without parameter and without Return Type
    static void wp_wr_greet()
    {
        System.out.println("Hello World");
    }
    static String greet_with_hello_wp_with_rt()
    {
        System.out.println("Hi");
        return "Hi, how are you?";
    }
    static void greet_with_details(String name, int age, double salary)
    {
        System.out.println("Hello "+name+" "+age+" "+salary);
    }
    static int sum_of_two_number(int a,int b)
    {
        return a+b;
    }
}
