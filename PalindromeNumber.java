package Recursion;

public class PalindromeNumber {
    static boolean isPalindrome(int n , int org , int rev){
        if(n<=0){
            return org==rev;
        }
        rev = rev*10+(n%10);
        return isPalindrome(n/10, org ,rev);
         
    }
    
    static int isPalindrome(int n ){
    return isPalindrome(n,0);
    }
    static int isPalindrome(int n , int rev){
        if(n<=0){
        return  rev;
      }
      rev = rev *10+(n%10);
      return isPalindrome(n/10,rev);
   
    }
    public static void main(String[] args) {
        // boolean res = isPalindrome(121 ,121,0);
        // if(res==true){
        //     System.out.println("Palindrome number");
        // }else{
        //     System.out.println("Not Palindrome");
        // }
        System.out.println(isPalindrome(15123));
    }
}
