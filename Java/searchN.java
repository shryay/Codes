import java.util.*;

public class searchN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int x = sc.nextInt();
        int mid, low = 0, high = n - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A[mid] == x) {
                System.out.println("Element found at index " + mid);
                break;
            } else if (A[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (low > high) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
// Time Complexity: O(log n)
// Space Complexity: O(1)
