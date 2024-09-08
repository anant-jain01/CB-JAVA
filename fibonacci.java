public class fibonacci{
    static int fib(int a){
        if(a==0||a==1) return a;
        int fib1=fib(a-1),fib2=(a-2);
        return fib1+fib2;
    }
    public static void main(String[] args) {
        fib(3);
    }
}