import java.util.*;
import java.lang.*;
import java.io.*;
class vector_method
{
    public static void main(String args[])
    {
        Vector v = new Vector(10,2);

        String s1 = new String("Prashant");
        String s2 = new String("Diksha");
        String s3 = new String("Konisha");
        String s4 = new String("Niriksha");
        String s5 = new String("Aditya");

        System.out.println("\n\ncapacity() : " + v.capacity());
        System.out.println("size() : " + v.size());
        System.out.println("\nUsing addElement(s1)");
        v.addElement(s1);
        System.out.println("size() : " + v.size());
        System.out.println("\nUsing add(s2,s3,s4)");
        v.add(s2);
        v.add(s3);
        v.add(s4);
        System.out.println("\nUsing insertElementAt(s5,4)");
        v.insertElementAt(s5,4);
        System.out.println("size() : " + v.size());
        System.out.println("\nElement of Vector : "+ v);

        System.out.println("\nUsing elementAt(1) : " + v.elementAt(1));
        System.out.println("\nUsing firstElement() : " + v.firstElement());
        System.out.println("\nUsing lastElement() : " + v.lastElement());
        System.out.println("\nUsing indexOF(s2) : " + v.indexOf(s2));

        System.out.println("\nUsing removeeElementAt(0) : ");
        v.removeElementAt(0);
        System.out.println("\nElement of Vector : "+ v);

        System.out.println("\nUsing removeElement(s2) : " + v.removeElement(s2));
        System.out.println("\nElement of Vector : "+ v);
        System.out.println("\nUsing clear() : ");
        v.clear();
        System.out.println("\n\ncapacity() : " + v.capacity());
        System.out.println("size() : " + v.size());
        System.out.println("\nElement of Vector : "+ v);

    }
}