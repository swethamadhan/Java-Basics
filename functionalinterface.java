interface C
{
    public void show();
}
public abstract class functionalinterface implements C {
    public static void main(String[] args) {
        
        C h= new functionalinterface()
        {
            public void show()
            {
                System.out.println("HI da");
            }
        };

        h.show();
        
    }
}
