package recursion;
public class cointosses {
    public static void main(String[] args) {
        coin(2,"",0);
    }
    static void coin(int a,String n,int count){
        count++;
        if(a==0){
            System.out.print(n);
            System.out.println(count);
            return;
        }
        coin(a-1,n+"H",count);
        coin(a-1,n+"T",count);
    }
}
