package leetcode;

public class q1991 {
    class Solution {
        int[] prefixSum(int[] arr){
            int[] ans=new int[arr.length+1];
            for(int i=0;i<arr.length;i++)
            ans[i+1]=ans[i]+arr[i];
            return ans;
        }
        int[] suffix(int[]arr){
            int[] sum=new int[arr.length+1];
            for(int i=arr.length-1;i>=0;i--)
            sum[i]=sum[i+1]+arr[i];
            return sum;
        }
        public int findMiddleIndex(int[] nums) {
            int[] ans=prefixSum(nums);
            int[] sum=suffix(nums);
            for(int i=0;i<nums.length;i++){
                if(ans[i]==sum[i+1]){
                    return i;
                }
            }
            return -1;
        }
    }
}
