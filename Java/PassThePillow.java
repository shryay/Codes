/* 
Example 1:
-------------
Input: n = 4, time = 5
Output: 2
Explanation: People pass the pillow in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2.
After five seconds, the 2nd person is holding the pillow.

Example 2:
-------------
Input: n = 3, time = 2
Output: 3
Explanation: People pass the pillow in the following way: 1 -> 2 -> 3.
After two seconds, the 3rd person is holding the pillow.
*/

import java.util.*;

class PassThePillow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int time = sc.nextInt();
        System.out.println(passThePillow(n, time));
        sc.close();
    }
    static int passThePillow(int n, int time) {
        int i = 1;
        boolean forward = true;
        while (time > 0) {
            if (i == 1) {
                forward = true;
            }
            if (i == n) {
                forward = false;
            }
            if (forward) {
                i++;
            } else {
                i--;
            }
            time--;
        }
        return i;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)