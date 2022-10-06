class A2
    {
        void show()
        {
            System.out.println("showing");
        }
        void run()
        {
        System.out.println("Running");
        }
    
    }
class B2 extends A2
    {
        void run()
        {
            System.out.println("Dancing");
        }
    }
public class methodoverriding extends A2
{
    public static void main(String[] args) {
        B2 x = new B2();
        x.show();
        x.run();
    }
}
