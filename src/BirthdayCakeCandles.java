import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirthdayCakeCandles {

    /*
    HashMap to store the count of the candles while keeping track of the max value in the array.
    Return the value associated with max.
     */
    public static int birthdayCakeCandles(List<Integer> candles) {

        int maxHeight = Integer.MIN_VALUE;

        Map<Integer, Integer> count = new HashMap<>();

        for(int n : candles) {

            count.put(n, count.getOrDefault(n, 0) + 1);
            maxHeight = Math.max(maxHeight, n);

        }

        return count.get(maxHeight);
    }

}
