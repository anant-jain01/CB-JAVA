<<<<<<< HEAD
package leetcode;

public class q169 {
    class Solution {
        public int majorityElement(int[] nums) {
           int candidate=nums[0],count=0;
           for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate)count++;
            else if(count==0){candidate=nums[i];
            count=1;}
            else count--;
           }
           return candidate;
        }
    }
}
=======
package leetcode;

public class q169 {
    class Solution {
        public int majorityElement(int[] nums) {
           int candidate=nums[0],count=0;
           for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate)count++;
            else if(count==0){candidate=nums[i];
            count=1;}
            else count--;
           }
           return candidate;
        }
    }
}
>>>>>>> b1a440dc24051dfd33420ddf587c67fe9909f2d0
