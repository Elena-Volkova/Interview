package quizful.quiz7;

public class Quiz7 {
    /**
     * Метод не скомпилируется, так как он ничего не возвращает: >> COMPILATION ERROR: Missing return statement
     */
    public static double sqr1(double arg) {
    }

    /**
     * Метод скомпилируется. Можно ничего не возвращать, а «повесить метод».
     */
    public static double sqr2(double arg) {
        while (true) ;
    }

    /**
     * Метод не скомпилируется, компилятор не может удостовериться, что возврат будет.
     * Что возвращать, если currentTimeMillis() - нечетное?
     * <p>
     * COMPILATION ERROR: Missing return statement
     */
    public static double sqr3(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg;
        }
    }

    /**
     * Метод скомпилируется. Компилятор следит, чтобы мы вернули экземпляр требуемого типа или экземпляр типа,
     * который можно неявно привести к требуемому. Так как можно неявно преобразовать int в double,
     * то метод скомпилируется.
     */
    public double sqr4(double arg) {
        int k = 1;
        return k;
    }

    /**
     * Метод скомпилируется. Механизм исключений позволяет ничего не возвращать.
     * RuntimeException - это unchecked exception, следовательно, его можно не объявлять в секции throws.
     */
    public static double sqr5(double arg) {
        throw new RuntimeException();
    }
}
