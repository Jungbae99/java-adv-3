package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV4 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> numbers = StringToIntegerMapper.map(list, s -> Integer.valueOf(s));
        System.out.println("numbers = " + numbers);

        // 문자열 길이
        List<Integer> lengths = StringToIntegerMapper.map(list, s -> s.length());
        System.out.println("lengths = " + lengths);
    }

}
