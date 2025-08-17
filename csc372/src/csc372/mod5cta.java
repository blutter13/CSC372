package csc372;
import java.util.Scanner;

//Benjamin Lutter CSC372 Mod 5 CTA
public class mod5cta {
	/**
	 * Recursive method to get product of an array of inputs
	 * @param inputs
	 * @param index
	 * @return
	 */
public static int getProduct(int[] inputs, int index) {
	if(index == inputs.length) { //Base case - return 1 to the previous recursive call to preserve the product due to identity principle
		return 1;
	}
	else {
		return inputs[index] * getProduct(inputs, index+1); //Recursive method call
	}
}

/**
 * Method to gather user input and store in an array, call getProduct, and print the product of the inputs.
 */
public static void calcProduct() {
	try(Scanner scnr = new Scanner(System.in)) {
		int[] input = {0, 0, 0, 0, 0};
		for(int i = 0; i < 5; i++) {
			try {
				System.out.println("Please enter a number to multiply (" + (i+1) +"/5) : ");
				input[i] = scnr.nextInt();
			}
			catch(Exception e) {
				System.out.println("You must input integers.");
			}
		}
		System.out.println("The product is " + getProduct(input, 0));
	}
	catch (Exception e) {
		System.out.println("Error occurred while taking user input: " + e.getMessage());
	}
}

public static void main(String[] args) {
	calcProduct();
}
}
