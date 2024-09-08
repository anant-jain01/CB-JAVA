package recursion;
public class recursion {
    public static void main(String[] args) {
        // System.out.println(multiply(5,2));
        // System.out.println(fact(190));
         System.out.println(pow(10,2,1));
    }
    /*EXAMPLE */
    // static int pow(int a,int b){
    //     if(b==0)return 1;
    //     int x=a*pow(a,b-1);
    //     return x;
    // }
    static int pow(int a,int b,int c){//TAIL RECURSION
      if(b==0) return c;
      return pow(a,b-1,a*c);
    } //c is the answer
    static int fact(int n){
        if(n==0||n==1)
        return 1;
        int c=n*fact(n-1);
        return c;
    }/*int factorialTail(int n, int accumulator) {
    if (n == 1) {
        return accumulator;
    }
    return factorialTail(n - 1, n * accumulator);
}
 */
    static int multiply(int a,int b){
        if(a==1)return b;
        int x=b+multiply(a-1, b);//recursive snippet
        return x;
    }
}
