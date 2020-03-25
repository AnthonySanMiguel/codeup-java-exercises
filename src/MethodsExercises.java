import java.util.Scanner; // Imports Scanner functionality

class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(10, 25));
        System.out.println(subtraction(10, 25));
        System.out.println(multiplication(10, 25));
        System.out.println(division(10, 25));

        System.out.println(getInteger(1, 10));
    }

    public static int addition(int firstNumber, int secondNumber) { //Specify data type, then name for each parameter
        return firstNumber + secondNumber;
    }
    public static int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public static int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public static int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public static int getInteger(int x, int y) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d: ", x, y);
        int numInput = input.nextInt();
        if (numInput < x || numInput > y) {
            System.out.printf("Error: Number must be between %d and %d: \n", x, y);
            return getInteger(x, y);
        }
        return numInput;
    }
}
