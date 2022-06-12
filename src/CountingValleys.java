public class CountingValleys {

    /**
     * An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps,
     * for every step it was noted if it was an uphill, , or a downhill,  step. Hikes always start and end at sea level,
     * and each step up or down represents a  unit change in altitude. We define the following terms:
     *
     * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and
     * ending with a step down to sea level.
     *
     * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and
     * ending with a step up to sea level.
     *
     * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
     * @param steps number of steps (length of the string)
     * @param path the path taken
     * @return the number of valleys
     */
    public static int countingValleys(int steps, String path) {

        int valleys = 0, result = 0;

        for(int i = 0; i < steps; i++) {

            if(path.charAt(i) == 'U') {

                valleys++;

                if(valleys == 0) result++;

            }

            if(path.charAt(i) == 'D') valleys--;

        }

        return result;
    }
}
