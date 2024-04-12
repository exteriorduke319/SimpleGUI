import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class shlorp {
    private JLabel value;
    private JLabel changeCounter;
    private int x;
    private int changeNum;
    public shlorp(){
        JFrame goop = new JFrame("Simple GUI");
        goop.setSize(600, 400);
        goop.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel glorp = new JPanel();
        glorp.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        glorp.setLayout(new GridLayout(2,2,10,10));

        x = 0;
        changeNum = 0;
        value = new JLabel("Value: " + x);
        value.setHorizontalAlignment(JLabel.CENTER);
        glorp.add(value);

        changeCounter = new JLabel("Number of Changes: " + x);
        changeCounter.setHorizontalAlignment(JLabel.CENTER);
        glorp.add(changeCounter);

        JButton glop = new JButton("-1");
        JButton gunge = new JButton("+1");


        glop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                glopPress();
            }
        });

        gunge.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gungePress();
            }
        });

        glorp.add(glop);
        glorp.add(gunge);

        goop.add(glorp);
        goop.setVisible(true);

    }
    public static void main(String[] args) {
        new shlorp();
    }

    public void glopPress() {
        x -= 1;
        afterPress();
    }

    public void gungePress() {
        x += 1;
        afterPress();
    }

    public void afterPress() {
        changeNum += 1;
        value.setText("Value: " + x);
        changeCounter.setText("Number of Changes: " + changeNum);
    }
}