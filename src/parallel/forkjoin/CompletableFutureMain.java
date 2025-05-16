package parallel.forkjoin;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static util.MyLogger.log;

public class CompletableFutureMain {
    public static void main(String[] args) {
        CompletableFuture.runAsync(() -> log("Fork/Join"));

        ExecutorService es = Executors.newFixedThreadPool(100);
        CompletableFuture.runAsync(() -> log("Custom Pool"), es);

        es.close();
    }
}
