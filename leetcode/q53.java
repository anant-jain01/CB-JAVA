<<<<<<< HEAD
package leetcode;

public class q53 {
    class Solution {
        public int maxSubArray(int[] arr) {
                    int maxSum=Integer.MIN_VALUE;
            int currsum=0;
            for(int i=0;i<arr.length;i++){
                currsum+=arr[i];
                maxSum=Math.max(maxSum,currsum);
                if(currsum<0){
                    currsum=0;
                }
            }
            return maxSum;
        }
    }
}
=======
package leetcode;

public class q53 {
    class Solution {
        public int maxSubArray(int[] arr) {
                    int maxSum=Integer.MIN_VALUE;
            int currsum=0;
            for(int i=0;i<arr.length;i++){
                currsum+=arr[i];
                maxSum=Math.max(maxSum,currsum);
                if(currsum<0){
                    currsum=0;
                }
            }
            return maxSum;
        }
    }
}
>>>>>>> b1a440dc24051dfd33420ddf587c67fe9909f2d0
