package Recursion;

public class factorial {
    static void fact(int n, int  res ){
        if(n<=1){
           System.out.println(res);
            return;
        }
         
       fact(n-1 , res*n);
       
    }
    public static void main(String[] args) {
        fact(4 , 1);
        
    }
}
