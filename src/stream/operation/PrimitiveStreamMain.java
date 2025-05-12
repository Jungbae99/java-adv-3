package stream.operation;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {
    public static void main(String[] args) {

        // 기본형 특화 스트림 생성(IntStream, LongStream, DoubleStream)
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 범위 생성 메서드
        IntStream range1 = IntStream.range(1, 6); // [1,2,3,4,5]
        IntStream range2 = IntStream.rangeClosed(1, 5); // [1,2,3,4,5]

        // 1. 통계관련 메서드
        int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);

        // average(): 평균값 계산
        double avg = IntStream.range(1, 6).average().getAsDouble();
        System.out.println("avg = " + avg);

        // summaryStatistics() : 모든 통계 정보
        IntSummaryStatistics statistics = IntStream.range(1, 6).summaryStatistics();
        System.out.println("statistics.getSum() = " + statistics.getSum());
        System.out.println("statistics.getMax() = " + statistics.getMax());
        System.out.println("statistics.getMin() = " + statistics.getMin());
        System.out.println("statistics.getCount() = " + statistics.getCount());
        System.out.println("statistics.getAverage() = " + statistics.getAverage());

        // 2. 타입변환 메서드
        // IntStream -> LongStream
        LongStream longStream = IntStream.range(1, 5).asLongStream();
        // IntStream -> DoubleStream
        DoubleStream doubleStream = IntStream.range(1, 5).asDoubleStream();

        // IntStream -> Stream<Integer>
        Stream<Integer> boxedStream = IntStream.range(1, 5).boxed();

        // 3. 기본형 특화 매핑
        LongStream mappedLong = IntStream.range(1, 5)
                .mapToLong(i -> i * 10L);

        // int -> double
        DoubleStream mappedDouble = IntStream.range(1, 5)
                .mapToDouble(i -> i * 1.65);

        // int -> 객체 변환 매핑
        Stream<String> mappedObj = IntStream.range(1, 5)
                .mapToObj(i -> "Number: " + i);

        // 4. 객체스트림 -> 기본형 특화 스트림으로 매핑
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        IntStream intStream = integerStream.mapToInt(i -> i);
        int sum1 = intStream.sum();
        System.out.println("sum1 = " + sum1);

        // 5. 객체 -> 기본형으로 매핑 활용
        int result = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(i -> i)
                .sum();
        System.out.println("result = " + result);
    }
}
