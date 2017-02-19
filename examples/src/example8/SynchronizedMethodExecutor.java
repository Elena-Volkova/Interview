package example8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SynchronizedMethodExecutor extends AbstractExecutor {

    private int counter = 0;

    synchronized void incrementSync() {
        counter = counter + 1;
    }

    public void runExecutor() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.range(0, 10000)
                .forEach(i -> executorService.submit(this::incrementSync));
        stop(executorService);

        System.out.println("SynchronizedMethod counter value: " + counter);
    }
}
