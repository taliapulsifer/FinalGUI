import javax.swing.*;
import java.awt.*;

public class TextBoxWithButtons {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TextBoxWithButtons().createTheStuff());
    }

    public void createTheStuff() {
    // You write your code here:
    JFrame frame = new JFrame("Window with Buttons");
    frame.setLayout(new BorderLayout());

    JButton button1 = new JButton("Paint Me");
    JButton button2 = new JButton("Paint You");

    Dimension buttonSize = new Dimension(145, 50);
    button1.setPreferredSize(buttonSize);
    button2.setPreferredSize(buttonSize);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new FlowLayout());
    buttonPanel.add(button1);
    buttonPanel.add(button2);

    frame.add(buttonPanel, BorderLayout.CENTER);
    frame.setSize(350,100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }
}