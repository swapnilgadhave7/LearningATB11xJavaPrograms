package Tasks;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want to print fibonacci seriese");
        int number=sc.nextInt();
        int a=0;
        int b=1;
        int temp;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<number;i=a+b)
        {
             temp=i;
            System.out.println(temp);
            a=b;
            b=temp;

        }
    }
}
