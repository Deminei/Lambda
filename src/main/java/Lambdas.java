import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdas {
    public static void main(String[] args) {
        //Addition
        Operation add = Integer::sum;
        System.out.println("Addition: " + add.operate(5, 3));

        //Subtraction
        Operation subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtract.operate(5, 3));

        //Multiplication
        Operation multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.operate(5, 3));

        //Division
        Operation divide = (a, b) -> a / b;
        System.out.println("Division: " + divide.operate(6, 3));

        //Custom functional interface for checking if number is even
        NumberChecker evenChecker = number -> number % 2 == 0;
        System.out.println("Is 6 even? " + evenChecker.checkNumber(6));
        System.out.println("Is 7 even? " + evenChecker.checkNumber(7));

        //Custom functional interface for calculating the square of a number
        NumberCalculator squareCalculator = number -> number * number;
        System.out.println("Square of 4: " + squareCalculator.calculateNumber(4));
        System.out.println("Square of 8: " + squareCalculator.calculateNumber(8));

        //Predicate checks if a number is positive
        Predicate<Integer> isPositive = number -> number > 0;
        System.out.println("Is 5 positive? " + isPositive.test(5));
        System.out.println("Is -2 positive? " + isPositive.test(-2));

        //Function converts a string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println("Uppercase of 'howdy': " + toUpperCase.apply("howdy"));
        System.out.println("Uppercase of 'buddy boy': " + toUpperCase.apply("buddy boy"));

        //Consumer prints each element of a list
        Consumer<String> printElement = element -> System.out.println("Elements of arrray list: " + element);
        List<String> pirate = Arrays.asList("Yar", "Arr", "Arrr ye matey", "Ahoy", "Thar be a land lubber");
        pirate.forEach(printElement);

        //Supplier generates random number
        Supplier<Integer> randomGenerator = () -> (int) (Math.random() * 100);
        System.out.println("Random number: " + randomGenerator.get());
    }

    //Functional interface for operations
    interface Operation {
        int operate(int a, int b);
    }

    //Custom functional interface for number checking
    interface NumberChecker {
        boolean checkNumber(int number);
    }

    //Custom functional interface for number calculation
    interface NumberCalculator {
        int calculateNumber(int number);
    }
}
