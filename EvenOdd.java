package Recursion;

public class EvenOdd {
    static void countEvenOdd(int n , int even , int odd){
        if(n<=0){
            System.out.println("Even number -> "+even +"\nOdd Number -> "+odd);
            return;
        }
        if((n&1)==0){
            even++;
        }else{
            odd++;
        }
        countEvenOdd(n-1, even, odd);
    }
    static int[] countEvenOdd(int n){
       return countEvenOdd(n, new int[2]);
    }
    static int[] EvenOdd(int n){
        
       if(n<=0){
        int [] res = new int[2];
        return res;
       }
    int []  res =  EvenOdd(n-1);
       if(n%2==0){
        res[0]+=1;
       }else{
        res[1]+=1;
       }
    
         return res;
    }
    static int[] countEvenOdd(int n , int [] arr){
        if(n<=0){
            return arr;
        }
        if(n%2==0){
            arr[0]+=1;
        }else{
            arr[1]+=1;
        }
        return countEvenOdd(n-1,arr);
    }
    public static void main(String[] args) {
        // countEvenOdd(120, 0, 0);
        int [] num = EvenOdd(120);
        System.out.println("even ->" +num[0]+"\nodd ->"+num[1]);
    }
}
