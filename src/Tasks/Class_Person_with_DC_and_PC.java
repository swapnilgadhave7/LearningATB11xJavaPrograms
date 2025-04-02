package Tasks;

public class Class_Person_with_DC_and_PC {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
        p1.sleep();
        System.out.println(p1.name+" is walking "+p1.walk(500)+" and do home work ");
        p1.doHome(true);
        Person p2=new Person("Nilesh",29,"Miraj","8888811221",true);
        System.out.println(p2.name+" is walking "+p2.walk(1500)+" and do home work ");
        p2.doHome(true);
    }
}
class Person
{
    String name;
    int age;
    String address;
    String phone;
    Boolean isMale;
    Boolean daily;

    void eat()
    {
        System.out.println("All persons Eat daily 2 meals");
    }
    void sleep()
    {
        System.out.println("All persons Taking 8 hrs of sleep");
    }
    int walk(int km)
    {

        return km;
    }
    void doHome(Boolean daily)
    {
        this.daily=daily;
    }
    Person()
    {

            this.name="name is unknown";
            this.age=18;
            this.address="pune";
            this.phone="9999911111";
    }
     Person(String name, int age, String address, String phone, Boolean isMale)
    {
            this.name=name;
            this.age=age;
            this.address=address;
            this.phone=phone;
            this.isMale=isMale;

    }
}
