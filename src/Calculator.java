import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField;
	private JTextField textField_1;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(35, 25, 149, 58);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(203, 25, 126, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 192, 135, 58);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ANS :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(62, 190, 87, 58);
		frame.getContentPane().add(lblNewLabel);
		
		JButton buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 
				 
				 try {
					 
					 int numb1, numb2, ans;
					 
					 numb1=Integer.parseInt(textField1.getText());
					 numb2=Integer.parseInt(textField.getText());
					 
					 ans = numb1 + numb2;
					 
					 textField_1.setText(Integer.toString(ans));
					 
					 
					 
				 }catch(Exception e1) {
					 JOptionPane.showMessageDialog(null, "ENTER VALIDE NUMBER");
					 
				 }
				 
				 
				 
				 
			}
		});
		buttonAdd.setBounds(33, 121, 65, 39);
		frame.getContentPane().add(buttonAdd);
		
		JButton buttonSous = new JButton("-");
		buttonSous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					 
					 int numb1, numb2, ans;
					 
					 numb1=Integer.parseInt(textField1.getText());
					 numb2=Integer.parseInt(textField.getText());
					 
					 ans = numb1 - numb2;
					 
					 textField_1.setText(Integer.toString(ans));
					 
					 
					 
				 }catch(Exception e1) {
					 JOptionPane.showMessageDialog(null, "ENTER VALIDE NUMBER");
					 
				 }
			}
		});
		buttonSous.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buttonSous.setBounds(132, 121, 65, 39);
		frame.getContentPane().add(buttonSous);
		
		JButton buttonMult = new JButton("*");
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 
					 int numb1, numb2, ans;
					 
					 numb1=Integer.parseInt(textField1.getText());
					 numb2=Integer.parseInt(textField.getText());
					 
					 ans = numb1 * numb2;
					 
					 textField_1.setText(Integer.toString(ans));
					 
					 
					 
				 }catch(Exception e1) {
					 JOptionPane.showMessageDialog(null, "ENTER VALIDE NUMBER");
					 
				 }
			}
			
		});
		buttonMult.setBounds(218, 121, 65, 39);
		frame.getContentPane().add(buttonMult);
		
		JButton buttonDiv = new JButton("/");
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					 
					 int numb1, numb2, ans;
					 
					 numb1=Integer.parseInt(textField1.getText());
					 numb2=Integer.parseInt(textField.getText());
					 
					 ans = numb1 / numb2;
					 
					 textField_1.setText(Integer.toString(ans));
					 
					 
					 
				 }catch(Exception e1) {
					 JOptionPane.showMessageDialog(null, "ENTER VALIDE NUMBER");
					 
				 }
			}
		});
		buttonDiv.setBounds(303, 121, 54, 39);
		frame.getContentPane().add(buttonDiv);
	}

}
