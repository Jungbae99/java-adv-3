package stream.operation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationsMain {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 7, 8, 8, 9, 10);

        // 1. filter
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 2. map
        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 3. distinct
        numbers.stream()
                .distinct()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 4. sorted (기본 정렬)
        Stream.of(3, 2, 1, 6, 2, 5, 3, 74, 1, 3)
                .sorted()
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 5. 커스텀정렬
        System.out.println("5. Sorted with Comparator - 내림차순 정렬");
        Stream.of(3, 1, 5, 2, 2, 6, 3, 4, 2)
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n");

        // 6. peek ...
        System.out.println("6. peek - 동작 확인용");
        numbers.stream()
                .peek(n -> System.out.print("before : " + n + ", "))
                .map(n -> n * n)
                .peek(n -> System.out.print("After : " + n + ", "))
                .limit(5)
                .forEach(n -> System.out.print("최종값 : " + n + ", "));
        System.out.println("\n");

        // 7. limit ...
        // 8. skip ... 처음 n 개 요소 건너뛰기
        // 9. takeWhile (~~ 할때까지 조건을 만족할때까지 스트림을 실행), java9+
        // 10. dropWhile (~~할때까지 조건을 만족할때까지 스트림을 건너뜀), java9+

    }
}
