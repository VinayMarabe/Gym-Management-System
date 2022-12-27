package com.GYM;

import java.awt.EventQueue;

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
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Toolkit;


public class Coach extends JFrame {

	private JPanel contentPane;
	private JTextField age;
	private JTextField name;
	private JTextField phone;
	private JTextField add;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Coach frame = new Coach();
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
	public Coach() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Downloads\\live\\coach.png"));
		JtableData jt = new JtableData();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBackground(new Color(255, 255, 255));
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 706, 407);
		contentPane.add(contentPane_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(255, 140, 0));
		panel_1.setBounds(0, 0, 213, 407);
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
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\pay.png"));
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
		
		JLabel lblNewLabel_13_2 = new JLabel("Payment");
		lblNewLabel_13_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					 new Finance().setVisible(true);
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
		
		JLabel lblCoachName = new JLabel("Coach Name ");
		lblCoachName.setForeground(new Color(255, 140, 0));
		lblCoachName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCoachName.setBounds(262, 53, 82, 14);
		contentPane_1.add(lblCoachName);
		
		JPanel panel = new JPanel();
		panel.setBounds(212, 0, 494, 14);
		contentPane_1.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Phone No.");
		lblNewLabel_1.setForeground(new Color(255, 140, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(540, 53, 64, 14);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_9 = new JLabel("Age");
		lblNewLabel_9.setForeground(new Color(255, 140, 0));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(428, 47, 26, 26);
		contentPane_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_11 = new JLabel("Gender");
		lblNewLabel_11.setForeground(new Color(255, 140, 0));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11.setBounds(539, 103, 50, 14);
		contentPane_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_13 = new JLabel("Address ");
		lblNewLabel_13.setForeground(new Color(255, 140, 0));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13.setBounds(262, 103, 58, 14);
		contentPane_1.add(lblNewLabel_13);
		
		age = new JTextField(); 
		age.setFont(new Font("Tahoma", Font.PLAIN, 14));
		age.setColumns(10);
		age.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		age.setBounds(416, 67, 46, 20);
		contentPane_1.add(age);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		name.setColumns(10);
		name.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		name.setBounds(259, 72, 115, 20);
		contentPane_1.add(name);
		
		phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		phone.setColumns(10);
		phone.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		phone.setBounds(529, 67, 115, 20);
		contentPane_1.add(phone);
		
		add = new JTextField();
		add.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add.setColumns(10);
		add.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		add.setBounds(259, 131, 115, 20);
		contentPane_1.add(add);
		
		JComboBox gen = new JComboBox();
		gen.setModel(new DefaultComboBoxModel(new String[] {"Select GENDER", "Male", "Female"}));
		gen.setToolTipText("");
		gen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		gen.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		gen.setBounds(529, 128, 122, 22);
		contentPane_1.add(gen);
		

		
		JButton btnNewButton_3_1 = new JButton("EDIT");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				DataBase db = new DataBase();
				ArrayList a = new ArrayList(); 
				
				a.add(name.getText());
				a.add(phone.getText());
				a.add(age.getText());
				a.add(add.getText());
				a.add(gen.getSelectedItem());
				
			int no =	db.UpdateDetailsC(a, table.getValueAt(table.getSelectedRow(), 0).toString());
			if (no==1) {
				JOptionPane.showMessageDialog(null,"Successfully Edited");
				DefaultTableModel tableModel = (DefaultTableModel) table. getModel();
				jt.ShowDataInJtable("select * from coach", table);
				
			}
			else {
				JOptionPane.showMessageDialog(null,"UNSuccessfully Edited");
			}
			}
			
		});
		btnNewButton_3_1.setForeground(Color.WHITE);
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3_1.setBackground(new Color(255, 140, 0));
		btnNewButton_3_1.setBounds(393, 162, 122, 23);
		contentPane_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("DELETE");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataBase db = new DataBase();
				
				
				int no =	db.DeleteDetailsC(  table.getValueAt(table.getSelectedRow(), 0).toString() );
				 
					JOptionPane.showMessageDialog(null,"Successfully Deleted");
					DefaultTableModel tableModel = (DefaultTableModel) table. getModel();
					jt.ShowDataInJtable("select * from coach", table);
					
			}
		}); 
		btnNewButton_3_2.setForeground(Color.WHITE);
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3_2.setBackground(new Color(255, 140, 0));
		btnNewButton_3_2.setBounds(529, 162, 122, 23);
		contentPane_1.add(btnNewButton_3_2);
		
		JLabel lblCoachManger = new JLabel("Coach Manger ");
		lblCoachManger.setForeground(new Color(255, 140, 0));
		lblCoachManger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCoachManger.setBounds(393, 25, 129, 17);
		contentPane_1.add(lblCoachManger);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(223, 244, 473, 152);
		contentPane_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.getSelectionModel().addListSelectionListener((ListSelectionListener) new ListSelectionListener(){
			@Override
			 public void valueChanged(ListSelectionEvent event) {
	            // do some actions here, for example
	            // print first column value from selected row
				if(table.getSelectedRow()!=-1) {
	        	 name.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
	        	  phone.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
	             age.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
	             add.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
	             gen.setSelectedItem (table.getValueAt(table.getSelectedRow(), 5).toString());
				}
	        }

			
	    });
		JLabel cn = new JLabel("*");
		cn.setForeground(new Color(255, 51, 0));
		cn.setFont(new Font("Tahoma", Font.BOLD, 14));
		cn.setBounds(344, 54, 14, 14);
		contentPane_1.add(cn);
		cn.setVisible(false);
		
		JLabel ag = new JLabel("*");
		ag.setForeground(new Color(255, 51, 0));
		ag.setFont(new Font("Tahoma", Font.BOLD, 14));
		ag.setBounds(460, 54, 14, 14);
		contentPane_1.add(ag);
		ag.setVisible(false);
		
		JLabel pn = new JLabel("*");
		pn.setForeground(new Color(255, 51, 0));
		pn.setFont(new Font("Tahoma", Font.BOLD, 14));
		pn.setBounds(606, 54, 14, 14);
		contentPane_1.add(pn);
		pn.setVisible(false);
		
		JLabel ad = new JLabel("*");
		ad.setForeground(new Color(255, 51, 0));
		ad.setFont(new Font("Tahoma", Font.BOLD, 14));
		ad.setBounds(317, 104, 14, 14);
		contentPane_1.add(ad);
		ad.setVisible(false);
		
		JLabel gn = new JLabel("*");
		gn.setForeground(new Color(255, 51, 0));
		gn.setFont(new Font("Tahoma", Font.BOLD, 14));
		gn.setBounds(587, 104, 14, 14);
		contentPane_1.add(gn);
		gn.setVisible(false);
		
		JButton btnNewButton_3 = new JButton("ADD");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean d;
				int a = 0;
				int c =0;
				ArrayList al = new ArrayList();
				
				DataBase b = new DataBase();
			System.out.print(b.insertIntoDBC(al));
			DefaultTableModel tableModel = (DefaultTableModel) table. getModel();
			jt.ShowDataInJtable("select * from coach", table);
			
			d=Pattern.compile("([a-zA-Z]{3,30}\s*)+").matcher(name.getText()).matches();
			if(d==false) {
				cn.setVisible(true);
				a=1;
			}else {al.add(name.getText());}
			
			d=Pattern.compile("^\\d{10}$").matcher(phone.getText()).matches();
			if(d==false) {
				pn.setVisible(true);
				a=1;
			}else {al.add(phone.getText());}
			
			d=Pattern.compile("^\\d{1,3}$").matcher(age.getText()).matches();
			if(d==false) {
				ag.setVisible(true);
				a=1;
			}else {al.add(age.getText());}
			
			if(add.getText()==null) {
				ad.setVisible(true);
				 a=1;
			}
			else{al.add(add.getText());}
			
			if(gen.getSelectedIndex()==0)
			{
				gn.setVisible(true);
				a=1;
			}
			else {al.add(gen.getSelectedItem().toString());}
		
			if(a==0) {
				
				c=b.insertIntoDBC(al);
			}if(c==1) {
				JOptionPane.showMessageDialog(null, "Added");
			}else {JOptionPane.showMessageDialog(null, "notAdded");
			a=0;}a=0;
			DefaultTableModel tableModel2 = (DefaultTableModel) table. getModel();
			jt.ShowDataInJtable("select * from coach", table);
			
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBackground(new Color(255, 140, 0));
		btnNewButton_3.setBounds(259, 162, 122, 23);
		contentPane_1.add(btnNewButton_3);
		jt.ShowDataInJtable("select * from coach", table);
		
		JLabel lblCoachList = new JLabel("Coach List ");
		lblCoachList.setForeground(new Color(255, 140, 0));
		lblCoachList.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCoachList.setBounds(414, 215, 101, 17);
		contentPane_1.add(lblCoachList);
		
		
	}
}
