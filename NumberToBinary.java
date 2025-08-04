package Recursion;

public class NumberToBinary {
    static void conversion(long n){
        if(n<=0){
            return;
        }
        conversion(n/2);
        System.out.print(n%2);
    }
    public static void main(String[] args) {
        conversion(1000000l);
    }
}
