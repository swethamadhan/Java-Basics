public class constructor {
    int roll;
    int age;
    long mobile;
    static String name = "SMVEC";
    constructor(int roll, int age)// parameterized constructor
    {
        this.roll = roll;
        this.age = age;
        System.out.println(roll + " " + age + " " +name);
    }
    constructor(int roll, int age, long mobile)// different parameters overloading (constructor overloading)
    {
        this.roll = roll;
        this.age = age;
        this.mobile = mobile;
        System.out.println(roll + " " + age + " " + mobile + " " + name);
    }
    constructor(constructor t1)// copy constructor 
    {
        this.roll= t1.roll;
        this.age=t1.age;
        System.out.println(roll + " " + age + " " +name);
    }
    public static void main(String... arg) {
        constructor t1 =new constructor(1, 20);
        constructor t2 = new constructor(2,22,9533289);
        constructor t3 = new constructor(t1); // object creation for copy constructor
        // t1.display();
        // t2.display();
    }
    // void display()
    // {
    //     System.out.println(roll + " " + age);
    // }
}
