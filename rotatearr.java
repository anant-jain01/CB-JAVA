public class rotatearr{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int k=1;
        check(arr,k);
    }
    static void check(int[] arr,int k){
        k%=arr.length;
        int[] temp=new int[arr.length];
                for (int i=0;i<arr.length-k;i++){
                temp[i+k]=arr[i];}
                for(int j=0;j<k;j++){
                temp[j]=arr[arr.length-k+j];
                }
                for(int i=0;i<arr.length;i++){
                    arr[i]=temp[i];
                }
    }
}