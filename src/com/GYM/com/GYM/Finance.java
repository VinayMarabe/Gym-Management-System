package com.GYM;
import java.text.*;
import java.awt.EventQueue;
import java.awt.print.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.text.*;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
public class Finance extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField amou;
	private JComboBox memb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance frame = new Finance();
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
	public Finance() {
		DataBase a= new DataBase();
		JtableData jt = new JtableData(); 
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Downloads\\live\\fin.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBackground(new Color(255, 255, 255));
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 759, 394);
		contentPane.add(contentPane_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(418, 89, 322, 257);
		contentPane_1.add(scrollPane_1);
		
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		jt.ShowDataInJtable("select *from finance",table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 140, 0));
		panel_1.setBounds(0, 0, 213, 400);
		contentPane_1.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\gym.png"));
		lblNewLabel_2.setBounds(40, 43, 110, 99);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\userpic.png"));
		lblNewLabel_3.setBounds(10, 158, 30, 42);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\coach.png"));
		lblNewLabel_4.setBounds(10, 211, 30, 31);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\logout (1).png"));
		lblNewLabel_6.setBounds(10, 271, 30, 31);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_13_1 = new JLabel("Members ");
		lblNewLabel_13_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Members().setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_13_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13_1.setBounds(66, 174, 64, 14);
		panel_1.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_13_2 = new JLabel("Coach");
		lblNewLabel_13_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Coach().setVisible(true);
				setVisible(false);
			}
		});
		lblNewLabel_13_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13_2.setBounds(66, 222, 64, 20);
		panel_1.add(lblNewLabel_13_2);
		
		JLabel lblNewLabel_13_3 = new JLabel("Logout");
		lblNewLabel_13_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		lblNewLabel_13_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13_3.setBounds(66, 282, 64, 20);
		panel_1.add(lblNewLabel_13_3);
		
		JDateChooser m1 = new JDateChooser();
		m1.setDateFormatString("dd-MM-yyyy");
		m1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		m1.setBounds(223, 113, 148, 20);
		contentPane_1.add(m1);
		JtableData c = new JtableData();
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amou.setText("");
				m1.setDate(null);
				memb.setSelectedItem(null);
			}
		});
		
		
	
		btnNewButton_1.setBackground(new Color(255, 140, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(223, 357, 148, 23);
		contentPane_1.add(btnNewButton_1);
		
		JLabel mt = new JLabel("*");
		mt.setForeground(new Color(255, 0, 0));
		mt.setFont(new Font("Tahoma", Font.BOLD, 14));
		mt.setBounds(272, 90, 15, 14);
		contentPane_1.add(mt);
		mt.setVisible(false);
		
		JLabel me = new JLabel("*");
		me.setForeground(Color.RED);
		me.setFont(new Font("Tahoma", Font.BOLD, 14));
		me.setBounds(286, 157, 15, 14);
		contentPane_1.add(me);
		me.setVisible(false);
		
		JLabel am = new JLabel("*");
		am.setForeground(Color.RED);
		am.setFont(new Font("Tahoma", Font.BOLD, 14));
		am.setBounds(272, 219, 15, 14);
		contentPane_1.add(am);
		am.setVisible(false);
		
		JButton btnNewButton_2 = new JButton("PAY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean d;
				int a = 0;
				int c =0;
				ArrayList al = new ArrayList();
				DataBase b = new DataBase();
				System.out.print(b.insertIntoDBf(al));
				if (m1.getDate()==null) {
					mt.setVisible(true);
					a=1;
				}else {
					SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
					String stringDate= DateFor.format(m1.getDate());
					al.add(stringDate);
				}
				if(memb.getSelectedIndex()==0)
				{
					me.setVisible(true);
					a=1;
				}
				else {al.add(memb.getSelectedItem().toString());}
				
				
				
				d=Pattern.compile("^\\d{1,6}$").matcher(amou.getText()).matches();
				if(d==false) {
					am.setVisible(true);
					a=1;
				}else {al.add(amou.getText());}
				
				if(a==0) {
					
					c=b.insertIntoDBf(al);
				}if(c==1) {
					JOptionPane.showMessageDialog(null, "Data added");
					DefaultTableModel tableModel = (DefaultTableModel) table. getModel();
					jt.ShowDataInJtable("select * from finance", table);
				}else {JOptionPane.showMessageDialog(null, "not Added");}
				
			
			}
		});
		btnNewButton_2.setBackground(new Color(255, 140, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(223, 304, 148, 23);
		contentPane_1.add(btnNewButton_2);
		
		JButton print = new JButton("PRINT");
		print.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  PrinterJob pjob = PrinterJob.getPrinterJob();
				  PageFormat preformat = pjob.defaultPage();
				  preformat.setOrientation(PageFormat.LANDSCAPE);
				  PageFormat postformat = pjob.pageDialog(preformat);
				  //If user does not hit cancel then print.
				  if (preformat != postformat) {
				      //Set print component
					  JFrame a =  new Finance();
				      pjob.setPrintable(new Printer(scrollPane_1) , postformat);
				      if (pjob.printDialog()) {
				          
				              try {
								pjob.print();
							} catch (PrinterException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
				         
				      }
				  }
			}
		});
		print.setBackground(new Color(255, 140, 0));
		print.setForeground(new Color(255, 255, 255));
		print.setFont(new Font("Tahoma", Font.BOLD, 14));
		print.setBounds(513, 357, 148, 23);
		contentPane_1.add(print);
		
		JLabel lblNewLabel_1 = new JLabel("Date");
		lblNewLabel_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(226, 88, 45, 14);
		contentPane_1.add(lblNewLabel_1);
		
		
		
		JLabel lblNewLabel_1_2 = new JLabel("Amount ");
		lblNewLabel_1_2.setForeground(new Color(255, 140, 0));
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(223, 218, 55, 14);
		contentPane_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_13_1_1 = new JLabel("Members ");
		lblNewLabel_13_1_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_13_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13_1_1.setBounds(225, 156, 64, 14);
		contentPane_1.add(lblNewLabel_13_1_1);
		
		 memb = new JComboBox();
		 memb.setModel(new DefaultComboBoxModel(new String[] {"Select MEMBER"}));
		memb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		memb.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		memb.setBackground(Color.WHITE);
		memb.setBounds(223, 174, 148, 22);
		contentPane_1.add(memb);
		a.updateCombo(memb);
		
		amou = new JTextField();
		amou.setFont(new Font("Tahoma", Font.PLAIN, 14));
		amou.setColumns(10);
		amou.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		amou.setBounds(222, 243, 149, 20);
		contentPane_1.add(amou);
		a.updateText(amou);
		
		JLabel lblFinacnceManger = new JLabel("Finacnce Manger ");
		lblFinacnceManger.setForeground(new Color(255, 140, 0));
		lblFinacnceManger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFinacnceManger.setBounds(368, 25, 140, 17);
		contentPane_1.add(lblFinacnceManger);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(597, 219, 2, 2);
		contentPane_1.add(scrollPane);
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(408, 66, 341, 280);
		contentPane_1.add(panel); 
		
		
		
		
		table.getSelectionModel().addListSelectionListener((ListSelectionListener) new ListSelectionListener(){
			@Override
			 public void valueChanged(ListSelectionEvent event) {
	            // do some actions here, for example
	            // print first column value from selected row
	        	 amou.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
	        	
	             
	             memb.setSelectedItem (table.getValueAt(table.getSelectedRow(), 3).toString());
	        }

			
	    });
		
		}
	}
	
	

