package Tasks;

public class FizzBuzz {
    public static void main(String[] args) {
        int n=100;
        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz: "+i);
            }
            else if(i%3==0)
            {
                System.out.println("Fizz: "+i);
            }
            else
            {
                System.out.println("Buzz: "+i);
            }
        }
    }
}
