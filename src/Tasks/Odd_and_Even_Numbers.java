package Tasks;
import java.util.Scanner;


public class Odd_and_Even_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of element in array present");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                System.out.println("Even number: "+arr[i]);
            }
            else
            {
                System.out.println("Odd number: "+arr[i]);
            }
        }
    }
}
