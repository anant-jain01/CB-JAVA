<<<<<<< HEAD
package leetcode;

public class q88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i=m-1,j=n-1,k=m+n-1;
            while(i>=0&&j>=0) {
                if(nums1[i]>nums2[j]) 
                    nums1[k--]=nums1[i--];
                else 
                    nums1[k--]=nums2[j--];
            }
            while(j>=0) 
                nums1[k--]=nums2[j--];
        }
    }    
}
=======
package leetcode;

public class q88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i=m-1,j=n-1,k=m+n-1;
            while(i>=0&&j>=0) {
                if(nums1[i]>nums2[j]) 
                    nums1[k--]=nums1[i--];
                else 
                    nums1[k--]=nums2[j--];
            }
            while(j>=0) 
                nums1[k--]=nums2[j--];
        }
    }    
}
>>>>>>> b1a440dc24051dfd33420ddf587c67fe9909f2d0
