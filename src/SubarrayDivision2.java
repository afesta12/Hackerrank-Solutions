import java.util.List;

public class SubarrayDivision2 {

    /**
     * Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.
     *
     * Lily decides to share a contiguous segment of the bar selected such that:
     *
     * The length of the segment matches Ron's birth month, and,
     * The sum of the integers on the squares is equal to his birth day.
     * Determine how many ways she can divide the chocolate.
     *
     * Use a sliding window with a fixed window size (the month = the size of the window).
     * If the sum = the day, increment the total.
     *
     * @param s the list
     * @param d the day
     * @param m the month
     * @return the number of ways the chocolate bar can be divided
     */
    public static int birthday(List<Integer> s, int d, int m) {

        int runningSum = 0, total = 0, len = s.size();

        // Initial window
        for(int i = 0; i < m; i++) runningSum += s.get(i);

        total += runningSum == d ? 1 : 0;

        for(int i = m; i < len; i++) {

            runningSum += s.get(i) - s.get(i - m);

            if(runningSum == d) total++;

        }

        return total;
    }

}
