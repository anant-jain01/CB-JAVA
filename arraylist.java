import java.util.ArrayList;

public class arraylist {
    //DYNAMIC IN LENGTH
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>(); // Correct syntax
        // arr.add(10);
        // arr.add(90);
        // arr.add(40);//Add an element

        // System.out.println(arr.get(0));//GET AN ELEMENT AT INDEX
        // System.out.println(arr.indexOf(40));//GET INDEX OF AN ELEMENT
        // System.out.println(arr);

        // arr.remove(1);//REMOVE ELEMENT AT INDEX
        // System.out.println(arr);
        // arr.set(1,50);//UPDATE AN ELEMENT
        // System.out.println(arr);
        // System.out.println(arr.size());//SIZE

        // Collections.sort(arr);//ARR SORT


        /*CREATE A FUNCTION TO FIND MAXIMUUM SUM SUBARRAY OF SIZE K */
        int[] arr={10,50,31,10,20,10,1,40,40};
        int k=2;
        System.out.print(findSubAray(arr,k));
    }
    // static ArrayList<Integer> findSubAray(int[] arr,int k){
    //     int maxsum=0;
    //     ArrayList<Integer> ans_array = new ArrayList<>(),array=new ArrayList<>();
    //     for (int i = 0; i <= arr.length-k; i++) {
    //         int currsum=0;
    //         array.clear();
    //         currsum=0;
    //         for (int j = i; j < i+k; j++) {
    //             currsum+=arr[j];
    //             array.add(arr[j]);
    //         }
    //     if(currsum>maxsum){
    //             maxsum=currsum;
    //             ans_array =new ArrayList<>(array);    
    //     }}
    //     return ans_array;
    // }
    static ArrayList<Integer> findSubAray(int[] arr,int k){
        int start=0,end=k-1,maxsum=0;
        for (int i = 0; i < arr.length; i++) {
            maxsum+=arr[i];
        }
        int currsum=maxsum;
        int index=0;
        while(end<arr.length){
            currsum-=arr[start];
            start++;end++;
            currsum+=arr[end];
        if(currsum>maxsum){
            index=start;
            maxsum=currsum;
        }}
        ArrayList<Integer> ans_array = new ArrayList<>();
        for (int i = 0; i < index+k; i++) {
            ans_array.add(arr[i]);
        }
        return ans_array;
    }
}
