package OOPs;

public class Student {
    String name;
    int age;
    public void IntroduceYourself()
    {
        System.out.println("My name is "+name+ " and age is "+age);
    }

    public void SayHello(String name)
    {
        System.out.println(this.name+ " says hello to "+name);
    }

    //common for all then we will make it static function
    public static void mentor(String name)
    {
        System.out.println("Mentor name is xyz "+name);
    }

    //Static block is independent of any object and will run at first and before anything else.
    static
    {
        System.out.println("I am static block");
    }
}
