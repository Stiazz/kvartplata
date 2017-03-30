package pack1;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Authorization_Form extends JApplet {
	private User_Form uf;
	private Accountant_Form af;
	private JPasswordField pass;
	private JTextField JTextField_Login;
	private JPanel panel;


	/**
	 * Create the applet.
	 */
	public Authorization_Form() {
		getContentPane().setLayout(new CardLayout());
		
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel, "Main");
		
		pass = new JPasswordField();
		pass.setBounds(180, 151, 94, 20);
		panel.add(pass);
		
		JLabel label_Login = new JLabel("логин");
		label_Login.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		label_Login.setBounds(111, 113, 46, 14);
		panel.add(label_Login);
		
		JLabel label_Pass = new JLabel("пароль");
		label_Pass.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		label_Pass.setBounds(111, 151, 46, 20);
		panel.add(label_Pass);
		
		JLabel label_Auth = new JLabel("Авторизация");
		label_Auth.setHorizontalAlignment(SwingConstants.CENTER);
		label_Auth.setFont(new Font("Segoe UI Light", Font.PLAIN, 25));
		label_Auth.setBounds(104, 39, 230, 42);
		panel.add(label_Auth);
		
		JLabel label_Error = new JLabel("");
		label_Error.setBounds(111, 240, 223, 14);
		panel.add(label_Error);
		
		JTextField_Login = new JTextField();
		JTextField_Login.setColumns(10);
		JTextField_Login.setBounds(180, 113, 94, 20);
		panel.add(JTextField_Login);

JButton JButton_Enter = new JButton("Вход");
JButton_Enter.setFont(new Font("Segoe UI Light", Font.PLAIN, 16));
		JButton_Enter.setBounds(180, 198, 94, 31);
		panel.add(JButton_Enter);
	}
}


