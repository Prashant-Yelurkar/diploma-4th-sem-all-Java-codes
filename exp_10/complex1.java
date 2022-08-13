class complex
{
    int real , imaginary;
    complex()
    {

    }
    complex(int Real, int Imaginary)
    {
        real = Real;
        imaginary = Imaginary;
    }

    complex addcomplex(complex c1 , complex c2)
    {
        complex temp = new complex();
        temp.real = c1.real + c2.real;
        temp.imaginary = c1.imaginary + c2.imaginary;
        return temp;
    }
}
class complex1
{
    public static void main(String args[])
    {
        complex c1 = new complex(3,2);
        System.out.println("Complex Number 1 : "+ c1.real + " +i" + c1.imaginary);

        complex c2 = new complex(9,5);
        System.out.println("Complex Number 2 : "+ c2.real + " +i" + c2.imaginary);

        complex c3 = new complex();
        c3 = c3.addcomplex(c1,c2);
        System.out.println("Sum of complex number :"+ c3.real +" +i" + c3.imaginary);
    }

}