package coursework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLogin extends JFrame implements ActionListener {

    private JLabel titleLabel;
    private JLabel usernameLabel;
    private JTextField usernameTextField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JPanel panel;

    public AdminLogin() {
    	
    	
    	addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent e)
			{
				System.exit(0);
			}
		});
    	
        setTitle("Admin Login");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        titleLabel = new JLabel("Admin Login");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 50));
        titleLabel.setBounds(500, 100, 400, 50);
        panel.add(titleLabel);

        usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        usernameLabel.setBounds(400, 250, 150, 30);
        panel.add(usernameLabel);

        usernameTextField = new JTextField();
        usernameTextField.setFont(new Font("Arial", Font.PLAIN, 20));
        usernameTextField.setBounds(550, 250, 200, 30);
        panel.add(usernameTextField);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordLabel.setBounds(400, 300, 150, 30);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordField.setBounds(550, 300, 200, 30);
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 20));
        loginButton.setBounds(550, 350, 100, 30);
        loginButton.addActionListener(this);
        panel.add(loginButton);

        getContentPane().add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameTextField.getText();
        String password = new String(passwordField.getPassword());

        if (username.equals("admin") && password.equals("password")) {
            JOptionPane.showMessageDialog(null, "Login Successful!");
            
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
        }
    }

    public static void main(String[] args) {
        new AdminLogin();
    }
}
