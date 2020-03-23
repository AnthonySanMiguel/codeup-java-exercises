import java.util.Scanner; // Imports Scanner functionality

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }
//------------------------------------
//        int y = 0;
//        do {
//            System.out.println(y);
//            y = y + 2;
//        } while(y <= 100);

        for (int y = 0; y <= 100; y = y + 2) {
            System.out.println(y);
        }
//------------------------------------
//        int x = 100;
//        do {
//            System.out.println(x);
//            x = x - 5;
//        } while(x >= -10);

        for (int x = 100; x >= -10; x = x - 5) {
            System.out.println(x);
        }
//------------------------------------
//        long z = 2; // Use 'long' type rather than 'int' as using 'int' will cause memory overflow error as it will exceed the available memory
//        do {
//            System.out.println(z);
//            z = z * z;
//        } while(z <= 1000000);

        for (long z = 2; z <= 1000000; z = z * z) {
            System.out.println(z);
        }
//------------------------------------
        for (int a = 1; a <= 100; a++) {
            if (a % 15 == 0) { // Check for the common denominator (3 and 5), or 15, first; ensuring 15 is printed as FizzBuzz
                System.out.println(a + ": FizzBuzz");
            } else if (a % 3 == 0) {
                System.out.println(a + ": Fizz");
            } else if (a % 5 == 0) {
                System.out.println(a + ": Buzz");
            } else { // If not evenly divisible by 3, 5, or 15, print out just the number
                System.out.println(a);
            }

//        Scanner userNumber = new Scanner(System.in);
//        String userConfirm = "Y";
//
//        System.out.print("Enter a number for analysis: ");
//
//        int userInput = Integer.parseInt(userNumber.nextLine());
//        System.out.println(
//                "Number" + " | " + "Squared" + " | " + "Cubed" + "\n" +
//                "------" + " | " + "------" + " | " + "------");
//
//        for (long o = 1; o <= userInput; o++) {
//            System.out.printf("%1s%n", o + " | " + (o * o) + " | " + (o * o * o));
//            if (o == userInput) {
//                break;
//            }
//        }
//    }
//}
            // INSTRUCTOR SOLUTION

            Scanner userNumber = new Scanner(System.in); // Captures input entered in scanner as "userNumber"
            String userConfirm = "Y";

            while (userConfirm.equalsIgnoreCase("y")) {
                System.out.println("What number would you like to go up to?");
                int num = Integer.parseInt(userNumber.nextLine());

                System.out.println("Here is your table!");
                System.out.println("number | squared | cubed");
                System.out.println("------ | ------ | ------"); // 6 dashed with a space after

                for (int counter = 1; counter <= num; counter++) {
                    System.out.printf("%-6d | %-7d | %d%n", counter, counter * counter, counter * counter * counter);
                }
                System.out.println("Would you like to test another number? Y/N");
                userConfirm = userNumber.nextLine();
            }
            System.out.println("Ok, have a nice day!");


            Scanner input = new Scanner(System.in); // Captures input entered in scanner as "input"

            boolean gradeContinue = true;
            do {
                System.out.println("Please enter a number grade");
                int numericGrade = input.nextInt();

                if (numericGrade >= 88) {
                    System.out.println("A");
                } else if (numericGrade >= 80) {
                    System.out.println("B");
                } else if (numericGrade >= 67) {
                    System.out.println("C");
                } else if (numericGrade >= 60) {
                    System.out.println("D");
                } else {
                    System.out.println("F");
                }

                System.out.println("Would you like to enter a new grade? (y/n)");
                String userResponse = input.next();

                if (!userResponse.equalsIgnoreCase("y")) {
                    gradeContinue = false;
                }

            } while (gradeContinue);
        }
    }
}
