package Recursion;

public class ArmStrongOrNot {
    static int cnt(int n ,int cnt){
        if(n==0){
            return cnt;
        }
      return  cnt(n/10,cnt+1);
    }
    static void check(int n , int org , int sum , int cnt){
     if(n<=0){
         if(org == sum){
            System.out.println("number is armstrong number");
         }else{
            System.out.println("number is not armstrong number");
         }
         return ;
     }
      
         sum += Math.pow(n%10,cnt);
         check(n/10,org,sum,cnt);


    }
    
    static int check1(int n, int cnt){
     if(n<=0){
        int sum =0;
        return sum;
     }
     int sum = check1(n/10,cnt);
     sum +=Math.pow(n%10,cnt);
     return sum;
     

    }
    public static void main(String[] args) {
        int n = 153;
     int cnt = cnt(n,0);
    //  System.out.println(cnt);
    //     check(n,n , 0,cnt);
        System.out.println((check1(n,cnt)));
    }
}
