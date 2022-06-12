public class MarsExploration {

    /**
     * Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal
     * received by Earth as a string, s, determine how many letters of the SOS message have been changed by radiation.
     * @param s the String to check
     * @return how many letters were changed
     *
     * Using an extra string repeated s.length() / 3 times, check if the chars are equal, if not increment count.
     */
    public static int marsExploration(String s) {

        int res = 0, len = s.length(), k = len / 3;

        String expected = "SOS".repeat(k);

        for(int i = 0; i < len; i++) {

            char cur = s.charAt(i);
            char expect = expected.charAt(i);

            if(cur != expect) res++;

        }

        return res;
    }

    /**
     * Another solution without an extra string and no call to the repeat function.
     * @param s the String to check
     * @return count of letters that were changed
     */
    public static int marsChangedLetters(String s) {

        int res = 0, len = s.length();

        for(int i = 0; i <= len - 3; i+=3) {

            if(s.charAt(i) != 'S') res++;
            if(s.charAt(i + 1) != 'O') res++;
            if(s.charAt(i + 2) != 'S') res++;

        }

        return res;
    }
}
