package Tasks.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator ref = new Calculator();
        System.out.println("Sum of two inter is :"+ref.sum(2,5));
        System.out.println("Sum of two double is :"+ref.sum(12.3,3.42));
    }

}
class Calculator
{
    int sum(int a,int b)
    {
        return a+b;
    }
    double sum(double a,double b)
    {
        return a+b;
    }
}
