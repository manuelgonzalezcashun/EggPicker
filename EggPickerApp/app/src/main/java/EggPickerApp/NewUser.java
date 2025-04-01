package EggPickerApp;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class NewUser {

    public static void main(String[] args) {
        openWindow();

    }

    public static void openWindow() {
        JFrame melanie = new JFrame("ANETTE");

        melanie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        melanie.setSize(300, 200);
        melanie.setVisible(true);
    }

}
