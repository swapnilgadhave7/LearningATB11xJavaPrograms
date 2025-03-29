package Tasks;

public class Stringbuilder_allfunctions {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");     //1.append() method
        sb.insert(5," Java");  //2. insert() method
        System.out.println(sb);
        sb.replace(6,10,"Test"); //3. replace() method
        System.out.println(sb);
        sb.delete(6,11);            //4. delete() method
        System.out.println(sb);
        sb.reverse();               //5. reverse() method
        System.out.println(sb);
        System.out.println(sb.capacity()); //6. capacity() method
        sb.ensureCapacity(30); //7. ensureCapacity() method
        System.out.println(sb.capacity());
        System.out.println(sb.length());  //8. length() method
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.charAt(2)); //9. charAt() method
        sb.setCharAt(2,'A');   //10. setCharAt() method
        System.out.println(sb);
        System.out.println(sb.substring(6));  //11. substring(start index) method
        System.out.println(sb.substring(6,9)); //12. substring(start index, end index) method.
        String str = sb.toString();         //13. toString() method
        System.out.println(str);
        System.out.println(sb.indexOf("A")); //14. indexOf() method
        System.out.println(sb.lastIndexOf("l")); //15. lastIndexOf() method
        sb.trimToSize();                        //16. trimToSize() method
        System.out.println(sb.capacity());
    }
}
