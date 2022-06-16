import java.util.List;

/**
 *  Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 */
public class DiagonalDifference {

    /*
    Using List
     */
    public static int diagonalDifference(List<List<Integer>> arr) {

        int right = arr.get(0).size() - 1;

        int leftSum = 0, rightSum = 0;

        for(int left = 0; left < arr.size(); left++) {

            leftSum += arr.get(left).get(left);
            rightSum += arr.get(left).get(right--);

        }

        return Math.abs(leftSum - rightSum);
    }

    public static int diagonalDifference(int[][] arr) {

        int left = 0, right = arr[0].length - 1;

        int leftSum = 0, rightSum = 0;

        while(left < arr.length) {

            leftSum += arr[left][left];
            rightSum += arr[left][right--];

            left++;
        }

        return Math.abs(leftSum - rightSum);
    }

}
