public class statkey {
    // static - nowhere related to the object
    // static - scope - throughout the package
    static String name="hellooo"; // static variable
    static //static block - maintains log files
    {
        System.out.println("Welcome all");
    }
    public static void main(String[] args) {
        statkey f = new statkey();
        f.display();
        displays();
    }
    void display()
    {
        System.out.println(name);
    }
    static void displays()
    {
        System.out.println("haha");
    }
}
