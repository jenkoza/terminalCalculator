# terminalCalculator
 My first user friendly calculator made in the terminal using the Java programming language.
 
 My `terminalCalculator`  program is a command line calculator written in Java that allows users to perform basic arithmetic operations (+, -, *, /) on two numbers. The program consists of a main method, several methods for performing calculations, and a method to parse user input.
 
 1.  `userDialog()` : This method displays a message prompting the user to choose an arithmetic operator (+, -, *, /).
 2.  `additionCalculator(int num1, int num2)` ,  `subtractionCalculator(int num3, int num4)` ,  `multiplicationCalculator(int num5, int num6)` , and  `divisionCalculator(int num7, int num8)` : These methods perform addition, subtraction, multiplication, and division, respectively. They take two integer inputs, perform the corresponding operation, print the result, and return it.
 3.  `main(String[] args)` : This is the main method of the program. It uses a  `while`  loop to continuously prompt the user to enter an operator, two numbers, and then calls the appropriate calculation method based on the operator entered. If an invalid operator is entered, the user is prompted to try again. After a calculation is performed, the user is asked if they want to continue using the calculator (y/n). If the user chooses "n," the program terminates.
 4.  `parseInteger(String input)` : This method takes a string as input and attempts to parse it as an integer using the  `Integer.parseInt()`  method. If parsing is successful, the integer value is returned; otherwise, an error message is displayed, and  `Integer.MIN_VALUE`  is returned.
 
 Here's how the program works:
 1. The  `main`  method starts by calling  `userDialog()`  to prompt the user to enter an arithmetic operator.
2. The program reads the user's input using a  `Scanner`  object and stores it in the  `receivedInput`  variable.
3. If the input is a valid operator, the program prompts the user to enter two numbers. It uses the  `parseInteger()`  method to validate each input and ensure they are valid integers.
4. Once two valid integers are obtained, the program calls the appropriate calculation method based on the entered operator and displays the result.
5. The user is then asked if they want to try again (y/n). If they choose "y," the process repeats from step 1. If "n" is chosen, the program exits.
6. If the user enters an invalid operator, the program displays an error message and prompts them to try again.
 The program leverages Java's exception handling, looping constructs, and switch cases for input validation and control flow, ensuring a smooth user experience when using the terminal calculator.


[Author: Brandon Jenkins]
