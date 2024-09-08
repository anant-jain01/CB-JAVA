<<<<<<< HEAD
package leetcode;

public class q1351 {
    class Solution {
        public int countNegatives(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int count = 0;
            int row = 0;
            int col = n - 1;
            
            while (row < m && col >= 0) {
                if (grid[row][col] < 0) {
                    count += (m - row);
                    col--;
                } else {
                    row++;
                }
            }
            
            return count;
        }}
}
=======
package leetcode;

public class q1351 {
    class Solution {
        public int countNegatives(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int count = 0;
            int row = 0;
            int col = n - 1;
            
            while (row < m && col >= 0) {
                if (grid[row][col] < 0) {
                    count += (m - row);
                    col--;
                } else {
                    row++;
                }
            }
            
            return count;
        }}
}
>>>>>>> b1a440dc24051dfd33420ddf587c67fe9909f2d0
