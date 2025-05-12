package stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectors3Group {
    public static void main(String[] args) {
        // 첫 글자 알파벳을 기준으로 그룹화
        List<String> names = List.of("Apple", "Avocado", "Banana", "BlueBerry", "Cherry");

        Map<String, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(name -> name.substring(0, 1)));
        System.out.println("grouped = " + grouped);

        // 짝수(even)인지 여부로 분할(파티셔닝)
        List<Integer> partitioned = List.of(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> isEven = partitioned.stream()
                .collect(Collectors.partitioningBy(number -> number % 2 == 0));
        System.out.println("partitionedByIsEven = " + isEven);

    }
}
