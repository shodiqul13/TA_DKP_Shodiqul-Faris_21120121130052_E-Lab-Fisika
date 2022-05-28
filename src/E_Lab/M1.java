package E_Lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class M1 extends JDialog {
    private JTextField massa;
    private JTextField panjang;
    private JTextField gravitasi;
    private JTextArea hasilM1;
    private JButton hasilButton;
    public JPanel panelM1;

    public M1() {
        hasilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textM = massa.getText();
                String textL = panjang.getText();
                String textG = gravitasi.getText();
                double m = Double.parseDouble(textM);
                double l = Double.parseDouble(textL);
                double g = Double.parseDouble(textG);

                if (m<0 || l<0 || g<0){
                    JOptionPane.showMessageDialog(null,"Angka harus positif");
                }
                else {
                    double k = m * g / l;
                    hasilM1.setText(k+" N/m");
                }

            }
        });
    }

    public static void main(String[] args) {
        M1 pegas = new M1();
        pegas.setContentPane(new M1().panelM1);
        pegas.pack();
        pegas.setVisible(true);
        pegas.setSize(500,430);
        pegas.setResizable(true);
    }
}
