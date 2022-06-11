
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    /**
     * Using ArrayList
     *
     * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
     * Print the decimal value of each fraction on a new line with  places after the decimal.
     * @param arr the given array
     */
    public static void plusMinus(List<Integer> arr) {

        int pos = 0, neg = 0, zero = 0;
        double len = arr.size();

        for(int n : arr) {

            if(n > 0) pos++;
            else if(n < 0) neg++;
            else zero++;

        }

        DecimalFormat form = new DecimalFormat("##.000000");

        double posRatio = pos / len;
        double negRatio = neg / len;
        double zeroRatio = zero / len;

        System.out.println(form.format(posRatio));
        System.out.println(form.format(negRatio));
        System.out.println(form.format(zeroRatio));
    }

    /**
     * Same as above using array.
     * @param arr the given array
     */
    public static void plusMinusArray(int[] arr) {

        double pos = 0, neg = 0, zero = 0, len = arr.length;

        for(int n : arr) {

            if(n > 0) pos++;
            else if(n < 0) neg++;
            else zero++;

        }

        DecimalFormat form = new DecimalFormat("##.000000");

        System.out.println(form.format(pos / len));
        System.out.println(form.format(neg / len));
        System.out.println(form.format(zero / len));
    }
}
