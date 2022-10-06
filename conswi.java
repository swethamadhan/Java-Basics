import java.util.Scanner;

public class conswi {
    public static void main(String... arg)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int val=s.nextInt();
        switch(val)
        {
            case 1 : System.out.println("case 1 print");
            break;
            case 2 : System.out.println("case 2 print");
            break;
            default : System.out.println("Oru payanum illa");
        }    
    }
}
