package mycalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstnumber;
	double secondnumber;
	double result;
	String operations;
	String answer;
	private JTextField txtMyCalculator;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 479, 431);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.MAGENTA);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 28, 439, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btnNewButton_1.getText();
				textField.setText(EnterNumber);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(22, 253, 60, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_0 = new JButton("0");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btnNewButton_0.getText();
				textField.setText(EnterNumber);
			}
		});
		btnNewButton_0.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_0.setBounds(22, 314, 60, 50);
		frame.getContentPane().add(btnNewButton_0);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btnNewButton_5.getText();
				textField.setText(EnterNumber);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_5.setBounds(111, 192, 60, 50);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btnNewButton_6.getText();
				textField.setText(EnterNumber);
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_6.setBounds(111, 253, 60, 50);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton(".");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_7.setBounds(111, 314, 60, 50);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton button = new JButton("9");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + button.getText();
				textField.setText(EnterNumber);
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button.setBounds(202, 126, 60, 50);
		frame.getContentPane().add(button);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + button_7.getText();
				textField.setText(EnterNumber);
			}
		});
		button_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_7.setBounds(22, 126, 60, 50);
		frame.getContentPane().add(button_7);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + button_4.getText();
				textField.setText(EnterNumber);
			}
		});
		button_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_4.setBounds(22, 192, 60, 50);
		frame.getContentPane().add(button_4);
		
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber = textField.getText() + button_8.getText();
				textField.setText(EnterNumber);
			}
		});
		button_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_8.setBounds(111, 126, 60, 50);
		frame.getContentPane().add(button_8);
		
		JButton btnNewButton = new JButton("6");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btnNewButton.getText();
				textField.setText(EnterNumber);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(202, 192, 60, 50);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btnNewButton_2.getText();
				textField.setText(EnterNumber);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.setBounds(202, 253, 60, 50);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnReset.setBounds(202, 315, 136, 50);
		frame.getContentPane().add(btnReset);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 firstnumber = Double.parseDouble(textField.getText());
			 textField.setText("");
			 operations = "+";

			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_1.setBounds(293, 127, 60, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnumber = Double.parseDouble(textField.getText());
				 textField.setText("");
				 operations = "-";
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_2.setBounds(370, 126, 60, 50);
		frame.getContentPane().add(button_2);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnumber = Double.parseDouble(textField.getText());
				 textField.setText("");
				 operations = "x";
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnX.setBounds(293, 192, 60, 50);
		frame.getContentPane().add(btnX);
		
		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnumber = Double.parseDouble(textField.getText());
				 textField.setText("");
				 operations = "/";
			}
		});
		button_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_3.setBounds(370, 192, 60, 50);
		frame.getContentPane().add(button_3);
		
		JButton button_5 = new JButton("=");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnumber = Double.parseDouble(textField.getText());
				if (operations == "+")
				{
					result = firstnumber + secondnumber;
					answer = String.format("%.1f", result);
					textField.setText(answer);
					
				}
				else if (operations == "-")
				{
					result = firstnumber - secondnumber;
					answer = String.format("%.1f", result);
					textField.setText(answer);
					
				}
				else if (operations == "x")
				{
					result = firstnumber * secondnumber;
					answer = String.format("%.1f", result);
					textField.setText(answer);
					
				}
				else if (operations == "/")
				{
					result = firstnumber / secondnumber;
					answer = String.format("%.1f", result);
					textField.setText(answer);
					
				}
				
				
				
				
				
				
			}
		});
		button_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_5.setBounds(370, 253, 60, 109);
		frame.getContentPane().add(button_5);
		
		JButton btnDel = new JButton("DEL");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				
				if(textField.getText().length() > 0) {
				StringBuilder strB = new StringBuilder(textField.getText());
				strB.deleteCharAt(textField.getText().length() - 1);
				backspace = strB.toString();
				textField.setText(backspace);
				}
			}
		});
		btnDel.setBounds(293, 254, 60, 50);
		frame.getContentPane().add(btnDel);
		
		txtMyCalculator = new JTextField();
		txtMyCalculator.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 17));
		txtMyCalculator.setBackground(Color.BLUE);
		txtMyCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		txtMyCalculator.setText("My Calculator");
		txtMyCalculator.setBounds(131, -3, 158, 25);
		frame.getContentPane().add(txtMyCalculator);
		txtMyCalculator.setColumns(10);
	}
}
