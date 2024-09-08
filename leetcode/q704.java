<<<<<<< HEAD
package leetcode;

public class q704 {
    class Solution {
        public int search(int[] nums, int target) {
            int high=nums.length-1,low=0,mid=high-((high-low)/2);
            while(low<=high){
                if (nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]>target){
                    high=mid-1;
                    mid=high-((high-low)/2);
                }else{
                    low=mid+1;
                    mid=high-((high-low)/2);
                }
            }
            return -1;
        }
    }
}
=======
package leetcode;

public class q704 {
    class Solution {
        public int search(int[] nums, int target) {
            int high=nums.length-1,low=0,mid=high-((high-low)/2);
            while(low<=high){
                if (nums[mid]==target){
                    return mid;
                }
                else if(nums[mid]>target){
                    high=mid-1;
                    mid=high-((high-low)/2);
                }else{
                    low=mid+1;
                    mid=high-((high-low)/2);
                }
            }
            return -1;
        }
    }
}
>>>>>>> b1a440dc24051dfd33420ddf587c67fe9909f2d0
