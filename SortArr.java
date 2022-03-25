import java.util.Scanner;

public class SortArr {
    public void sort(int[] arr, int n) {
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
        System.out.print("Sorting Array Using Insertion Sort:\n[");
        for(int i = 0; i < n-1; i++ ){
            System.out.print(arr[i]+", ");
        }
        System.out.print(arr[n-1]+"]");
    }
    public static void main(String[] args) {
        SortArr obj = new SortArr();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Values: ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        obj.sort(arr, n);
    }
}
