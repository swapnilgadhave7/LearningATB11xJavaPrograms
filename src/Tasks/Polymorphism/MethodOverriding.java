package Tasks.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        FireFoxTC f1 = new  FireFoxTC();
        f1.openBrowser();

        CommonToAll c2 = new  CommonToAll();
        c2.openBrowser();

        //Dynamic dispatch
        CommonToAll c3 = new ChromeTC();
        c3.openBrowser();

        CommonToAll c4 = new FireFoxTC();
        c4.openBrowser();

    }
}
class CommonToAll
{
    void openBrowser()
    {
        System.out.println("This is common browser ie. IE browser is opened.");
    }
}
class ChromeTC extends CommonToAll
{
    @Override
    void openBrowser()
    {
        System.out.println("This is chrome browser. Chrome browser is opened.");
    }
    int openBrowser(int a)
    {
        return a;
    }
}
class FireFoxTC extends CommonToAll
{
    @Override
    void openBrowser()
    {
        System.out.println("This is Firefox browser. Firefox browser is opened.");
    }
}

