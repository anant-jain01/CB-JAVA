<<<<<<< HEAD
package leetcode;

public class q136 {
    class Solution {    
        public int singleNumber(int[] nums) {
                int result = 0;
                for (int num : nums) {
                    result ^= num;
                }
                return result; 
        }}
}
=======
package leetcode;

public class q136 {
    class Solution {    
        public int singleNumber(int[] nums) {
                int result = 0;
                for (int num : nums) {
                    result ^= num;
                }
                return result; 
        }}
}
>>>>>>> b1a440dc24051dfd33420ddf587c67fe9909f2d0
