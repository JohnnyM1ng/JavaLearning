package exercise_01_class;

public class ClassTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = p1;
        System.out.println(p1 == p2);

        System.out.println(p1.sex);
        p1.sex = "male";
        System.out.println(p1.sex);

        Person p3 = new Person();
        Person p4 = p3;
        p4.name = "Mike";
        System.out.println(p3.name);
    }
}
