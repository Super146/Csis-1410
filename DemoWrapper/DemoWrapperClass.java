package DemoWrapper;

import java.util.Arrays;
import java.util.Random;

public class DemoWrapperClass {
	private static final Random rand = new Random();

	/**
	 * Returns a string that lists the minimum and maximum values of different
	 * number types.
	 */
	public static String minMax() {
		return "Byte : [" + Byte.MIN_VALUE + " , " + Byte.MAX_VALUE + "]\n" + "Short : [" + Short.MIN_VALUE + " , "
				+ Short.MAX_VALUE + "]\n" + "Integer: [" + Integer.MIN_VALUE + " , " + Integer.MAX_VALUE + "]\n"
				+ "Long : [" + Long.MIN_VALUE + " , " + Long.MAX_VALUE + "]\n" + "Float : [" + Float.MIN_VALUE + " , "
				+ Float.MAX_VALUE + "]\n" + "Double : [" + Double.MIN_VALUE + " , " + Double.MAX_VALUE + "]";
	}

	/**
	 * Returns a string with representations of a number in different bases (base
	 * 10, 16, 8, and 2).
	 *
	 * @param number The number to represent in different bases.
	 * @return A string with representations in base 10, 16, 8, and 2.
	 */
	public static String numberRepresentations(int number) {
		String base10 = Integer.toString(number);
		String base16 = Integer.toHexString(number);
		String base8 = Integer.toOctalString(number);
		String base2 = Integer.toBinaryString(number);


		    // Replace multiple spaces with a single space
		    return String.format("%-7s %-7s %-6s %s", base10, base16, base8, base2).replaceAll("\\s+", " ");
		}


	/**
	 * Returns a string with additional information about a character.
	 *
	 * @param c The character to analyze.
	 * @return A string with the character and additional information.
	 */
	public static String charProperties(char c) {
		if (Character.isLowerCase(c)) {
			return c + " lowercase letter";
		} else if (Character.isUpperCase(c)) {
			return c + " uppercase letter";
		} else if (Character.isDigit(c)) {
			return c + " number";
		} else if (Character.isWhitespace(c)) {
			return " white space";
		} else {
			return String.valueOf(c);
		}
	}

	/**
	 * Returns the sum of an array of numbers represented as strings.
	 *
	 * @param arr An array of strings representing numbers.
	 * @return The sum of the numbers in the array.
	 */
	public static double parseSum(String[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		double sum = 0;
		for (String numStr : arr) {
			try {
				double num = Double.parseDouble(numStr);
				sum += num;
			} catch (NumberFormatException e) {
				// Ignore invalid number formats
			}
		}

		return sum;
	}

	/**
	 * Returns a random three-digit number between 100 and 999.
	 *
	 * @return A random three-digit number.
	 */
	public static int getRandomThreeDigitNumber() {
		return rand.nextInt(900) + 100;
	}

	/**
	 * Returns a random upper or lowercase letter (a - z, A - Z).
	 *
	 * @return A random letter.
	 */
	public static char getRandomLetter() {
	    char randomChar;
	    boolean isLowercase = rand.nextBoolean(); // Generate random lowercase or uppercase letter

	    if (isLowercase) {
	        randomChar = (char) (rand.nextInt(26) + 'a'); // Random lowercase letter (a-z)
	    } else {
	        randomChar = (char) (rand.nextInt(26) + 'A'); // Random uppercase letter (A-Z)
	    }

	    return randomChar;
	}




	/*
	 * Demonstrates the functionality provided in class DemoWrapperClass.
	 *
	 */
	public static void main(String[] args) {
		Random rand = new Random();

		// Method minMax:
		System.out.println(minMax());
		System.out.println();

		// Method numberRepresentations:
		int[] numbers = { 9, 17, getRandomThreeDigitNumber(), 9876, 12345 };

		System.out.printf("%-7s %-7s %-6s %s%n", "Base 10", "Base 16", "Base 8", "Base 2");
		System.out.printf("%-7s %-7s %-6s %s%n", "-------", "-------", "------", "------");
		for (int n : numbers) {
			System.out.println(numberRepresentations(n));
		}
		System.out.println();

		// Method charProperties:
		char[] characters = { '8', ' ', '#', 'a', 'M', getRandomLetter() };

		for (char c : characters) {
			System.out.println(charProperties(c));
		}
		System.out.println();

		// Method parse:
		String[] numberArray = { "1.1", "2.5", "3.14", "40.04", "5.325", "63.5" };

		String[] wholeNumbers = new String[10];
		for (int i = 0; i < wholeNumbers.length; i++) {
			wholeNumbers[i] = "" + (rand.nextInt(90) + 10);
		}

		System.out.println(Arrays.deepToString(numberArray) + " .. sum = " + parseSum(numberArray));

	}
}
