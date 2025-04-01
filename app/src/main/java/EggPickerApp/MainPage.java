package EggPickerApp;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MainPage extends JFrame {
    private JButton newUser;
    private JButton existUser;

    public MainPage() {
        super("EggPicker");
        setLayout(new FlowLayout());

        newUser = new JButton("New User");
        add(newUser);
        existUser = new JButton("Existing User");
        add(existUser);
    }

    public static void main(String[] args) {
        openWindow();
    }

    public static void openWindow() {
        JFrame melanie = new JFrame("MELANIE");
        melanie.setSize(300, 200);
        melanie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        melanie.getContentPane().setLayout(null);

        JButton newUser = new JButton("New User");
        newUser.setBounds(50, 50, 100, 75);
        newUser.setVisible(true);

        melanie.getContentPane().add(newUser);
        newUser.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                melanie.setVisible(false);
                NewUser nu = new NewUser();
                nu.openWindow();

            }

        });
        melanie.setVisible(true);
    }

}
