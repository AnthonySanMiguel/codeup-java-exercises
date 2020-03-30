import java.util.Scanner; // Imports Scanner functionality

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159; // Setup
//        System.out.printf("The output of pi is approximately: %.2f", pi); // "f" after print is for format command; "f" after .2 is to output as 'floating point' number
//
        Scanner scanner = new Scanner(System.in); // Stores user input entered in scanner prompt in 'scanner' variable

//        System.out.println("\nType your favorite number here ->: (then press 'Enter')"); // Step 1
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: \"" + userInput + "\"");
//
        Scanner input = new Scanner(System.in); // Stores user input entered in scanner prompt in 'input' variable

//        System.out.println("Type three words..."); // Step 2
//        String word1 = input.next();
//        String word2 = input.next();
//        String word3 = input.next();
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);

//        System.out.println("Enter your favorite quote below:"); // Step 3
//        String quote = input.nextLine(); // Need 'Line' after next, else only the first word is returned
//        System.out.println(quote);

          System.out.println("Please enter a length"); // Step 4
          int length = Integer.parseInt(input.nextLine());
          System.out.println("Please enter a width");
          int width = Integer.parseInt(input.nextLine());

          int area = length * width;
          int perimeter = (2 * width) + (2 * length);

          System.out.println("Perimeter = " + perimeter);
          System.out.println("Area = " + area);
    }
}
