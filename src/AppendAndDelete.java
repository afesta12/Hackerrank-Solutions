public class AppendAndDelete {

    /**
     * You have two strings of lowercase English letters. You can perform two types of operations on the first string:
     *
     * Append a lowercase English letter to the end of the string.
     * Delete the last character of the string. Performing this operation on an empty string results in an empty string.
     * @param s the first string
     * @param t the second string
     * @param k number of moves
     * @return Yes if possible, else no.
     */
    public static String appendAndDelete(String s, String t, int k) {

        // if k is greater than the combined lengths, then it's possible because you could simply
        // remove all of s and replace it with t
        if(s.length() + t.length() <= k) return "Yes";

        int index = 0;

        // Get the index where the two strings are no longer equal
        while(index < s.length() && index < t.length() && s.charAt(index) == t.charAt(index)) {

            index++;

        }

        /*
        Minimum operations is each of the string's length - the index.
        k must be >= the number of minimum operations and since operations are done in pairs (append and delete)
        k - the minimum number of operations also must be even.
         */
        int minOperations = (s.length() - index) + (t.length() - index);

        if(k >= minOperations && (k - minOperations) % 2 == 0) return "Yes";

        return "No";
    }
}


