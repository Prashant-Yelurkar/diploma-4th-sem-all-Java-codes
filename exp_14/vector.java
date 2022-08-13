import java.io.*;
import java.lang.*;
import java.util.*;
class vector
{
    public static void main(String args[])
    { 
        Vector v = new Vector();
        Integer s1 = new Integer(1);
        Integer s2 = new Integer(2);
        String s3 = new String("Prashant");
        String s4 = new String("Diksha");
        Character s5 = new Character('a');
        Character s6 = new Character('b');
        Float s7 = new Float(1.1f);
        Float s8 = new Float(1.2f);

        v.addElement(s1);
        v.addElement(s2);
        v.addElement(s3);
        v.addElement(s4);
        v.addElement(s5);
        v.addElement(s6);
        v.addElement(s7);
        v.addElement(s8);

        System.out.println(v);
        v.removeElement(s2);
        System.out.println(v);
        v.removeElementAt(4);
        System.out.println(v);
    }
}
        