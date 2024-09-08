<<<<<<< HEAD
package leetcode;

public class q121 {
    class Solution {
        public int maxProfit(int[] prices){
            int maxElement=0;
            int[] nger=new int[prices.length];
            for(int i=prices.length-1;i>=0;i--){
                nger[i]=maxElement;
                maxElement=Math.max(prices[i],maxElement);
            }
            int difference=0;
            int diff=0;
            for(int i=0;i<prices.length;i++){
                diff=nger[i]-prices[i];
                difference=Math.max(diff,difference);
            }
            return difference;
        }}
}
=======
package leetcode;

public class q121 {
    class Solution {
        public int maxProfit(int[] prices){
            int maxElement=0;
            int[] nger=new int[prices.length];
            for(int i=prices.length-1;i>=0;i--){
                nger[i]=maxElement;
                maxElement=Math.max(prices[i],maxElement);
            }
            int difference=0;
            int diff=0;
            for(int i=0;i<prices.length;i++){
                diff=nger[i]-prices[i];
                difference=Math.max(diff,difference);
            }
            return difference;
        }}
}
>>>>>>> b1a440dc24051dfd33420ddf587c67fe9909f2d0
