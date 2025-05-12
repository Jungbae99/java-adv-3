package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Collectors 는 뒤에서 더 자세히 (복잡한 수집이 필요할 때 사용)
        System.out.println("1. collect - List 수집");
        List<Integer> evenNumber1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("evenNumber1 = " + evenNumber1);

        System.out.println("2. toList() - (Java16+)");
        List<Integer> evenNumber2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("evenNumber2 = " + evenNumber2);

        System.out.println("3. toArray - 배열로 변환");
        Integer[] arr = numbers.stream()
                .filter(e -> e % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println("arr = " + Arrays.toString(arr));

        System.out.println("4. forEach - 각요소를 처리");
        numbers.stream()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));

        System.out.println("5. count - 요소 개수");
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("5보다 큰 숫자 개수: " + count);

        System.out.println("6. reduce - 요소들의 합");
        System.out.println("초기값이 없는 reduce");
        Optional<Integer> sum1 = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("합계(초기값 없음) = " + sum1.get());
        // 처음엔 1,2 가 들어감 -> 3
        // 3 + 3이 들어감 -> 6
        // 6 + 4가 들어감 -> 10 .....

        System.out.println("초기값이 있는 reduce");
        int sum2 = numbers.stream()
                .reduce(100, (a, b) -> a + b);
        System.out.println("합계(초기값 100) = " + sum2);

        System.out.println("7. min - 최솟값");
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        System.out.println("최솟값: " + min.get());

        System.out.println("8. max - 최댓값");
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("최댓값: " + max.get());

        System.out.println("9. findFirst() - 첫 번째 요소");
        Integer first = numbers.stream()
                .filter(n -> n > 5)
                .findFirst().get();
        System.out.println("첫번째 값 = " + first);
        
        System.out.println("9. findAny() - 아무 요소나 찾기");
        Integer any = numbers.stream()
                .filter(n -> n > 5)
                .findAny().get();
        // 여러 스레드가 돌릴 때 유용 (특정 스레드가 먼저 찾은 것)
        System.out.println("any 값 = " + any);

        System.out.println("11. anyMatch - 조건을 만족하는 존재 여부");
        boolean hasEven = numbers.stream()
                .anyMatch(e -> e % 2 == 0);
        System.out.println("hasEven = " + hasEven);

        System.out.println("12. allMatch - 모든 요소가 조건을 만족하는지");
        boolean allPositive = numbers.stream()
                .allMatch(e -> e > 0);
        System.out.println("allPositive = " + allPositive);

        System.out.println("13. noneMatch - 조건을 만족하는 요소가 없는지");
        boolean noNegative = numbers.stream()
                .noneMatch(e -> e < 0);
        System.out.println("noNegative = " + noNegative);
    }
}
