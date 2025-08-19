package SlidingWindow;

public class MininumSubarray {
     public static int minSubArrayLen(int target, int[] nums) {
      int cnt =Integer.MAX_VALUE;
      int n = nums.length;
      int left= 0;
      int sum =0;
      
      
      for(int right =0 ;right<n;right++){
        sum += nums[right];
        while(sum>=target){

        cnt = Math.min(cnt,right-left+1);
            
            sum -= nums[left];
            left++;
        }
       
      }
      return cnt==Integer.MAX_VALUE?0:cnt;  
    }
    public static void main(String[] args) {
       int a= minSubArrayLen(10,new int[]{1,2,3,4,5,6,7});
       System.out.println(a);
    }
}
