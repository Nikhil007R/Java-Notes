import java.util.Scanner;

public class Insertion {

    public static void Sort(int arr[], int n) {

        for (int i = 1; i < n; i++) {

            int k = arr[i];
            int j = i - 1;

            while (j >= 0 && k < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = k;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Before Sorting");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Sort(arr, n);

        System.out.println("After Sorting");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
