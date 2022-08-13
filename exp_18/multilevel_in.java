import java.util.Scanner;
class first
{
    Scanner s = new Scanner(System.in);
    String name;
    int roll_no;
    int age;
    void getdata()
    {
        System.out.print("Enter Your Name : ");
        name = s.nextLine();
        System.out.print("Enter Your Roll no : ");
        roll_no = s.nextInt();
        System.out.print("Enter Your age : ");
        age = s.nextInt();
    }
    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Roll no : " + roll_no);
        System.out.println("Age : " + age);
    }
}
class second extends first
{
    Scanner s = new Scanner(System.in);
    String collage_name;
    int collage_code;
    void getdata()
    {
        super.getdata();
        System.out.print("Enter Your Collage Name : ");
        collage_name = s.nextLine();
        System.out.print("Enter Your Collage code : ");
        collage_code = s.nextInt();
    }
    void display()
    {
        
        super.display();
        System.out.println("Collage Name : " + collage_name);
        System.out.println("Collage code : " + collage_code);

    }
}
class third extends second
{
    Scanner s = new Scanner(System.in);
    String mobile_no;
    void getdata()
    {
        super.getdata();
        System.out.print("Enter Your Mobile no : ");
        mobile_no = s.nextLine();
    }
    void display()
    {
        
        super.display();
        System.out.println("Mobile No  : " + mobile_no);
    }
}
class multilevel_in
{
    public static void main(String args[])
    {
        third t = new third();
        t.getdata();
        t.display();
    }
}