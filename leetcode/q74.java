package leetcode;
public class q74 {
    class Solution {
        public boolean searchMatrix(int[][] nums, int target) {
            int ans=0;
            int low=0,high=nums.length-1;
            while(low<=high){
                int mid=low+((high-low)/2);
                if(nums[mid][0]==target)
                return true;
            else if(nums[mid][0]<target){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
            }
            low=0;high=nums[0].length-1;
            while(low<=high){
                int mid=low+((high-low)/2);
                if(nums[ans][mid]==target)
                return true;
                else if(nums[ans][mid]<target){
                    low=mid+1;
                }else
                high=mid-1;
            }
            return false;
    }
    
    }
    /*class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[0].length;j++){
                if(nums[i][j]==target)
                return true;
            }
    }
    return false;
}} */
}
