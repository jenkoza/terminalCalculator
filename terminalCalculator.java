import java.util.Scanner;

public class terminalCalculator {
    public static void userDialog() {
        System.out.println("\n" + "Please choose one of the following operators to perform a calculation:\n" + "\n"
                + "+ - * /\n ");
    }

    public static int additionCalculator(int num1, int num2) {
        int sumAddition = num1 + num2;
        System.out.println("\n" + "Your Answer is:\n" + sumAddition);
        return sumAddition;
    }

    public static int subtractionCalculator(int num3, int num4) {
        int sumSubtraction = num3 - num4;
        System.out.println("\n" + "Your Answer is:\n" + sumSubtraction);
        return sumSubtraction;
    }

    public static int multiplicationCalculator(int num5, int num6) {
        int sumMultiplication = num5 * num6;
        System.out.println("\n" + "Your Answer is:\n" + sumMultiplication);
        return sumMultiplication;
    }

    public static int divisionCalculator(int num7, int num8) {
        int sumDivision = num7 / num8;
        System.out.println("\n" + "Your Answer is:\n" + sumDivision);
        return sumDivision;
    }

    public static void main(String[] args) {
        while (true) {
            userDialog();
            Scanner readDialog = new Scanner(System.in);
            String receivedInput = readDialog.nextLine();
            if (receivedInput.equals("+") || receivedInput.equals("-") || receivedInput.equals("*")
                    || receivedInput.equals("/")) {
                int receivedNumber1;
                do {
                    System.out.println("\nEnter the first number: ");
                    Scanner firstNumber = new Scanner(System.in);
                    String input = firstNumber.nextLine();
                    receivedNumber1 = parseInteger(input);
                } while (receivedNumber1 == Integer.MIN_VALUE);
                int receivedNumber2;
                do {
                    System.out.println("Enter the second number: ");
                    Scanner secondNumber = new Scanner(System.in);
                    String input = secondNumber.nextLine();
                    receivedNumber2 = parseInteger(input);
                } while (receivedNumber2 == Integer.MIN_VALUE);
                if (receivedInput.equals("+")) {
                    additionCalculator(receivedNumber1, receivedNumber2);
                } else if (receivedInput.equals("-")) {
                    subtractionCalculator(receivedNumber1, receivedNumber2);
                } else if (receivedInput.equals("*")) {
                    multiplicationCalculator(receivedNumber1, receivedNumber2);
                } else if (receivedInput.equals("/")) {
                    divisionCalculator(receivedNumber1, receivedNumber2);
                } else {
                    System.out.println("\nOops. It looks like you've made a mistake.\n");
                }
                Scanner yesOrNo = new Scanner(System.in);
                System.out.println("Would you like to try again?\n (y/n) \n");
                String answerYesOrNo = yesOrNo.next();
                switch (answerYesOrNo) {
                    case "Y":
                    case "y":
                        System.out.println("\nGreat!");
                        break;
                    case "N":
                    case "n":
                        System.out.println("\nGoodbye!");
                        return;
                    default:
                        System.out.println("\nInvalid input! Exiting...");
                        return;
                }
            } else {
                System.out.println("\nInvalid operator! Please try again.\n");
            }
        }
    }

    public static int parseInteger(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("\nYour input was not a valid number.");
            return Integer.MIN_VALUE;
        }
    }
}