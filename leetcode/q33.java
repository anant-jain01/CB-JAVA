<<<<<<< HEAD
package leetcode;

public class q33 {
    class Solution {
        public int search(int[] nums, int target) {
            int low=0,high=nums.length-1;
            while(low<=high){
             int mid=high-(high-low)/2;
               if (nums[mid]==target) {
                    return mid;
                }
                if(nums[low]<=nums[mid]){
                   if(nums[low]<=target&&target<nums[mid]){
                        high=mid-1;
                    }else{
                        low=mid+1;
                    }
                }else{
                    if(nums[mid]<target&&target<=nums[high]){
                        low=mid+1;
                    }else{
                        high=mid-1;
                    }
                }
            }
            return -1;
        }
    }
    
}
=======
package leetcode;

public class q33 {
    class Solution {
        public int search(int[] nums, int target) {
            int low=0,high=nums.length-1;
            while(low<=high){
             int mid=high-(high-low)/2;
               if (nums[mid]==target) {
                    return mid;
                }
                if(nums[low]<=nums[mid]){
                   if(nums[low]<=target&&target<nums[mid]){
                        high=mid-1;
                    }else{
                        low=mid+1;
                    }
                }else{
                    if(nums[mid]<target&&target<=nums[high]){
                        low=mid+1;
                    }else{
                        high=mid-1;
                    }
                }
            }
            return -1;
        }
    }
    
}
>>>>>>> b1a440dc24051dfd33420ddf587c67fe9909f2d0
