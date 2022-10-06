

public class practice
{
    int roll_no=100; // Instance Variable - values changes from object to object - object is necessary - scope : Throughout class
    static String name="Adhi"; // Static Variable - value remains same for all objects - object is not necessary - scope : Throughout package
   public static void main(String[] args) {
        practice p=new practice();
        System.out.println(p.roll_no);
        System.out.println(name);
        int i=97;// Local variable - must be declared inside method(or function) - object cannot access local variable sincle local variable works only within it's scope - scope : inside its block
        System.out.println(i);
        double d=i;// implicit type casting - widening - small to large
        System.out.println(d);
        char ch=(char)i;// explicit type casting - shortening - large to small
        System.out.println(ch);
// Conditional statements
        int age=20;
        if(age<18)
        {
            System.out.println("site not allowed");
        }
        else
        {
            System.out.println("site allowed");
        }
       

   }
}