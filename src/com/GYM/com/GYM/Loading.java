package com.GYM;

import java.awt.EventQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Toolkit;

public class Loading extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loading frame = new Loading();
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
	public Loading() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Downloads\\live\\load.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 456);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 140, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(34, 11, 500, 370);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\Loading.png"));
		contentPane.add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 392, 582, 14);
		
		
		
		progressBar.setValue(0);
		progressBar.setForeground(new Color(255, 165, 0));
		progressBar.setBackground(new Color(250, 250, 210));
		contentPane.add(progressBar);
		LogIn m = new LogIn();
		Thread t = new Thread(new Runnable() {
			public void run() {
				try{for(int i=0; i<=100;i=i+2) {
					progressBar.setValue(i);
					Thread.sleep(50);
					if(i==100) {
						m.setVisible(true);
						setVisible(false);
					}
				}
			}catch(InterruptedException ex) {
				Logger.getLogger(Loading.class.getName()).log(Level.SEVERE,null,ex);}
			}
		}); t.start();
		 
	}
}
