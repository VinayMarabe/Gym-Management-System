package com.GYM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogIn() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Downloads\\live\\userpic.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 586, 391);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 140, 0));
		panel_1.setBounds(0, 0, 251, 391);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\gym.png"));
		lblNewLabel_2.setBounds(77, 25, 100, 100);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\gymbS.png"));
		lblNewLabel_3.setBounds(51, 136, 157, 164);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\text.png"));
		lblNewLabel_4.setBounds(24, 288, 202, 43);
		panel_1.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		textField.setBounds(338, 126, 159, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		Members mem = new Members();
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("Vinay2209")&&passwordField.getText().equals("2209")) 
				{
				
				mem.setVisible(true);
				setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, " Enter Correct ID & Pass");
				}
			
			}
			
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 140, 0));
		btnNewButton.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 140, 0)));
		btnNewButton.setBounds(374, 236, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setForeground(new Color(255, 140, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(334, 104, 75, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(334, 167, 75, 14);
		panel.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('#');
		passwordField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		passwordField.setBounds(338, 184, 159, 20);
		panel.add(passwordField);
	}
}
