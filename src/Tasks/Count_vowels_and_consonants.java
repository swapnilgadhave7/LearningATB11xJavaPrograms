package Tasks;
import java.util.Scanner;

public class Count_vowels_and_consonants {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                vowels++;
            }
            else
            {
                consonants++;
            }
        }
        System.out.println("vowels "+vowels+" "+"consonants "+consonants);
    }
}
