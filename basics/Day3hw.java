package basics;
public class Day3hw{
    public static void main(String[] args) {
        // int[] arr={1,2,3,8,5};
        // Arrays.sort(arr);
        // System.out.println("sum of array is:"+sumarr(arr,3,4));
        //  revarr(arr);
        //  reversearr(arr);
        //  swap(arr,1,2);
        // reverseusingswap(arr,2,3);
        // linearsearch(arr, 10);
        // System.out.println(binarySearch(arr, 3));
    }/*/
    static int sumarr(int[] arr,int a,int b){
        int sum=0;
        if(a<b){
        for(int i=a;i<=b;i++){
            sum+=arr[i];
        }}else{
            System.out.println("wrong indexes");
        }
        return sum;
    }*/
    /*
    static void revarr(int[] arr){
        int[] revar=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
*//*
    static void reversearr(int[] arr){
        int[] revar=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            revar[(arr.length-i-1)]=arr[i];
        }
        for(int j=0;j<arr.length;j++){
            arr[j]=revar[j];
        }
        for(int q=0;q<arr.length;q++){
            System.out.print(arr[q]);
        }}*/
        /*static void printArr(int[] arr){
         for(int q=0;q<arr.length;q++){
            System.out.println("array "+q+"th element is:"+arr[q]);
        }
        } */
    // static void reverseusingswap(int[] arr,int a, int b){
    //     for(int i=a,j=b;i<j;i++,j--){
    //     swap(arr,i,j);
    //     }
    // }
    
    // static void swap(int[] arr,int a, int b){
    //     int c=arr[b];
    //     arr[b]=arr[a];
    //     arr[a]=c;
    // }
    // static boolean linearsearch(int[] arr,int n){
    //     for(int i:arr){
    //         if(i==n){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // static boolean binarySearch(int[] arr, int n){
    //     int i=0,j=arr.length-1;
    //     while(i<=j){
    //         int mid=(i+j)/2;
    //         if(arr[mid]==n)return true;
    //         else if(arr[mid]<n)i=mid+1;
    //         else j=mid-1;
    //     }
    //     return false;
    // }
}
