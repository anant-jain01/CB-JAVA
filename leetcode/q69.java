package leetcode;

public class q69 {
    public class Solution {
        public static int mySqrt(int x) {
            if (x < 2) {
                return x;
            }
            int low=1, high=x/2;
            while (low <= high) {
                int mid =low+(high - low) / 2;
                if (mid == x / mid) {
                    return mid;
                } else if (mid < x / mid) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return high;
        }
    }
}
