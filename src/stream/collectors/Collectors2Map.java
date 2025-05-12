package stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Map {
    public static void main(String[] args) {

        Map<String, Integer> collect = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        s -> s, // keyMapper
                        String::length // valueMapper
                ));
        // key 중복 예외가 발생할 수 있다. IllegalStateException
        System.out.println("collect = " + collect);

        // 키 중복 대안 (병합)
        Map<String, Integer> map3 = Stream.of("Apple", "Banana", "Tomato", "Apple")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length(),
                        (oldVal, newVal) -> oldVal + newVal
                ));

        // map 의 타입을 지정할 수 있다.
        Map<String, Integer> map4 = Stream.of("Apple", "Banana", "Tomato", "Apple")
                .collect(Collectors.toMap(
                        name -> name,
                        name -> name.length(),
                        (oldVal, newVal) -> oldVal + newVal, // 중복될경우 기존 값 + 새 값
                        LinkedHashMap::new
                ));

        System.out.println("map4 = " + map4.getClass());
        System.out.println("map4 = " + map4);
    }
}
