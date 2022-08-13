class Animal
{
    String type;
    void animal(String s)
    {
        type = s;
    }
    void move()
    {
        System.out.println("Animal Type :"+ type);
    }
}
class dog extends Animal
{
    String name,breed;
    dog(String s, String n, String b)
    {
        super.animal(s);
        name =n ;
        breed = b;
    }
    void move()
    {
        super.move();
        System.out.println("Animal Name :"+ name);
        System.out.println("Animal Breed :"+ breed);
    }
}
class animals
{
    public static void main(String args[])
    {
        dog d = new dog("Domestic","Rocky","Pug");
        d.move();
    }
}