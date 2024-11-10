import java.util.*;

class LinearSearch {

    public static int Search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
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

        if (Search(arr, key) != -1) {
            System.out.println("Found at index " + Search(arr, key));
        } else {
            System.out.println("Not found!! ");
        }
    }
}