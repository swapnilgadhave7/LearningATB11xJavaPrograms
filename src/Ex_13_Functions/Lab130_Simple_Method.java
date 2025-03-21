package Ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        int result=return_int();
        System.out.println(result);
        boolean r=return_boolean();
        System.out.println(r);

    }
    static void pramod_f1()
    {
        System.out.println("No Return");
    }
    static int return_f2()
    {
        return 10;
    }
    static boolean return_boolean()
    {
        return true;
    }
    static float return_pi_value()
    {
        return 3.14f;
    }
    static byte return_byte()
    {
        return 100;
    }
    static int return_int()
    {
        return 41320;
    }
    static long return_long()
    {
        return 10L;
    }
}
