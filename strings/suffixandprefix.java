package strings;
public class suffixandprefix {
    static void prefix(int[] arr){
        int[] sum=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int total=0;
            for(int j=i;j<arr.length;j++){
                total+=arr[j];
            }
            sum[i]=total;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(sum[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,2,4};
        prefix(arr);
    }
}
