package example8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicIntegerExecutor extends AbstractExecutor {

    private AtomicInteger counter = new AtomicInteger(0);

    public void runExecutor() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        IntStream.range(0, 10000)
                .forEach(i -> executorService.submit(counter::incrementAndGet));
        stop(executorService);

        System.out.println("AtomicInteger counter value: " + counter.get());
    }
}
