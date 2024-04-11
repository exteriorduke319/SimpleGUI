import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JLabel value;
    private JLabel changeCounter;
    private int x;
    private int changeNum;
    public GUI(){
        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.setLayout(new GridLayout(2,2,10,10));

        x = 0;
        changeNum = 0;
        value = new JLabel("Value: " + x);
        value.setHorizontalAlignment(JLabel.CENTER);
        panel.add(value);

        changeCounter = new JLabel("Number of Changes: " + x);
        changeCounter.setHorizontalAlignment(JLabel.CENTER);
        panel.add(changeCounter);

        JButton button = new JButton("-1");
        JButton button2 = new JButton("+1");


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b1Press();
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b2Press();
            }
        });

        panel.add(button);
        panel.add(button2);

        frame.add(panel);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new GUI();
    }

    public void b1Press() {
        x -= 1;
        afterPress();
    }

    public void b2Press() {
        x += 1;
        afterPress();
    }

    public void afterPress() {
        changeNum += 1;
        value.setText("Value: " + x);
        changeCounter.setText("Number of Changes: " + changeNum);
    }
}