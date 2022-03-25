import java.util.Scanner;

public class RevArr {
    public void rev(int[] arr, int n) {
        int[] arr1 = new int[n];
        int j = n, i;
        for (i = 0; i < n; i++) {
            arr1[j - 1] = arr[i];
            j = j - 1;
        }
        System.out.println("Reverse Array:");
        for (i = 0; i < n; i++) {
            System.out.println(arr1[i]);
        }
    }

    public static void main(String[] args) {
        RevArr obj = new RevArr();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Values: ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        obj.rev(arr, n);
    }
}
