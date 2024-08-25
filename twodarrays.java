public class twodarrays {
    public static void main(String[] args) {
        int[][] nums=new int[3][3];
         populate(nums);
         print(nums);
         System.out.println("transopse array");
         printtrans(nums);
       //  int sum=sum(nums);
       //  System.out.println(sum);
        // System.out.println(searchMatrix(nums, 2));
       // int[][] numsa={{1,2,3,4},
       //                {5,4,6,3},
       //                {1,10,23,55}};
       // int arr[]=new int[5];
       // System.out.println(nums[0]); PRINT ADDRESS
       // System.out.println(nums[1]);PRINT ADDRESS
       // int[][][] grid=new int[2][3][4];
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
    }
    }
    static int sum(int[][] nums){
        int sum=0;
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[0].length;j++){
                sum+=nums[i][j];
            }
        }
        return sum;
    }
    static boolean searchMatrix(int[][] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[0].length;j++){
                if(nums[i][j]==target)
                return true;
            }
    }
    return false;
}
static void printtrans(int[][] nums){
    int temp=0;
    for (int i=0;i<nums.length;i++){
        for (int j=i+1;j<nums[0].length;j++){
            temp=nums[i][j];
            nums[i][j]=nums[j][i];
            nums[j][i]=temp;
        }}
    print(nums);
}
}