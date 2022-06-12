import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays {

    /**
     * There are two n-element arrays of integers, A and B.
     * Permute them into some A' and B' such that the relation A[i]' + B[i]' >= k holds for all i where 0 <= i < n.
     *
     * There will be q queries consisting of A, B, and k. For each query, return YES if some permutation A', B'
     * satisfying the relation exists. Otherwise, return NO.
     *
     * Since the arrays are of equal length, we can avoid sorting them by using Collections.min & Collections.max,
     * the max + the min of either array will have to be greater than k if a permutation is possible. After each check,
     * remove the max and the min if possible, else return "NO".
     *
     * @param k the number that A[i] + B[i] must be greater than or equal to
     * @param A the first array
     * @param B the second array
     * @return "YES" if permutation is possible, else "NO"
     */
    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

        while(A.size() > 0) {

            Integer max = Collections.max(A);
            Integer min = Collections.min(B);

            if(max + min >= k) {

                A.remove(max);
                B.remove(min);

            } else return "NO";

        }

        return "YES";
    }

    /**
     * Same idea as above, but sorting the arrays beforehand instead of getting the max value each iteration.
     * then iterating over one from the left and one from the right.
     *
     * @param k see above
     * @param A first array
     * @param B second array
     * @return "YES" or "NO", see above
     */
    public static String twoArraysSorting(int k, List<Integer> A, List<Integer> B) {

        A.sort(Integer::compareTo);
        B.sort(Integer::compareTo);

        int right = B.size() - 1;

        for (Integer integer : A) {

            if (!(integer + B.get(right--) >= k)) {
                return "NO";
            }

        }

        return "YES";
    }

}
