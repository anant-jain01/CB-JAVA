package leetcode;

public class q875 {
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int low=1,high=1000000000,ans=high;
            while(low<=high){
                int speed=high-((high-low)/2);
                if(check(speed,h,piles)){
                    ans=speed;
                    high=speed-1;
                }else
                low=speed+1;
            }
            return ans;
        }
        static boolean check(int speed,int h,int[] piles){
            int time=0;
            for (int i=0;i<piles.length;i++){
                time+=piles[i]/speed;
                if(piles[i]%speed!=0){
                  time+=1;
                }
            }
            return(time<=h);
        }}
}
