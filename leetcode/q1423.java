package leetcode;

 public class q1423 {
//     class Solution {
//         public int maxScore(int[] arr, int k) {
//             int[] left=prefixSum(arr);
//             int[] right=suffix(arr);
//             int ans=0,i=k,j=right.length-1;
//             while(i>=0){
//                 if(left[i]+right[j]>ans)
//                 ans=left[i]+right[j];
//                 i--;j--;
//             }
//             return ans;
//         }
//         int[] prefixSum(int[] arr){
//             int[] ans=new int[arr.length+1];
//             for(int i=0;i<arr.length;i++)
//             ans[i+1]=ans[i]+arr[i];
//             return ans;
//         }
//         int[] suffix(int[]arr){
//             int[] sum=new int[arr.length+1];
//             for(int i=arr.length-1;i>=0;i--)
//             sum[i]=sum[i+1]+arr[i];
//             return sum;
//         }
//     }
}
