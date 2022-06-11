import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchingStrings {

    /**
     * There is a collection of input strings and a collection of query strings. For each query string,
     * determine how many times it occurs in the list of input strings. Return an array of the results.
     *
     * @param strings the input strings
     * @param queries the query strings
     * @return an array of results for each query
     */
    public static List<Integer> matchingString(List<String> strings, List<String> queries) {

        Map<String, Integer> map = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        for(String str : strings) map.put(str, map.getOrDefault(str, 0) + 1);

        for(String str : queries) result.add(map.getOrDefault(str, 0));

        return result;
    }
}
