package E_Lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class M2 extends JDialog {
    private JTextField massa;
    private JTextField gravitasi;
    private JTextField rhobenda;
    private JTextField panjang;
    private JTextField waktu;
    private JTextField rhofluida;
    private JButton hasilButton;
    private JTextArea hasilM2;
    public JPanel panelM2;

    public M2() {
        hasilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textR = massa.getText();
                String textG = gravitasi.getText();
                String textRB = rhobenda.getText();
                String textS = panjang.getText();
                String textT = waktu.getText();
                String textRF = rhofluida.getText();
                double r = Double.parseDouble(textR);
                double g = Double.parseDouble(textG);
                double rhob = Double.parseDouble(textRB);
                double s = Double.parseDouble(textS);
                double t = Double.parseDouble(textT);
                double rhof = Double.parseDouble(textRF);

                if (r<0 || g<0 || rhob<0 || s<0 || t<0 || rhof<0){
                    JOptionPane.showMessageDialog(null,"Angka harus positif");
                }
                else {
                    double n = 2.0 /9 * r * r * g * t * (rhob-rhof) / s;
                    hasilM2.setText(n+" Ns/m^2");
                }

            }
        });
    }

    public static void main(String[] args) {
        M2 air = new M2();
        air.setContentPane(new M2().panelM2);
        air.pack();
        air.setVisible(true);
        air.setSize(630,410);
        air.setResizable(true);
    }
}
