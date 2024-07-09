import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class UnionOfArrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }
            if (arr1[i] < arr2[j]) {
                res.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                res.add(arr2[j]);
                j++;
            } else {
                res.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < n) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                res.add(arr1[i]);
            }
            i++;
        }
        while (j < m) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                res.add(arr2[j]);
            }
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the number of elements in the second array: ");
        int m = sc.nextInt();
        int B[] = new int[m];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        ArrayList<Integer> res = findUnion(A, B, n, m);
        System.out.println("Union of the two arrays: ");
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
        sc.close();
    }
}

// Time Complexity: O(n + m)
// Space Complexity: O(n + m)