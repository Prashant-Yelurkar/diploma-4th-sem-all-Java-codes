interface salary 
{
    int basic_salary = 1000;
}
class employe
{
    String name;
    int age;
    public employe(String n, int a)
    {
        name = n;
        age = a;
    }
    public void display()
    {
        System.out.println("The name is=" + name);
        System.out.println("The age is=" + age);
    }
}
class gross_salary extends employe implements salary
{ 
    int ta;
    int da;
    int hra;
    gross_salary(String n ,int a,int b,int c ,int d)
    {
        super(String n, int d);
        ta = b;
        da  = c;
        hra = d;
    }
    public void total_sal()
    {
        int ts = 1000 + ta+ da+ hra;
        super.display();
        System.out.println("Total Salary : " + ts);
    } 
}
class testdemo
{
    public static void  main (String args [])
    {
        gross_salary g = new gross_salary("akanshya",18,211,322,999);
        g.total_sal();
        	
    }
}