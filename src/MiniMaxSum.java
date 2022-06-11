import java.util.List;

public class MiniMaxSum {

    /**
     * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly
     * four of the five integers. Then print the respective minimum and maximum values as a single line of two
     * space-separated long integers.
     *
     * The idea here is that the min sum will be the sum of the whole array - max number, and the max sum
     * will be the sum of the whole array minus the min number.
     *
     * @param arr the given array
     */
    public static void miniMaxSum(List<Integer> arr) {

        long sum = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int n : arr) {

            if(n > max) max = n;

            if(n < min) min = n;

            sum += n;

        }

        System.out.printf("%d %d", sum - max, sum - min);
    }

    /**
     * Same idea, but sorting the array first.
     * @param arr the given array
     */
    public static void minMaxSorting(List<Integer> arr) {

        arr.sort(Integer::compareTo);

        long sum = 0;

        for(int n : arr) sum += n;

        System.out.println((sum - arr.get(4)) + " " + (sum - arr.get(0)));
    }

}
