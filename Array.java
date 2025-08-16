package Array;

public class Array {
    public static void main(String[] args) {
        // zig zak array
        int [][] arr = new int[3][];
        arr[0]= new int[10];
        arr[1]= new int[20];
        arr[2]= new int[30];
        for(int i =0 ;i<arr.length;i++){
            for(int j =0 ;j<arr[0].length;i++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
