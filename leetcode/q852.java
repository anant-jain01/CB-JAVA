<<<<<<< HEAD
package leetcode;

public class q852 {
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int low = 0, high = arr.length - 1;
            while (low < high) {
                int mid = low+(high - low) / 2;
                if (arr[mid] < arr[mid + 1]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }
    
}
=======
package leetcode;

public class q852 {
    class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            int low = 0, high = arr.length - 1;
            while (low < high) {
                int mid = low+(high - low) / 2;
                if (arr[mid] < arr[mid + 1]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }
    
}
>>>>>>> b1a440dc24051dfd33420ddf587c67fe9909f2d0
