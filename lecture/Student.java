// copy constructor
import java.util.Scanner;
class Student
{
    private String name;
    private int age;
    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public Student(Student s1)
    {
        this.name = s1.name;
        this.age = s1.age;
    }
    public void display()
    {
        System.out.println("Name is : "+ this.name);
        System.out.println("Age is : "+this.age);
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name =s.next();
        System.out.println("Enter Your age :");
        int age = s.nextInt();
        System.out.println("\n"+"Data of Original Object :"+ "\n");
        Student s1 = new Student(name, age);
        s1.display();
        System.out.println("\n"+"Data of Copy Object :"+ "\n");
        Student s2 = new Student(s1);
        s2.display();

    }
}