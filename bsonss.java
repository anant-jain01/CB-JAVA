public class bsonss {
    public static void main(String[] args) {
        int low=0,high=1000000000,ans=0,dist=50,time=2;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(check(mid,dist,time)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }    
        System.out.println(ans);    
    }
    static boolean check(int mid,int dist, int time){
        return mid>=dist/time;
    }    
}