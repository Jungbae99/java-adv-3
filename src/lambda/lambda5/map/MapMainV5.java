package lambda.lambda5.map;

import java.util.List;

public class MapMainV5 {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");

        // String -> String
        List<String> upperFruits = GenericMapper.map(fruits, s -> s.toUpperCase());
        System.out.println(upperFruits);

        // String -> Integer
        List<Integer> lengthFruits = GenericMapper.map(fruits, s -> s.length());
        System.out.println(lengthFruits);

        // Integer -> String
        List<Integer> integers = List.of(1, 2, 3);
        List<String> starList = GenericMapper.map(integers, n -> "*".repeat(n));
        System.out.println(starList);
    }

}
