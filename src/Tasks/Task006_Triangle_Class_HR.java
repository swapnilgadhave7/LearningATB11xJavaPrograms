package Tasks;

import java.util.Scanner;

public class Task006_Triangle_Class_HR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();

        if(side1<=0||side2<=0||side3<=0)
        {
            System.out.println("This is no traingle");
            System.exit(0);
        }

        if(side1+side2<=side3||side2+side3<=side1||side1+side3<side2)
        {
            System.out.println("This is no traingle");
            System.exit(0);
        }
        else if(side1==side2||side2==side3|side1==side3)
        {
            System.out.println("Isosceles triangle");
        }
        else
        {
            System.out.println("Scalene");
        }
    }
}
