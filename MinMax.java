import java.util.Scanner;

public class MinMax {
    public int min(int[] arr){
        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
    public int max(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MinMax obj = new MinMax();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Values: ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("obj.min(arr) = " + obj.min(arr));
        System.out.println("obj.max(arr) = " + obj.max(arr));
    }

}
