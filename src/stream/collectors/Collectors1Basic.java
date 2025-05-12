package stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors1Basic {
    public static void main(String[] args) {

        // 기본 기능
        List<String> list = Stream.of("java", "Spring", "JPA")
                .collect(Collectors.toList()); // 수정 가능 리스트를 반환한다.
        System.out.println("list = " + list);

        // 수정 불가능 리스트
        List<Integer> unmodifiableList = Stream.of(1, 2, 3)
                .collect(Collectors.toUnmodifiableList());
        // unmodifiableList.add(4); runtime Exception 발생
        System.out.println("unmodifiableList = " + unmodifiableList);

        // Set 만들기
        Set<Integer> set = Stream.of(1, 2, 3, 3, 4, 5, 5, 5, 6, 10)
                .collect(Collectors.toSet());
        System.out.println("set = " + set);

        // 타입 지정
        TreeSet<Integer> treeSet = Stream.of(3, 4, 5, 2, 1)
                .collect(Collectors.toCollection(TreeSet::new)); // 정렬상태 유지
        System.out.println("treeSet = " + treeSet);


    }
}
