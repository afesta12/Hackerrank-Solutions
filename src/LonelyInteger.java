import java.util.List;

public class LonelyInteger {

    /**
     * Given an array of integers, where all elements but one occur twice, find the unique element.
     *
     * Input size is only up to 100, so use an array to count the number of times each element occurs.
     * Iterate over the frequency array and return the index that has a count of 1.
     *
     * @param arr the array
     * @return the integer that only occurs once in the array.
     */
    public static int lonelyInteger(List<Integer> arr) {

        int[] frequency = new int[101];

        for (Integer integer : arr) frequency[integer]++;

        for(int i = 0; i < frequency.length; i++) if(frequency[i] == 1) return i;

        return -1;
    }
}
