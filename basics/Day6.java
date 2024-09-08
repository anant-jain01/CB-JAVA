package basics;
public class Day6 {
    public static void main(String[] args) {
        //Arrays.sort(arr);
    }   
    static void selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx=minimumvalue(arr,i),temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    static int minimumvalue(int[] arr,int a){
        int mini=a;
        for(int i=a+1;i<arr.length;i++){
            if(arr[mini]>arr[i]){
                mini=i;
            }
        }
        return mini;
    }
}
