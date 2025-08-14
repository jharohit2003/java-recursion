package AlgorithmArray;

public class SubSequence {
    public static boolean isSubsequence(String s, String t) {
        char [] arr = t.toCharArray();
        char [] nums = s.toCharArray();
        int i1=0;
        int i2=0;
        while(i1<nums.length && i2<arr.length){
            if(nums[i1]==arr[i2]){
                i1++;
                i2++;
            }else{
                i2++;
            }
        }
        return i1==nums.length?true :false;
    }
    public static void main(String[] args) {
      boolean ans = isSubsequence( "axc",  "ahbgdc");
       System.out.println(ans); 
    }
}
