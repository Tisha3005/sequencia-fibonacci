public class SeqFibo {

    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55...
    //1  2  3  4  5  6   7   8   9  10

    public static void main(String[] args) {

        Fibonacci fibo = new Fibonacci();
        int fibonacci = fibo.fib(10);

        System.out.println(fibonacci);//
    }
}