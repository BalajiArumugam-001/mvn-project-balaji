package com.fssa.balaji.day18.solved;

class ValidationUtil {
	public static boolean validateAge(int age) throws IllegalArgumentException {
		if (age <= 0) {// Check if the age is a posotive value
			throw new IllegalArgumentException("Invalid age");

		} else {
			return true;
		}
	}
}

/**
 * Main class to test the validation Util class without using JUNIT
 * 
 * @author BharathwajSoundarara
 *
 */
public class TestValidationUtil {
	public static void main(String[] args) {
		// test case to check if the valid age is validated correctly
		testPostiveValidateAge();

		// test case if exception is thrown if we send a negative or zero value
		testNegativeValidateAge();
	}

	/**
	 * It will pass a positive number to validateAge method and print if the
	 * test case has passed else it will print test case failed
	 */
	public static void testPostiveValidateAge() {
		
		if(ValidationUtil.validateAge(9)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}

	}
	
	/**
	 * It will pass a -ve number to validateAge method and print the
	 * test case has passed if an exception is thrown else it will print 
	 * test case failed
	 */
	public static void testNegativeValidateAge() {
		try {
			ValidationUtil.validateAge(-8);
			System.out.println("Test case failed");
		}
		catch (IllegalArgumentException ex) {
			System.out.println("Test case passed");
		}

	}

}