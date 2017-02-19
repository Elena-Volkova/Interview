package example8;

/**
 * Increment an integer from 0 to 10000 simultaneously from 2 threads
 */
public class ConcurrencyExample {

    public static void main(String[] args) {
        new AtomicIntegerExecutor().runExecutor();
        new SynchronizedMethodExecutor().runExecutor();
        new SynchronizedBlockExecutor().runExecutor();
    }
}
