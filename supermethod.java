class A4
{
    void show()
    {
        System.out.println("Good morning");
    }
}
class B4 extends A4
{
    void show()
    {
        super.show();
        System.out.println("Good afternoon");
    }
    void run()
    {
        System.out.println("Good night");
    }
}
public class supermethod
 {
    public static void main(String[] args) {
        B4 b = new B4();
        b.show();
        b.run();
    }
    
}
