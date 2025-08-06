package Recursion;

public class PowerOfANumber {
    static long power(int n  , int i){
        if(i<=0){
            return 1;
        }
        long pow = power(n, i-1);
        pow  *=n;
        return pow;

    }
    static void power(int n , int i , long pow){
        if(i<=0){
            System.out.println(pow);
            return;
        }
         pow *= n;
         power(n,i-1,pow);

    }
    public static void main(String[] args) {
        int n = 10;
        int i =10;
        System.out.println(power(n,i));
        power(n, i , 1);

    }
}
