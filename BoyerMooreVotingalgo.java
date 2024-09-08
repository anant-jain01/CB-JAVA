public class BoyerMooreVotingalgo{
    public static int main(String[] args) {
                int[] nums={2,2,1,1,1,2,2};
                int candidate=nums[0],count=1;
                for(int i=1;i<nums.length;i++){
                    if(nums[i]==candidate) count++;
                    else if(count==0){
                        candidate=nums[i];
                        count=1;
                    }else count--;
                }
                return candidate;
            }/* BoyerMooreVotingalgo
                The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.*/
        }