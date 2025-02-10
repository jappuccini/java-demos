package java1.finalmodifier;

public class Example {
    public static void main(String[] args) {
        final char gender = 'm';
        System.out.println(gender);
        gender = 'w'; // nicht möglich keine neuzuweisung da final

        final Human steffen = new Human("Steffen");
        steffen.lastName = "Stefinski"; // nicht möglich da const
        System.out.println(steffen.firstName);
        steffen.lastName = "Maglio"; // möglich!
        steffen = new Human("Marianna"); // nicht möglich keine neuzuweisung da final
    }
}