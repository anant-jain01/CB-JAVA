import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println(isBostonNumber(n));
    }
    static boolean isBostonNumber(int n){
        if(n<4||!isComposite(n))return false;
        int sumDigits=digitsSum(n);
        int sumFactorsDigits=0;
        int[] factors=getPrimeFactors(n);
        for(int i=0;i<factors.length;i++)sumFactorsDigits+=digitsSum(factors[i]);
        return sumDigits==sumFactorsDigits;
    }
    static boolean isComposite(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++)if(n%i==0)return true;
        return false;
    }
    static int digitsSum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    static int[] getPrimeFactors(int n){
        int[] factors=new int[100];
        int index=0;
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                factors[index++]=i;
                n/=i;
            }
        }
        if(n>1)factors[index++]=n;
        return Arrays.copyOf(factors,index);
    }
}
