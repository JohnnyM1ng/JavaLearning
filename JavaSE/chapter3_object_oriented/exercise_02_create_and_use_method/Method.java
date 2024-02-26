package exercise_02_create_and_use_method;
import exercise_01_class.Person;
public class Method {
    public static void main(String[] args) {
        Person p = new Person();
        p.hello();
        int a = sum(10, 20);
        System.out.println(a);

        double b = sum(1.5, 3);
        System.out.println(b);

        p.setName("John");
        System.out.println(p.name);
    }
    static int sum(int a, int b){
        return a + b;
    }

    // 重载
    static double sum(double a, double b){
        return a+b;
    }

}
