package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamMainV1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        returnValue(numbers);
    }

    private static void returnValue(List<Integer> numbers) {
        MyStreamV1 stream = new MyStreamV1(numbers);
        MyStreamV1 filteredStream = stream.filter(n -> n % 2 == 0);
        System.out.println("filteredStream = " + filteredStream.toList());

        MyStreamV1 mappedStream = filteredStream.map(n -> n * 2);
        System.out.println("mappedStream = " + mappedStream.toList());

        List<Integer> list = stream
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .toList();

        System.out.println("list = " + list);

    }
}
