package quizful;

public class Quiz1 {
    public static void main(String ... args) {
        Boolean b = new Boolean("/true");
        System.out.println(b); //false because parseBoolean checks ignore case 'true'
        main("test");
    }

    //Can't be more than 1 main class
/*    public static void main(String[] args) {
        Boolean b = new Boolean("/true");
        System.out.println(b);
    }*/

    //Not a main class
    public static void main(String args) {
        Boolean b = new Boolean("/false");
        System.out.println(b == false); // false equals false
    }
}
