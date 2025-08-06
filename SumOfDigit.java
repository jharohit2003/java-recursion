package Recursion;

public class SumOfDigit {
    static void sum(int n , int sum){
         if(n<=0){
            System.out.println("Sum is :"+sum);
            return ;
         }
          sum += (n%10);
         sum(n/10,sum);
        

    }
    static int sum(int n){
       if(n<=0){
        return 0;
       }
       int sum = sum(n/10);
       sum +=(n%10);
       return sum;
    }
    public static void main(String[] args) {
        sum(5112,0);
        System.out.println(sum(1512));
    }
}
