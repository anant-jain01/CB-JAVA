package basics;

public class Day3 {
   /* static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println(a + ", " + b);
    }
*/

/*static void printnat(int n){
    for(int i=1;i<=n;i++){
        System.out.print(i);
    }
}
*/

    public static void main(String[] args) {
        //swap(5, 8);
    //    printnat(8);
    //   System.out.println(is_prime(9));
    //   System.out.println(is_prime(3));
    //   System.out.println(is_prime(4));
    //   System.out.println(is_prime(5));
    // System.out.println(inverse(123));
    // System.out.println(digits(123));
    //  System.out.println(armstrong(153));
    // int[] arr=new int[10];
    // arr[0]=4;
    // System.out.println(arr);
    // int[] arr={55,56,54};
    // printArr(arr);

}
/*static boolean is_prime(int n){
    for(int i=2;i<=n/2;i++){
            if (n%i==0) {
                return false;
            }
    }
    return true;
    }
*/
/*static void printArr(int[] arr){
    for(int i=0;i<=arr.length;i++){
        System.out.println(i+" ");
    }
    System.out.println();
}*/
/*/
static int inverse(int n){
    int temp=0;
    while(n!=0){
        temp=temp*10+(n%10);
        n/=10;
    }
    return temp;
}*/
/* static int digits(int n){
     int c=0;
     while(n!=0){
         c+=1;
         n/=10;
     }
     return c;
 }*/
/*
 static boolean armstrong(int n){
     int temp=0;
     int c=n;
     while(n!=0){
         temp += Math.pow((n%10),3);
         n/=10;
     }
     if(temp==c){
         System.out.println("yes");
     }
     else{
         System.out.println("no");
     }
     return true;
 }
 */
}