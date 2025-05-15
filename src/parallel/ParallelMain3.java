package parallel;

import java.util.concurrent.*;

import static util.MyLogger.log;

public class ParallelMain3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();

        ExecutorService es = Executors.newFixedThreadPool(2);
        Integer result1 = es.submit(new SumTask(1, 4)).get();
        Integer result2 = es.submit(new SumTask(5, 8)).get();

        int sum = result1 + result2;
        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime) + "ms, sum: " + sum);
        es.close();
    }

    static class SumTask implements Callable<Integer> {
        int startValue;
        int endValue;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public Integer call() {
            log("작업 시작");
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                int calculated = HeavyJob.heavyTask(i);
                sum += calculated;
            }
            return sum;
        }
    }
}
