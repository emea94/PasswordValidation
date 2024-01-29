package org.example;

import java.util.Scanner;

public class passwortValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input from user:
        System.out.println("Please enter your password:");
        String passwort = scanner.nextLine();

        // If password meets all criteria from method passwordIsValid then return sout1, else return sout2
        if (passwordIsValid(passwort)) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is invalid!");
        }

    }

    public static boolean passwordIsValid(String passwort) {
        // A method that ensures a password is at least 8 characters long.
        if (passwort.length() < 8) {
            System.out.println("Your password has to be at least 8 characters long.");
            return false;
        }

        // With another method, you want to check if the password contains digits.
        // .* = any number of characters or none at all
        // \\d = any decimal digit between 0-9
        if (!passwort.matches(".*\\d.*")) {
            System.out.println("Your password must contain at least one number");
            return false;
        }

        // Additionally, you want to ensure with a method that both uppercase and lowercase letters are used in the password.
        if (!passwort.matches(".*[A-Z].*")) {
            System.out.println("Your password must contain at least one capital letter.");
            return false;
        }

        if (!passwort.matches(".*[a-z].*")) {
            System.out.println("Your password must contain at least one small letter.");
            return false;
        }

        // And a method should detect commonly used passwords.
        String[] commonPasswords = {"password", "passwort", "123456", "abcdef", "Passwort123"};

        for (String commonPassword : commonPasswords) {
            if (passwort.toLowerCase().equals(commonPassword)) {
                System.out.println("The password is insecure because it is used too often.");
                return false;
            }
        }
        // if all criteria are true, method is true and therefore main method prints line "Password is valid!
        return true;
    }
}