package E_Lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Materi extends JDialog {
    private JButton koefisienPegasButton;
    private JButton viskositasButton;
    public JPanel panel2;

    public Materi() {
        koefisienPegasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame option1 = new JFrame();
                option1.setContentPane(new M1().panelM1);
                option1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                option1.setLocationRelativeTo(null);
                option1.pack();
                option1.setVisible(true);
            }
        });
        viskositasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame option2 = new JFrame();
                option2.setContentPane(new M2().panelM2);
                option2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                option2.setLocationRelativeTo(null);
                option2.pack();
                option2.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Materi opsi = new Materi();
        opsi.setContentPane(new Materi().panel2);
        opsi.pack();
        opsi.setVisible(true);
        opsi.setSize(390, 340);
        opsi.setResizable(true);
    }
}
