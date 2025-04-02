package Tasks;

public class Class_Person {
    public static void main(String[] args) {
        Person2 ref1= new Person2();
        ref1.setname("Tara");
        ref1.eat();
        ref1.speak("English");
        ref1.hobby();
        double weightpresent =ref1.getWeight(23.23);
        System.out.println(ref1.name+" "+weightpresent);
        String hobbyofperson = ref1.hobby();
        System.out.println(ref1.name+" "+hobbyofperson);
    }
}
class Person2
{
    String name;
    String age;
    double weight;
    String eat;
    String read;
    String gender;
    String hobby;
    String speak;
    int walkdaily;
    String readbook;
    void setname(String name)
    {
        this.name=name;
    }
    void eat()
    {
        System.out.println("Person eating daily 3 times");

    }
    void speak(String speak)
    {
        this.speak=speak;
    }
    double getWeight(double weight)
    {
        this.weight=weight;
        return weight;
    }
    String hobby()
    {
        
        return "painting";
    }
}