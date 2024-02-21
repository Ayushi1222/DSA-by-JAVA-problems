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
        Student s3=new Student();
        s3.name="Chikki chikki chikki chikki";
        s3.age=300;
        s3.IntroduceYourself();

    }
}
