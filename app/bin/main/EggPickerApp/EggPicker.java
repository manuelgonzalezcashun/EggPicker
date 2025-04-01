/*
 * Decompiled with CFR 0.152.
 */
package EggPickerApp;

import javax.swing.JOptionPane;

public class EggPicker {
    public static void main(String[] stringArray) {
        String nb = JOptionPane.showInputDialog("How many boxes of eggs do you have? It should be between 1 and 18: ");
        while (nb.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a number between 1 and 18: ", "ALERT", 0);
            nb = JOptionPane.showInputDialog("How many boxes of eggs do you have? It should be between 1 and 18: ");
        }
        int numOfBoxes = Integer.parseInt(nb);
        if (numOfBoxes <= 1 || numOfBoxes >= 18) {
            while (numOfBoxes <= 1 || numOfBoxes >= 18) {
                JOptionPane.showMessageDialog(null,
                        "BoxCheck cannot with the amount of boxes loaded! Please pick a number between 1-18:", "ALERT",
                        0);
                nb = JOptionPane.showInputDialog("How many boxes of eggs do you have? It should be between 1 and 18: ");
                numOfBoxes = Integer.parseInt(nb);
            }
        }
        JOptionPane.showMessageDialog(null,
                "randomBox will return a random number between 1 and " + numOfBoxes + " to select your egg from.",
                "EggPicker", -1);
        System.out.println(
                "randomBox will return a random number between 1 and " + numOfBoxes + " to select your egg from.");
        int RandBox = (int) (Math.random() * (double) (numOfBoxes + 1));
        if (RandBox == 0) {
            while (RandBox == 0) {
                RandBox = (int) (Math.random() * (double) (numOfBoxes + 1));
            }
        } else {
            JOptionPane.showMessageDialog(null, "randomBox selects box " + RandBox, "EggPicker", -1);
        }
        JOptionPane.showMessageDialog(null, "EggPicker will now select a RandomEgg", "EggPicker", -1);
        int RandEgg = (int) (Math.random() * 31.0);
        if (RandEgg == 0) {
            RandEgg = (int) (Math.random() * 31.0);
        } else {
            JOptionPane.showMessageDialog(null, "pickEgg has selected Egg " + RandEgg + " from Box " + RandBox
                    + ". We wish you and your partner good fortune.", "EggPicker", -1);
        }
        System.out.println(RandBox);
        System.out.println(RandEgg);
    }
}
