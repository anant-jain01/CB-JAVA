package leetcode;

public class q2089 {
    // public class Solution{
    //     public List<Integer> targetIndices(int[] nums,int target){
    //     Arrays.sort(nums);
    //     List<Integer> result=new ArrayList<>();
    //     int low=0,high=nums.length-1;
    //     int first=-1,last=-1;
    //     while(low<=high){
    //     int mid=low+(high-low)/2;
    //     if(nums[mid]<target){
    //     low=mid+1;
    //     }else if(nums[mid]>target){
    //     high=mid-1;
    //     }else{
    //     if(mid==0||nums[mid-1]!=target){
    //     first=mid;
    //     break;
    //     }
    //     high=mid-1;
    //     }
    //     }
    //     if(first==-1){
    //     return result;
    //     }
    //     low=first;
    //     high=nums.length-1;
    //     while(low<=high){
    //     int mid=low+(high-low)/2;
    //     if(nums[mid]<target){
    //     low=mid+1;
    //     }else if(nums[mid]>target){
    //     high=mid-1;
    //     }else{
    //     if(mid==nums.length-1||nums[mid+1]!=target){
    //     last=mid;
    //     break;
    //     }
    //     low=mid+1;
    //     }
    //     }
    //     for(int i=first;i<=last;i++){
    //     result.add(i);
    //     }
    //     return result;
    //     }
        // }
}
