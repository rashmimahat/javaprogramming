package day1;

import java.util.Scanner;

public class FindFingerName {
	
	public static void main(String args[]) {
			
		        Scanner scanner = new Scanner(System.in);
		        int fingerNumber;

		        do {
		            System.out.print("Enter a number (1-5) to find the corresponding finger name: ");
		            fingerNumber = scanner.nextInt();

		            switch (fingerNumber) {
		                case 1:
		                    System.out.println("1 = Index finger");
		                    break;
		                case 2:
		                    System.out.println("2 = Big finger");
		                    break;
		                case 3:
		                    System.out.println("3 = Ring finger");
		                    break;
		                case 4:
		                    System.out.println("4 = Pinky finger");
		                    break;
		                case 5:
		                    System.out.println("5 = Thumb finger");
		                    break;
		                default:
		                    System.out.println("Invalid input! Please enter a number between 1 and 5.");
		            }
		        } while (fingerNumber < 1 || fingerNumber > 5);

		        scanner.close();
		    }
	}
