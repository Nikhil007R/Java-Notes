import java.util.*;

public class BinarySearch {

    // MAKE SURE THE NUMBERS THAT YOU ARE GOING TO put should be IN A INCREASED
    // ORDER

    // iterative way
    public static int Binary1(int arr[], int key) {

        int s = 0;
        int e = arr.length - 1;

        int mid = (s + e) / 2;

        while (s <= e) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
            mid = (s + e) / 2;
        }
        return -1;
    }

    // recursive way
    public static int Binary2(int arr[], int s, int e, int key) {

        if (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                Binary2(arr, s, mid - 1, key);
            } else {
                Binary2(arr, mid + 1, e, key);
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Key to find");
        int key = sc.nextInt();
        sc.close();

        // iterative way
        if (Binary1(arr, key) != -1) {
            System.out.println("Found at index " + Binary1(arr, key));
        } else {
            System.out.println("Not found!! ");
        }

        // recursive way
        if (Binary2(arr, 0, n - 1, key) != -1) {
            System.out.println("Found at index " + Binary2(arr, 0, n - 1, key));
        } else {
            System.out.println("Not found!! ");
        }

    }
}
