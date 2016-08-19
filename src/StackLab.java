//INSTRUCTIONS
//for loop (go over chars one at a time)
//if (if the char is a number)
//push to the stack
//else
//pop two numbers
//do the operation
//push the result back to the stack

//use the following:
//52*3+
//63-1+

import java.util.Scanner;
import java.util.Stack;

public class StackLab {

	public static void main(String[] args) {

		String userInput = "";
		String state = "+";

		// initialize Scanner; read user input
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter numbers and operators here: ");
		userInput = scan1.nextLine();

		// create new stack object
		Stack stack = new Stack();

		// use parseInt to change String userInput to an int
		// int userInputInt = Integer.parseInt(userInput);

		// for loop (go over chars one at a time)
		for (int i = 0; i < userInput.length(); i++) {
			// if (if the char is a number), push to the stack
			if (Character.isDigit(userInput.charAt(i))) {
				stack.push(userInput.charAt(i));
				// else pop two numbers and perform the operation
			} else if (!Character.isDigit(userInput.charAt(i))) {
				Integer x = (Integer) stack.pop();
				Integer y = (Integer) stack.pop();

				// create switch case to evaluate operators
				switch (state) {
				case "+":
					System.out.println(x + y);
					break;
				case "-":
					System.out.println(x - y);
					break;
				case "*":
					System.out.println(x * y);
					break;
				case "/":
					System.out.println(x / y);
					break;
				}
			}
			scan1.close();
		}
	}
}

//still not working.  want to try something like this: 
//Character.getNumericValue(element.charAt(i));
