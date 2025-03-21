package Ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num1");
        int a=input.nextInt();
        System.out.println("Enter the num2");
        int b=input.nextInt();
        int result_sum=sum(a,b);
        int result_sub=sub(a,b);
        int result_mul=mul(a,b);
        int result_div=div(a,b);
        int result_mod=mod(a,b);
        System.out.println("The result is: "+result_sum);
        System.out.println("The result is: "+result_sub);
        System.out.println("The result is: "+result_mul);
        System.out.println("The result is: "+result_div);
        System.out.println("The result is: "+result_mod);

    }
    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int mul(int a,int b)
    {
        return a*b;
    }
    static int div(int a,int b)
    {
        return a/b;
    }
    static int mod(int a,int b)
    {
        return a%b;
    }
}
