/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:
------------
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

Example 2:
------------
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
*/

import java.util.Scanner;
public class rotatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Enter the number of steps to rotate the array: ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int temp = A[n - 1];
            for (int j = n - 1; j > 0; j--) {
                A[j] = A[j - 1];
            }
            A[0] = temp;
        }
        System.out.println("Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
        sc.close();
    }
}