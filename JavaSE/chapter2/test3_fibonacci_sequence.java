public class test3_fibonacci_sequence {
    public static void main(String[] args) {
        int a = 5;
        int result = fib_seq(a);
        System.out.println(result);
    }
    public static int fib_seq(int num){
        if(num==0){
            return 0;
        } else if (num==1) {
            return 1;
        }
        else{
            return fib_seq(num - 1) + fib_seq(num - 2);
        }
    }
}
