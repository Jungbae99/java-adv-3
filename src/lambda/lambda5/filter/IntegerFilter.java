package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IntegerFilter {

    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer num : list) {
            if (predicate.test(num)) {
                filtered.add(num);
            }
        }
        return filtered;
    }

}
