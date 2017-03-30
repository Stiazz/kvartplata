package pack1;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Font;

public class User_Form extends JApplet {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_5;
	Transmitter t;
	
	public User_Form() {
		getContentPane().setLayout(new CardLayout());
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, "Us");
		panel.setLayout(null);
		
		JLabel label = new JLabel("У Вас:");
		label.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label.setBounds(20, 16, 46, 14);
		panel.add(label);
		
		textField = new JTextField();
		textField.setBounds(263, 14, 56, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JRadioButton radioButton = new JRadioButton("квартира");
		radioButton.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		radioButton.setBounds(61, 12, 75, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("частный дом");
		radioButton_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		radioButton_1.setBounds(61, 36, 117, 23);
		panel.add(radioButton_1);
		
		JLabel label_1 = new JLabel("(введите площадь)");
		label_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_1.setBounds(142, 16, 117, 14);
		panel.add(label_1);
		
		radioButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (radioButton.isSelected()) {
					radioButton_1.setSelected(false);
				}
			}
		});
		
		radioButton_1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if (radioButton_1.isSelected()) {
					radioButton.setSelected(false);
				}
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 107, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(129, 138, 86, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(129, 170, 86, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(129, 201, 86, 20);
		panel.add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(331, 246, 86, 20);
		panel.add(textField_6);
		
		JLabel label_2 = new JLabel("Горячая вода");
		label_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_2.setBounds(20, 113, 84, 14);
		panel.add(label_2);
		
		JLabel label_6 = new JLabel("/");
		label_6.setBounds(262, 173, 19, 14);
		panel.add(label_6);
		
		JButton button = new JButton("Отправить показания");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t = new Transmitter();
				double Price_Flat = 0;
				double Price_House = 0;
			    double Hot_Water = Double.parseDouble(textField_1.getText());
			    double Cold_Water = Double.parseDouble(textField_2.getText());
			    double Electricity = Double.parseDouble(textField_4.getText());
				if (radioButton.isSelected())
				{
					double Flat_Size = Double.parseDouble(textField.getText());
					double Gas_Flat = Double.parseDouble(textField_3.getText());
					Price_Flat = Calculations.getPrice_Flat(Flat_Size, Hot_Water, Cold_Water, Gas_Flat, Electricity);
					textField_6.setText(Double.toString(Price_Flat));
					t.setA(textField_6.getText());
					t.setB("Квартира");
				}
				if (radioButton_1.isSelected())
				{
					double Gas_House = Double.parseDouble(textField_5.getText());
					Price_House = Calculations.getPrice_House(Cold_Water, Gas_House, Electricity);
					textField_6.setText(Double.toString(Price_House));
					t.setA(textField_6.getText());
					t.setB("Частный дом");
				}
			}
		});
		button.setBounds(141, 236, 161, 41);
		panel.add(button);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(279, 170, 86, 20);
		panel.add(textField_5);
		
		JLabel label_7 = new JLabel("Итого за к/у");
		label_7.setBounds(342, 232, 84, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("кв.м.");
		label_8.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_8.setBounds(329, 16, 46, 14);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Введите объем потребления ресурсов");
		label_9.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		label_9.setBounds(87, 72, 275, 20);
		panel.add(label_9);
		
		JLabel label_3 = new JLabel("Холодная вода");
		label_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_3.setBounds(20, 140, 84, 14);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Газ");
		label_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_4.setBounds(20, 172, 84, 14);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Электричество");
		label_5.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_5.setBounds(20, 203, 99, 14);
		panel.add(label_5);
		
		JLabel label_10 = new JLabel("куб.м.");
		label_10.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_10.setBounds(218, 110, 41, 14);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("куб.м.");
		label_11.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_11.setBounds(218, 141, 41, 14);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("куб.м.");
		label_12.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_12.setBounds(218, 173, 41, 14);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("тыс.куб.м.");
		label_13.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_13.setBounds(375, 172, 75, 14);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("КВт*час");
		label_14.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		label_14.setBounds(218, 201, 63, 14);
		panel.add(label_14);
		
		JButton button_1 = new JButton("Выход");
		button_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 13));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) getContentPane().getLayout();
				Authorization_Form af = new Authorization_Form();
				getContentPane().add(af, "Auth");
				cl.show(getContentPane(), "Auth");
			}
		});
		button_1.setBounds(10, 254, 89, 23);
		panel.add(button_1);

	}
}
