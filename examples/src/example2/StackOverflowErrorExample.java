package example2;

/**
 * How to deal with the StackOverflowError

 1. The simplest solution is to carefully inspect the stack trace and detect the repeating pattern of line numbers.
 These line numbers indicate the code being recursively called. Once you detect these lines, you must carefully
 inspect your code and understand why the recursion never terminates.
 2. If you have verified that the recursion is implemented correctly, you can increase the stack’s size,
 in order to allow a larger number of invocations. Depending on the Java Virtual Machine (JVM) installed,
 the default thread stack size may equal to either 512KB, or 1MB. You can increase the thread stack size
 using the -Xss flag. This flag can be specified either via the project’s configuration, or via the command line.
 The format of the -Xss argument is: -Xss[g|G|m|M|k|K]
 */
public class StackOverflowErrorExample {

    private static int COUNTER = 1;

    private static void stackOverFlowErrorMethod() {
        System.out.println("Method executed " + COUNTER++ + " times"); //1MB
        stackOverFlowErrorMethod();
    }

    public static void main(String[] args) {
        stackOverFlowErrorMethod();
    }
}
