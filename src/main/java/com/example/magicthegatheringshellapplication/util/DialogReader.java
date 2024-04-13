package com.example.magicthegatheringshellapplication.util;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Scanner;

@Service
public class DialogReader {

    public String autocompleteDialog(Map<Integer, String> cardNames) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        Printer.printGreenColor("Enter the number of card name you want to find: ");
        String cardNumber = scanner.nextLine();

        cardNumber = validateAutocompleteCardNumberInput(cardNumber, cardNames.size());
        if (cardNumber != null) {
            return cardNames.get(Integer.parseInt(cardNumber));
        } else {
            return null;
        }
    }

    private String validateAutocompleteCardNumberInput(String cardNumber, Integer totalValues) {
        boolean done = false;
        do {
            done = validateCardNumberInput(cardNumber, totalValues);
            if (done) {
                return cardNumber;
            } else {
                Printer.printGreenColor("Would you like to try again? Y/n: ");
                Scanner scanner = new Scanner(System.in);
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("n")) {
                    return null;
                } else {
                    Printer.printGreenColor("Enter the number of card name you want to find: ");
                    cardNumber = scanner.nextLine();
                }
            }
        } while (!done);
        return cardNumber;
    }

    private Boolean validateCardNumberInput(String cardNumber, Integer totalValues) {
        Integer parsedResponse = null;
        try {
            parsedResponse = Integer.parseInt(cardNumber);
        } catch (NumberFormatException e) {
            Printer.printYellowColor("Please enter a valid number");
            return false;
        }
        if (parsedResponse > totalValues || parsedResponse < 1) {
            System.out.println();
            Printer.printYellowColor("Please enter a number between 1 and " + totalValues + ". Number " +
                    cardNumber + " is out of ranage.");
            return false;
        }
        return true;
    }
}
