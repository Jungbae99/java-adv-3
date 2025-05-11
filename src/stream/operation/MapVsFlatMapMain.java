package stream.operation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class MapVsFlatMapMain {
    public static void main(String[] args) {
        List<List<Integer>> outerList = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );

        System.out.println(outerList);
        // for
        List<Integer> forResult = new ArrayList<>();
        for (List<Integer> list : outerList) {
            for (Integer i : list) {
                forResult.add(i);
            }
        }
        System.out.println(forResult);

        // map
        List<Integer> mapList = outerList.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println("mapList = " + mapList);
    }
}
