package Recursion;

public class Print {
    public static void main(String[] args) {
        name(10);
    }
    static void name(int n ){
        if(n<=0){
            return;
        } 
        System.out.println(n+"-> Rohit jha is my name"); // Pre Logic
        name(n-1);// n-1 RR
        System.out.println(n+"-> Rohit jha"); // Post Logic - BackTracking
    }
}
