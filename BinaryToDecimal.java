package Recursion;

public class BinaryToDecimal {
    static int conversion(int n , int sum , int cnt){
        if(n<=0){
            return sum;
        }
        sum += Math.pow(2,cnt)*(n%10);
        return conversion(n/10 , sum , cnt+1);

    }
    // head
    static int conversion(int n , int cnt){
        if(n<=0){
            return 0;
        }
      
        int sum = conversion(n/10 , cnt+1);
          sum += Math.pow(2,cnt)*(n%10);
          return sum;

    }
    public static void main(String[] args) {
        //  System.out.println(conversion(1010,0,0));
        System.out.println(conversion(1010, 0));

    }
}
