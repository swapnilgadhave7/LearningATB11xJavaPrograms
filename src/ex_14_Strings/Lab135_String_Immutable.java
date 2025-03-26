package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "pramod";
        name.toUpperCase(); //PRAMOD.
        // It must be changed to uppercase but because string are immutable in nature it is not changed.
        System.out.println(name);
    }
}
