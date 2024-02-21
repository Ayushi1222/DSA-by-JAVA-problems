package OOPs;

public class Student_client {
    public static void main(String[] args) {
        Student s=new Student();
        s.name ="Jigglypuff";
        s.age=91;
        System.out.println(s.name);
        System.out.println(s.age);
        s.IntroduceYourself();
        Student s1=new Student();
        s1.name="Pikachu";
        s1.age=300;
        s1.IntroduceYourself();
        Student s2=new Student();
        s2.name="Chikki chikki chikki chikki";
        s2.age=300;
        s2.IntroduceYourself();
        s.SayHello(s1.name);
        Student.mentor(s2.name);

    }
}
