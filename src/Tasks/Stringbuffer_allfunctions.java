package Tasks;

public class Stringbuffer_allfunctions {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        System.out.println(sb);
        sb.append(" Programming");  //1. append() method
        System.out.println(sb);
        sb.insert(5,"Test insert method "); //2. insert() method
        System.out.println(sb);
        sb.replace(5,9,"Changed Text"); //3. replace() method
        System.out.println(sb);
        sb.delete(5,25);          //4. delete() method
        System.out.println(sb);
        sb.reverse();      //5. reverse() method
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb.capacity()); //6. capacity() method
        sb.ensureCapacity(200);   //7. ensureCapacity() method
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.charAt(2));   //8. charAt() method
        sb.setCharAt(2,'a');     //9. setCharAt() method
        System.out.println(sb);
        System.out.println(sb.length());   //10. length() method
        System.out.println(sb.substring(6)); //11. substring() method start index
        System.out.println(sb.substring(6,10));   //12. substring() method start and end index
        String result = sb.toString();             //13. toString() method
        System.out.println(result);
        StringBuffer test = new StringBuffer(50);
        test.append("Swapnil");
        test.trimToSize();                      //14. trimToSize() method
        System.out.println(test);
        System.out.println(test.capacity());


    }
}
