
import java.lang.*;

class person
{
  String name;
  int age;
  void getdata(String a, int b)
  {
      name = a;
      age = b;
  }
  void display()
  {
    System.out.println("\n\nEnployee Details \n");
    System.out.println("Employee Name : " + name);
    System.out.println("Employee Age : " + age);
  }
}

class emp extends person
{
  String emp_desig;
  int emp_salary;

  void getdata(String a, int b, String c, int d)
  {
    super.getdata(a,b);
    emp_desig = c;
    emp_salary = d;
  }
  void display()
  {
    super.display();
    System.out.println("Employee Desigination : " + emp_desig);
    System.out.println("Employee Salary : "+ emp_salary);
  }
}

class Single_inheritance
{
  public static void main(String args[])
  {
    emp e1 = new emp();
    e1.getdata("Prashant", 17, "Student", 10000);
    e1.display();
    emp e2 = new emp();
    e2.getdata("Sushant", 20, "Student", 20000);
    e2.display();
    emp e3 = new emp();
    e3.getdata("Adinath", 16, "Student", 30000);
    e3.display();
  }
}