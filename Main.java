/*
* The "Main" program lets the user interact with the parameters from Lock.java
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-22
*/

import java.util.Scanner;

/**
* This is a program that lets the user interact with the parameters from
* Lock.java.
*/
final class Main {

    /**
    * 3.
    */
    public static final int C3 = 3;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        Lock lockVariable = new Lock();

        int userChoice = 0;

        try {
            while (userChoice != C3 && userChoice != 2) {
                final Scanner userInput = new Scanner(System.in);
                System.out.print("Would you like to (input 1) change the");
                System.out.print(" combination, (input 2) unlock the lock, or");
                System.out.print(" (input 3) exit?: ");
                userChoice = userInput.nextInt();

                switch (userChoice) {
                    case 1:
                        final Scanner userInt = new Scanner(System.in);
                        System.out.print("\nEnter your old password (the ");
                        System.out.print("default password is 0000 if it has");
                        System.out.print(" not been set): ");
                        final int passCheck = userInt.nextInt();

                        if (passCheck == lockVariable.combination) {
                            final Scanner userInt2 = new Scanner(System.in);
                            System.out.print("\nEnter your new password ");
                            System.out.print("(int): ");
                            final int newCombo = userInt2.nextInt();
                            lockVariable.changeCombination(newCombo);

                        } else {
                            System.out.print("\nYou have not entered the ");
                            System.out.println("correct password!");
                        }
                        break;

                    case 2:
                        final Scanner userInt3 = new Scanner(System.in);
                        System.out.print("\nEnter your current password: ");
                        final int enteredCombo = userInt3.nextInt();

                        if (enteredCombo == lockVariable.combination) {
                            System.out.print("\nYou have unlocked the ");
                            System.out.println("lock!");

                        } else {
                            System.out.print("\nYou have not entered the ");
                            System.out.println("correct password!");

                        }
                        break;

                    case 3:
                        break;

                    default:
                        System.out.print("\nYou have not entered a valid ");
                        System.out.println("integer!");
                        break;
                }
            }
        } catch (java.util.InputMismatchException errorCode) {
                System.out.println("\nYou have not entered a valid input.");
        }

        System.out.println("\nDone.");
    }
}
