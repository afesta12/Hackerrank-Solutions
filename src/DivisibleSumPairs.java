import java.util.HashMap;
import java.util.Map;

public class DivisibleSumPairs {

    /**
     * Given an array of integers and a positive integer k, determine the number of (i, j) pairs where i < j
     * and arr[i] + arr[j] is divisible by k.
     *
     * Two numbers are divisible by k if both of the number's remainders are also divisible by k. Use a map
     * to track the count of remainders, and increment the total number of pairs every time a compliment
     * remainder is found.
     *
     * @param arr the given array
     * @param k the number to check divisibility
     * @return total number of pairs satisfying condition
     */
    public static int divisibleSumPairs(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        int total = 0;

        for(int n : arr) {

            int remainder = n % k;

            total += map.getOrDefault((k - remainder) % k, 0);

            map.put(remainder, map.getOrDefault(remainder, 0) + 1);

        }

        return total;
    }

    /**
     * Same problem as above, but using two for loops. Both solutions are accepted, but the first solution
     * is faster.
     *
     * @param k int k
     * @param arr the given array
     * @return total number of pairs
     */
    public static int divisibleSumPairs2(int k, int[] arr) {

        int total = 0;

        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = i + 1; j < arr.length; j++) {

                if((arr[i] + arr[j]) % k == 0) total++;

            }

        }

        return total;
    }
}