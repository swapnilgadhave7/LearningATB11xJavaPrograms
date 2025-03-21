package Tasks;

import java.util.Scanner;

public class Palidrome_of_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        StringBuilder str2= new StringBuilder();
        for(int i=str.length()-1;i>=0;i--)
        {
            str2.append(str.charAt(i));
        }
        String str3=str2.toString();
        if(str.equals(str3))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }

}
