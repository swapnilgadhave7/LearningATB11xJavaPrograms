package Tasks;
import java.util.Scanner;
import java.util.Arrays;

public class Find_Second_Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
 //       System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
        System.out.println("Second Largest Element in array : "+arr[n-2]);
    }
}
