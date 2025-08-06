package Recursion;

public class CountNumberOfZero {
    static int count(int n){
     if(n<=0){
        return 0;
     }
     int sum = count(n/10);
     if(n%10==0){
        sum++;
     }
     return sum;
    }
    public static void main(String[] args) {
        System.out.println(count(5000000));
    }
}
