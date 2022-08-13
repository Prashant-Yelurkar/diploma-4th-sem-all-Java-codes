class stringBuffer_method
{
    public static void main (String args[])
    {
        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = new StringBuffer(" World");
        System.out.println("\n\nOrignal String are : 1) "+ s1 + " 2) "+ s2);
        s1.append(s2);
        System.out.println("Using addpend Methd : " + s1 + "\n\n");



        StringBuffer s3 = new StringBuffer("Hello");
        StringBuffer s4 = new StringBuffer("World");
        System.out.println("Orignal String are : 1) "+ s3 + " 2) "+ s4);
        s3.insert(4,s4);
        System.out.println("Using Insert Methd : " + s3 + " at index 4 \n\n");



        StringBuffer s5 = new StringBuffer("Hello");  
        System.out.println("Orignal String is : " + s5);
        s5.delete(2,4);
        System.out.println("Using delete Methd : " + s5  +  " from index 2 to 4 \n\n");       


        StringBuffer s6 = new StringBuffer("Hello"); 
        System.out.println("Orignal String is : " + s6);
        s6.deleteCharAt(2);
        System.out.println("Using deleteCharAt Methd : " + s6  +  " ( Index 2) \n\n"); 


        StringBuffer s7 = new StringBuffer("Hello"); 
        System.out.println("Orignal String is : " + s7);
        s7.reverse();
        System.out.println("Using reverse Methd : " + s7  +  " \n\n");



        StringBuffer s8 = new StringBuffer("Hello"); 
        System.out.println("Orignal String is : " + s8);    
        s8.setCharAt(3,'p');
        System.out.println("Using setCharAt Methd : " + s8  +  "  (index 3  char : p) \n\n");




    }
}