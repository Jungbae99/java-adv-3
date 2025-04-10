package lambda.ex2;

import java.util.Arrays;
import java.util.List;

/**
 * initial 은 누적계산의 초깃값을 지정한다.
 */
public class ReducerExampleEx1 {

    public static void main(String[] args) {
        int answer = reduce(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 0, (a, b) -> a + b);
        System.out.println("answer = " + answer);
    }

    public static int reduce(List<Integer> list, int initial, MyReducer reducer) {
        for (Integer integer : list) {
            initial = reducer.reduce(integer, initial);
        }
        return initial;
    }

}
