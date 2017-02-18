package example1;

import java.io.IOException;

/**
 * 1. Java exception hierarchy
 * 2. Exmaples of checked/unchecked exceptions, errors?
 * 3. Can unchecked exception be secified in throws section?
 * 4. Can exception be secified multiple times?
 */
public class JavaExceptionExample {

    /**
     * {@link java.lang.Throwable} --> {@link java.lang.Error} (unchecked)
     * ------------------------------> {@link java.lang.Exception} --> (checked)
     * --------------------------------------------------------------> {@link java.lang.RuntimeException} (unchecked)
     * <p>
     * Exception which are checked at Compile time called Checked Exception.
     * Some these are mentioned below. If in your code if some of method throws a checked exception,
     * then the method must either handle the exception or it must specify the exception using throws keyword.
     * IOException
     * SQLException
     * DataAccessException
     * ClassNotFoundException
     * InvocationTargetException
     * MalformedURLException
     * <p>
     * Unchecked Exception in Java is those Exceptions whose handling is NOT verified during Compile time.
     * These exceptions occurs because of bad programming. The program won’t give a compilation error.
     * All Unchecked exceptions are direct sub classes of RuntimeException class.
     * <p>
     * NullPointerException
     * ArrayIndexOutOfBound
     * IllegalArgumentException
     * IllegalStateException
     * <p>
     * Errors are also unchecked exception & the programmer is not required to do anything with these.
     * In fact it is a bad idea to use a try-catch clause for Errors. Most often, recovery from an Error
     * is not possible & the program should be allowed to terminate. Examples include OutOfMemoryError,
     * StackOverflowError, etc.
     */
    public void method() throws NullPointerException, IOException, IOException {
    }
}
