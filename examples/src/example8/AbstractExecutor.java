package example8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public abstract class AbstractExecutor {

    void stop(ExecutorService executorService) {
        try {
            executorService.shutdown();
            executorService.awaitTermination(60, TimeUnit.SECONDS);
        }
        catch (InterruptedException e) {
            System.err.println("termination interrupted");
        }
        finally {
            if (!executorService.isTerminated()) {
                System.err.println("killing non-finished tasks");
            }
            executorService.shutdownNow();
        }
    }
}
