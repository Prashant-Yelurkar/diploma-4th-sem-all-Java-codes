import java.lang.*;
import java.util.*;
class String_class_method
{
    public static void main(String args[])
    {
        String s = "PRASHANT";
        String p = s.toLowerCase();
        System.out.println("Original String : " + s);
        System.out.println("Using Lowercase Method : "+p+ "\n\n");

        String s1 = "prashant";
        String p1 = s1.toUpperCase();
        System.out.println("Original String : " + s1);
        System.out.println("Using Uppercase Method : "+ p1 + "\n\n");


        String s2 = "   Prashant   ";
        String p2 = s2.trim();
        System.out.println("Original String : " + s2);
        System.out.println("Using Trim Method : "+ p2 + "\n\n");


        String s3 = "Drashant";
        String p3 = s3.replace('D','P');
        System.out.println("Original String : " + s3);
        System.out.println("Using Replace Method : "+ p3 + "\n\n");

        String s4 = "Prashant";
        System.out.println("Original String : " + s4);
        System.out.println("Using CharAt Method : "+ s4.charAt(0) + " at 0 Index" + "\n\n");


        String s5 = "Prashant";
        String s6 = "Sushant";
        String s7 = "Prashant";
        System.out.println("Original Strings are  : " + "1) " + s5 + "  2) "+ s6 +" 3) "+ s7);
        System.out.println("Cmpare String using equals Methood \n1st String with 2nd : "+ s5.equals(s6));
        System.out.println("1st String with 3rrd : "+ s5.equals(s7) +"\n\n" );


        String s8 = "Prashant";
        String s9 = "PRASHANT";
        System.out.println("Original Strings are  : " + "1) " + s8 + "  2) "+ s9 );
        System.out.println("Compare String Using equalsIgnoreCase : " + s8.equalsIgnoreCase(s9)  + "\n\n");
    
        String s10 = "Prashant";
        String s11 = "Prashant";
        String s12 = "Sushant";
        System.out.println("Original Strings are  : " + "1) " + s10 + "  2) "+ s11 +" 3) "+ s12);
        System.out.println("Compare String Using compareTo Method : ");
        System.out.println("1st with 2nd : " + s10.compareTo(s11) + "\n2nd with 3rd : " + s11.compareTo(s12) +"\n1st with 3rd : " + s10.compareTo(s12)  + "\n\n");
    

        String s13 = "Prashant";
        System.out.println("Original String : " + s13);
        System.out.println("Length of String with length Method : "+ s13.length() + "\n\n");
    
        String s14 = "Prashant";
        String s15 = " Yelurkar";
        System.out.println("Original String :  1) " + s14 + "  2) "+ s15);
        System.out.println("Using Concatentation Method : "+ s14.concat(s15)+ "\n\n");

        String s16 = "Prashant Yelurkar";
        System.out.println("Original String : " + s16);
        System.out.println("Using substring Method : "+ s16.substring(9) + " (Substring from 9 position)\n\n ");

        String s17 = "Prashant Yelurkar";
        System.out.println("Original String : " + s17);
        System.out.println("Using substring Method : "+ s16.substring(3,10) + "\n\n ");

        String s18 = "Prashant Yelurkar";
        System.out.println("Original String : " + s18);
        System.out.println("Using indexOf Method : "+ s17.indexOf('a',3) + " (a char from 3 Position)\n\n ");

    }
}