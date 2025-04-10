package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;

public class M4MeasureTime {
    public static void main(String[] args) {
        measure(() -> {
            int n = 100;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += i;
            }
            System.out.println("[1부터 " + n + " 까지의 합] 결과 :" + sum);
        });
        measure(() -> {
            int[] arr = {4, 3, 2, 1};
            System.out.println("원본배열: " + Arrays.toString(arr));
            Arrays.sort(arr);
            System.out.println("정렬배열: " + Arrays.toString(arr));
        });
    }

    public static void measure(Procedure p) {
        long start = System.nanoTime();
        p.run();
        long end = System.nanoTime();
        System.out.println("걸린 시간 : " + (end - start) + "ns");
    }
}
