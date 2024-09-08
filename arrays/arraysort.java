package arrays;
import java.util.*;
public class arraysort {
    public static void main(String[] args) {
        int[][] nums={{1,4,3},{8,6,7},{2,9,5}};
        //  populate(nums);
        //  sortcoloumns(nums);
        compsort(nums);
        print(nums);
    }
    static void populate(int[][] nums){
        int n=1;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[0].length;j++){
                nums[i][j]=n;
                n++;
            }
        }}
        static void print(int[][] nums){
            for (int i=0;i<nums.length;i++){
                for (int j=0;j<nums[0].length;j++){
                    System.out.print(nums[i][j]+" ");
        }
        System.out.println("");
    }}
    static void sortrows(int[][] nums){
        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
        }
    }
    static void sortcoloumns(int[][] nums){
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
    }
    static int[] flaten(int[][] nums){
        int[] arr=new int[nums.length*nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                arr[3*i+j]=nums[i][j];
            }
        }
        return arr;
    }
    static void compsort(int[][] nums){
        int[] arr=flaten(nums);
        Arrays.sort(arr);
        
    }
}
