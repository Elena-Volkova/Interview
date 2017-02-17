package quizful.quiz6;

/**
 * Откуда-то был вызван метод handle с какими-то параметрами, и было получено:
 * Exception in thread "main" java.lang.NullPointerException
 * at TestNPE.handle(TestNPE.java:21)
 * В чём причина исключения — в f или s? Чтобы поменялось, если бы в девятой строчке было бы написано так:
 * if("".equals(s))
 */
class Formatter {
    public String format(String value) {
        return "[" + value + "]";
    }
}

public class Quiz6 {
    public static String handle(Formatter f, String s) {
        if (s.isEmpty()) {
            return "(none)";
        }
        return f.format(s.trim());
    }
}

/**
 * Метод format не статический, и f вполне может быть источником ошибки. Зато s не может быть:
 * в девятой строке уже было обращение к s. Если бы s было null, исключение бы случилось в девятой строке.
 * Просмотр логики кода перед исключением довольно часто помогает отбросить некоторые варианты. Источник ошибки - f.
 * <p>
 * Если бы в девятой строчке было бы написано так:
 * if("".equals(s)), то обращения к полям и методам s нет, а метод equals корректно обрабатывает null,
 * возвращая false, поэтому в таком случае ошибку в 12-й строке мог вызвать как f, так и s.
 */