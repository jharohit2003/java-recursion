package Recursion;

public class NumberToString {
    static String convert(int n){
     if(n<=0){
        return "";
     }
     String ans = convert(n/10);
     ans =ans+" " + helper(n%10);
     return ans;
    }
    static String helper(int n ){
        if(n>=10){
            return "";
        }
    String []   arr={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
    return arr[n];
    }
    public static void main(String[] args) {
        System.out.println(convert(999871));
    }
}
