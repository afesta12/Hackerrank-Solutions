public class Pangram {

    /**
     * A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether
     * it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.
     *
     * Using a frequency array. If any index of the array is 0, return "not pangram"
     *
     * @param s The string to check
     * @return pangram if s is a pangram else not pangram
     */
    public static String pangrams(String s) {

        String lower = s.toLowerCase();
        int[] freq = new int[26];

        for(int i = 0; i < lower.length(); i++) {

            char cur = lower.charAt(i);

            if(Character.isLetter(cur)) freq[cur - 'a']++;

        }

        for(int n : freq) if(n == 0) return "not pangram";

        return "pangram";
    }

    /**
     * Same as above, but without using an auxiliary array and instead using .contains.
     * @param s the String to check
     * @return pangram if s is a pangram else not pangram
     */
    public static String pangram(String s) {

        String lower = s.toLowerCase();

        for(char i = 'a'; i <= 'z'; i++) {

            if(!lower.contains(String.valueOf(i))) return "not pangram";

        }

        return "pangram";
    }
}
