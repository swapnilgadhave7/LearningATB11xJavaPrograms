package ex_01_JavaPrograms;

public class Printtableof9byprintf {
    public static void main(String[] args) {

        int a=9;

        for(int i=1;i<=10;i++)
        {
            int mul=a*i;
            System.out.printf("%d"+"*"+"%d"+"="+"%d",a,i,mul);
            System.out.println();
        }
    }
}
