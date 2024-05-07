package day1;

import java.util.Scanner;

public class FindFingerName {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (1-10): ");
            int fingerNumber = scanner.nextInt();

            String fingerName = getFingerName(fingerNumber);

            if (fingerName != null) {
                System.out.println(fingerNumber + " = " + fingerName);
                break;
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
            }
        }

        scanner.close();
    }

    public static String getFingerName(int number) {
        switch (number) {
            case 1:
                return "Index finger";
            case 2:
                return "Big finger";
            case 3:
                return "Ring finger";
            case 4:
                return "Pinky finger";
            case 5:
                return "Thumb finger";
            case 6:
                return "little finger1";
            case 7:
                return "Bittle finger2";
            case 8:
                return "Tittle finger3";
            case 9:
                return "Mittle finger4";
            case 10:
                return "Gittle finger5";
            default:
                return null;
        }
    }
}