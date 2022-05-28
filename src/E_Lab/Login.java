package E_Lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login extends JDialog{
    public JPanel LoginPanel;
    private JTextField IDname;
    private JPasswordField pass;
    private JButton loginButton;


    public Login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (IDname.getText().equals("SFaris") && pass.getText().equals("undip")){
                    JFrame main = new JFrame();
                    main.setContentPane(new Materi().panel2);
                    main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    main.setLocationRelativeTo(null);
                    main.pack();
                    main.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"ID atau Password salah");
                    IDname.setText("");
                    pass.setText("");
                    IDname.requestFocus();
                }
            }
        });
    }

    public static void main(String[] args) {
        Login login = new Login();
        login.setContentPane(new Login().LoginPanel);
        login.pack();
        login.setVisible(true);
        login.setSize(580, 380);
        login.setResizable(true);
    }



}
