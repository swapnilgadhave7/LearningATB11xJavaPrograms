package Tasks;

public class Pyramid_pattern {
    public static void main(String[] args) {
        int n=9;
        int k=5;
        int[][] arr=new int[k][n];
        for(int i=0;i<k;i++)
        {
            for(int j=i;j<n/2;j++)
            {
                System.out.print(" ");
            }
            for(int l=0;l<=(i*2);l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
