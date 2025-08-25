import java.util.Scanner;

public class EvenOrOddSum {
    public static void main(String[] args) {
        // even and odd place sum of digit
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int evenSum =0;
        int oddSum =0;
        int t = n;
        int cnt =0;
        while(t>0){
            int d = t%10;
          if(cnt%2==0){
            evenSum += d;
          }else{
            oddSum += d;
          }
          cnt++;
          t=t/10;
        }
        System.out.println("odd Sum is : "+oddSum);
         System.out.println("Even Sum is : "+evenSum);
    }
}
