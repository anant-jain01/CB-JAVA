public class kadanealgo{
    public static void main(String[] args) {
        int[] arr={5,6,3,4,6,-1,5,8,9,-10,56,-6,-7,-5,9,-10};
        check(arr);
    }
    static void check(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            maxSum=Math.max(maxSum,currsum);
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println(maxSum);
    }
}