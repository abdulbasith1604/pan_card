package card;

import java.util.Random;
import java.util.Scanner;

public class PANCard {

    private static String generateLetters(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char randChar = (char) ('A' + random.nextInt(26));
            sb.append(randChar);
        }
        return sb.toString();
    }

    private static String generateDigits(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randDigit = random.nextInt(10);
            sb.append(randDigit);
        }
        return sb.toString();
    }


    private static char generateAlphabet() {
        Random random = new Random();
        return (char) ('A' + random.nextInt(26));
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter a name:");
			String name = s.nextLine();


			if (name == null || name.length() == 0) {
			    System.out.println("Invalid input. Please enter a valid name.");
			    return;
			}


			String randLetters = generateLetters(4);
			char firstLetter = Character.toUpperCase(name.charAt(0));
			String randDigits = generateDigits(4);
			char randAlphabet = generateAlphabet();

			
			String panCardNumber = randLetters + firstLetter + randDigits + randAlphabet;


			System.out.println("Generated PAN Card Number: " + panCardNumber);
		}
    }
}
