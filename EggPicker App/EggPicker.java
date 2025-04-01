package EggPickerApp;

import javax.swing.JOptionPane;
//import java.util.Scanner;

public class EggPicker {
    public static void main(String[] stringArray) {
        // User Input of boxes of Eggs
        String nb = JOptionPane.showInputDialog("How many boxes of eggs do you have? It should be between 1 and 18: ");
        while (nb.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 18: ", "ALERT",
                    JOptionPane.ERROR_MESSAGE);
            nb = JOptionPane.showInputDialog("How many boxes of eggs do you have? It should be between 1 and 18: ");
        }
        // Gets User Input and turns into Integer: numOfBoxes
        int numOfBoxes = Integer.parseInt(nb);

        // Checks if User Input is between 1-18
        if (numOfBoxes <= 1 || numOfBoxes >= 18) {
            while (numOfBoxes <= 1 || numOfBoxes >= 18) {
                JOptionPane.showMessageDialog(null,
                        "BoxCheck cannot with the amount of boxes loaded! Please pick a number between 1-18:", "ALERT",
                        JOptionPane.ERROR_MESSAGE);
                nb = JOptionPane.showInputDialog("How many boxes of eggs do you have? It should be between 1 and 18: ");
                numOfBoxes = Integer.parseInt(nb);
            }
        }

        // RandomBox
        JOptionPane.showMessageDialog(null, "randomBox will return a random number between 1 and " + numOfBoxes
                + " to select your egg from.", "EggPicker", JOptionPane.PLAIN_MESSAGE);
        System.out.println("randomBox will return a random number between 1 and " + numOfBoxes
                + " to select your egg from.");
        // Picks a random number between 1 and *user-input*
        int RandBox = (int) (Math.random() * (double) (numOfBoxes + 1));

        if (RandBox == 0) {
            while (RandBox == 0) {
                RandBox = (int) (Math.random() * (double) (numOfBoxes + 1));
            }
        } else {
            JOptionPane.showMessageDialog(null, "randomBox selects box " + RandBox, "EggPicker",
                    JOptionPane.PLAIN_MESSAGE);
        }

        JOptionPane.showMessageDialog(null, "EggPicker will now select a RandomEgg", "EggPicker",
                JOptionPane.PLAIN_MESSAGE);
        int RandEgg = (int) (Math.random() * 31.0);
        if (RandEgg == 0) {
            RandEgg = (int) (Math.random() * 31.0);
        } else {
            JOptionPane.showMessageDialog(null, "pickEgg has selected Egg " + RandEgg + " from Box " + RandBox
                    + ". We wish you and your partner good fortune.", "EggPicker", JOptionPane.PLAIN_MESSAGE);
        }
        System.out.println(RandBox);
        System.out.println(RandEgg);
    }

}
/*
 * Scanner scanner = new Scanner(System.in);
 * System.out.println("How many boxes of eggs do you have? ");
 * int n = scanner.nextInt();
 * String string = Integer.toString(n);
 * 
 * if (string == " ") {
 * System.out.println("Please enter a number: ");
 * System.out.println("How many boxes of eggs do you have? ");
 * n = scanner.nextInt();
 * }
 * if (n <= 1) {
 * while (n <= 1) {
 * System.out.
 * println("User has input low ammount of boxes to run BoxCheck. Please try again: "
 * );
 * System.out.println("How many boxes of eggs do you have? ");
 * n = scanner.nextInt();
 * }
 * if (n >= 18) {
 * while (n >= 18) {
 * System.out.
 * println("User has input too many boxes to run BoxCheck. Please try again: ");
 * System.out.println("How many boxes of eggs do you have? ");
 * n = scanner.nextInt();
 * }
 * }
 * }
 *
 * if (n2 == 0) {
 * n2 = (int) (Math.random() * (double) (n + 1));
 * } else {
 * System.out.println("randomBox selects box " + n2);
 * }
 * 
 * Scanner scanner2 = new Scanner(System.in);
 * System.out.println("Would you like to continue? Y/N");
 * String string2 = scanner2.nextLine();
 * if (!string2.equals("Y") && !string2.equals("N")) {
 * System.out.println("Please type in Y or N.");
 * System.out.println("Would you like to continue? Y/N");
 * string2 = scanner2.nextLine();
 * }
 * if (string2.equals("Y")) {
 * int n3 = (int) (Math.random() * 31.0);
 * if (n3 == 0) {
 * n3 = (int) (Math.random() * 31.0);
 * } else {
 * System.out.println("pickEgg has selected Egg " + n3 + " from Box " + n2
 * + ". We wish you and your partner good fortune.");
 * }
 * } else if (string2.equals("N")) {
 * System.out.
 * println("Thank you for using the Egglocke decision maker. We hope to see you soon!"
 * );
 * }
 */