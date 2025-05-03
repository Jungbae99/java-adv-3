package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.filter.IntegerFilter;
import lambda.lambda5.map.GenericMapper;
import lambda.lambda5.map.StringToIntegerMapper;

import java.util.ArrayList;
import java.util.List;

public class Ex1_Number {
    public static void main(String[] args) {
        // 짝수만 남기고, 남은 값의 2배를 반환해라
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> directResult = direct(numbers);
        System.out.println("directResult = " + directResult);

        List<Integer> lambdaResult = lambda(numbers);
        System.out.println("lambdaResult = " + lambdaResult);

    }

    private static List<Integer> direct(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result.add(number * 2);
            }
        }
        return result;
    }

    private static List<Integer> lambda(List<Integer> numbers) {
        // 람다로 뽑으면 ... 필터로 짝수만 그러고 Integer mapper 로 2배 만들자.
        List<Integer> filtered = GenericFilter.filter(numbers, n -> n % 2 == 0);
        List<Integer> mapped = GenericMapper.map(filtered, f -> f * 2);
        return mapped;
    }
}
