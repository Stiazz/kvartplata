package pack1;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class Accountant_Form extends JApplet {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	/**
	 * Create the applet.
	 */
	public Accountant_Form() {
		getContentPane().setLayout(new CardLayout());
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "Acc");
		panel.setLayout(null);
		
		JLabel label = new JLabel("Показания жителя: коммунальные услуги");
		label.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label.setBounds(41, 11, 248, 23);
		panel.add(label);
		
		textField = new JTextField();
		textField.setBounds(289, 11, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(114, 90, 46, 14);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("тип жилья");
		label_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_2.setBounds(155, 35, 76, 23);
		panel.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(289, 37, 86, 20);
		panel.add(textField_1);
		
		JLabel label_3 = new JLabel("Добавьте общедомовые услуги (в руб.)");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_3.setBounds(80, 69, 282, 23);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Уборка подъезда");
		label_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_4.setBounds(10, 103, 118, 23);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Освещение в подъезде");
		label_5.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_5.setBounds(10, 131, 150, 23);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Обслуживание лифта");
		label_6.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_6.setBounds(10, 158, 141, 23);
		panel.add(label_6);
		
		JLabel label_8 = new JLabel("Обслуживание насосов");
		label_8.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_8.setBounds(10, 183, 141, 23);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Промывка сист. водосн.");
		label_9.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_9.setBounds(245, 103, 155, 23);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Кап. ремонт");
		label_10.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_10.setBounds(10, 209, 118, 23);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Уборка улицы");
		label_11.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_11.setBounds(244, 136, 118, 23);
		panel.add(label_11);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(326, 265, 86, 20);
		panel.add(textField_2);
		
		JLabel label_12 = new JLabel("Итог");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_12.setBounds(326, 241, 86, 23);
		panel.add(label_12);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(165, 105, 56, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(165, 133, 56, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(165, 160, 56, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(165, 185, 56, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(165, 211, 56, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(384, 105, 56, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(384, 133, 56, 20);
		panel.add(textField_9);
		
		JLabel label_7 = new JLabel("руб.");
		label_7.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		label_7.setBounds(385, 11, 27, 23);
		panel.add(label_7);
		
		JLabel label_13 = new JLabel("руб.");
		label_13.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		label_13.setBounds(414, 263, 26, 23);
		panel.add(label_13);
		
		}

}