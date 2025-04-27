package lambda.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 1. 정수리스트가 주어졌을때, 특정 조건에 맞는 요소들만 뽑아내는 filter 를 만들어보자.
 * filter(List<Integer> list, MyPredicate predicate) 형식의 정적메서드를 하나 작성한다.
 * MyPredicate 는 함수형인터페이스이며, boolean test(int value); 를 갖는다.
 * 조건1 : 음수(negative)만 골라내기.
 * 조건2 : 짝수(even)만 골라내기.
 */
public class FilterExampleEx1 {
    public static void main(String[] args) {
        List<Integer> negatives = filter(Arrays.asList(1, 5, 2, 6, 2, 15, 17, 28, -1, -3), (value) -> value < 0);
        List<Integer> evens = filter(Arrays.asList(1, 5, 2, 6, 2), (value) -> value % 2 == 0);

        System.out.println(Arrays.toString(negatives.toArray()));
        System.out.println(Arrays.toString(evens.toArray()));
    }

    static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> answer = new ArrayList<>();
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                answer.add(integer);
            }
        }
        return answer;
        // ez
    }
}
