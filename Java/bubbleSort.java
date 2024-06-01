import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        bubble_Sort(A, n);
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        sc.close();
    }
    public static void bubble_Sort(int A[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
            System.out.println("Iteration " + (n - i) + ": ");
        }
    }
}