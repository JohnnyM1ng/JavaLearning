public class test1_find_narcissistic_number {
    public static void main(String[] args) {
        for(int i = 100; i < 1000; i++){
            int a = i / 100 % 10;
            int b = i / 10 % 10;
            int c = i % 10;
            double result = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
            if(result==i){
                System.out.println(i);
            }
        }
    }
}
