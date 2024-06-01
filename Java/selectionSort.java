import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        selection_Sort(A, n);
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        sc.close();
    }
    public static void selection_Sort(int A[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
            }
            int temp = A[min];
            A[min] = A[i];
            A[i] = temp;
        }
    }
}