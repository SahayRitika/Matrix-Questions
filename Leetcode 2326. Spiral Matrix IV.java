/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans= new int[m][n];
        for (int[] row : ans) {
           Arrays.fill(row, -1);  // Fill each row individually with -1
        }

        int i=0, j=n-1, k=m-1, l=0;
        while (i <= k && l <= j && head != null) {
    // Row (forward)
    for (int c = l; c <= j && head != null; c++) {
        ans[i][c] = head.val;
        head = head.next; // Move to the next node
    }
    i++;

    // Column (downward)
    for (int c = i; c <= k && head != null; c++) {
        ans[c][j] = head.val;
        head = head.next; // Move to the next node
    }
    j--;

    // Row (backward)
    for (int c = j; c >= l && head != null; c--) {
        ans[k][c] = head.val;
        head = head.next; // Move to the next node
    }
    k--;

    // Column (upward)
    for (int c = k; c >= i && head != null; c--) {
        ans[c][l] = head.val;
        head = head.next; // Move to the next node
    }
    l++;

        }

        return ans;
    }
}

//optimised approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int rows, int columns, ListNode head) {
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++) {
            matrix[i] = new int [columns];
            Arrays.fill(matrix[i], -1);
        }

        int topRow = 0, bottomRow = rows - 1, leftColumn = 0, rightColumn = columns - 1;
        while (head != null) {
        
            for (int col = leftColumn; col <= rightColumn && head != null; col++) {
                matrix[topRow][col] = head.val;
                head = head.next;
            }
            topRow++;

        
            for (int row = topRow; row <= bottomRow && head != null; row++) {
                matrix[row][rightColumn] = head.val;
                head = head.next;
            }
            rightColumn--;

 
            for (int col = rightColumn; col >= leftColumn && head != null; col--) {
                matrix[bottomRow][col] = head.val;
                head = head.next;
            }
            bottomRow--;

       
            for (int row = bottomRow; row >= topRow && head != null; row--) {
                matrix[row][leftColumn] = head.val;
                head = head.next;
            }
            leftColumn++;
        }

        return matrix;
    }
}
