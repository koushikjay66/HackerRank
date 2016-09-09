


import java.util.Scanner;

/**
 *
 * @author koushik Jay <koushikjay66 at gmail.com>
 */

/**
 * 
 * <Problem URL>https://www.hackerrank.com/challenges/sherlock-and-array
 * <Problem Description > 
 * 
 * Watson gives Sherlock an array  of length . Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero. 
Formally, find an , such that, 12i-1 i+1i+2N.

Input Format 
The first line contains , the number of test cases. For each test case, the first line contains , the number of elements in the array . The second line for each test case contains  space-separated integers, denoting the array .

Output Format 
For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO.

Constraints 
 
 
i  

Sample Input

2
3
1 2 3
4
1 2 3 3
Sample Output

NO
YES
Explanation 
For the first test case, no such index exists. 
For the second test case, , therefore index  satisfies the given conditions.
 */
public class SherlockAndArray {
    public void run(){
         // TODO code application logic here
        Scanner lab = new Scanner(System.in);
        int leftSum = 0;
        int rightSum = 0;
        int testCases = lab.nextInt();
        for (int i = 0; i < testCases; i++) {
            int length = lab.nextInt();
            int temp[] = new int[length];

            for (int j = 0; j < length; j++) {
                temp[j] = lab.nextInt();
                rightSum += temp[j];
            }
            if (length == 1) {
                System.out.println("YES");
            } else {

                rightSum = rightSum - temp[0];
                for (int j = 1; j < length; j++) {
                    if (j == length - 1) {
                        System.out.println("NO");
                        break;
                    }
                    rightSum = rightSum - temp[j];
                    leftSum = leftSum + temp[j - 1];
                    if (leftSum == rightSum) {
                        System.out.println("YES");
                        break;
                    }
                }
            }
            rightSum = 0;
            leftSum = 0;

        }
    }
}
