import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public GUI(){
        JFrame frame = new JFrame("lebron jame hairline");
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        panel.setLayout(new GridLayout(4,1,10,10));

        JButton button = new JButton("nicki minaj silicone");
        JButton button2 = new JButton("rick ross strechmark");
        JButton button3 = new JButton("shaq readinbook");
        JButton button4 = new JButton(new ImageIcon("/Users/tanneryarnevic/Desktop/IntelliJ projects/guipractice/src/images.png"));

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

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b3Press();
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                b4Press();
            }
        });

        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        label = new JLabel("shaq readinbook");
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label);

        frame.add(panel);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new GUI();
    }

    public void b1Press() {
        label.setText("You clicked nicki minaj silicone");
    }
}