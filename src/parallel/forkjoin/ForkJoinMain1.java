package parallel.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ForkJoinMain1 {
    public static void main(String[] args) {
        List<Integer> data = IntStream.rangeClosed(1, 16)
                .boxed()
                .toList();
        log("[생성] " + data);

        // ForkJoinPool 생성 작업 수행
        long startTime = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool(10);
        SumTask task = new SumTask(data); // [1 ~ 8]

        // 병렬로 합을 구한 후 결과 출력
        Integer result = pool.invoke(task);
        pool.close();
        long endTime = System.currentTimeMillis();

        log("time: " + (endTime - startTime) + "ms, result: " + result);
    }
}