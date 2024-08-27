package leetcode;

public class q1552 {
    class Solution {
        public int maxDistance(int[] arr, int m) {
            Arrays.sort(arr);
            int low=1,high=arr[arr.length-1]-arr[0],ans=1;
        while(low<=high){
            int mid=high-((high-low)/2);
            if(check(mid,arr,m)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
        }
        static boolean check(int mid,int[] arr,int m){
            int count=1,lastposition=arr[0];
            for(int i=1;i<arr.length&&count<m;i++){
                if(arr[i]-lastposition>=mid){
                    count++;
                    lastposition=arr[i];
                }
            }
            return(count>=m);
        }
    }
}
