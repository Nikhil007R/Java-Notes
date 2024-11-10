import java.util.*;

class SelectionSort {

    public static void Sort(int arr[], int n) {

        for (int i = 0; i < n; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
