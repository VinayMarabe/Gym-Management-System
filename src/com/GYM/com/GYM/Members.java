package com.GYM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import java.awt.Toolkit;

public class Members extends JFrame {
	public boolean b;
	private JPanel contentPane;
	private JTextField age;
	private JTable table;
	private JTextField name;
	private JTextField phno;
	private JTextField amou;
	private JComboBox coac;
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "System";
	private static String pass = "root";
	private static String driver = "oracle.jdbc.driver.OracleDriver";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Members frame = new Members();
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
	public Members() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\admin\\Downloads\\live\\memb.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 494);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 140, 0));
		panel_1.setBounds(0, 0, 213, 455);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\gym.png"));
		lblNewLabel_2.setBounds(40, 43, 110, 99);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\coach.png"));
		lblNewLabel_3.setBounds(10, 158, 46, 42);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\pay.png"));
		lblNewLabel_4.setBounds(10, 211, 46, 31);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\live\\Exit.png"));
		lblNewLabel_6.setBounds(10, 259, 30, 31);
		panel_1.add(lblNewLabel_6);
		JLabel lblNewLabel_13_1 = new JLabel("Coach ");
		lblNewLabel_13_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				  new Coach().setVisible(true);
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
		lblNewLabel_13_3.setBounds(66, 270, 64, 20);
		panel_1.add(lblNewLabel_13_3);
		
		JLabel lblNewLabel = new JLabel("Member Name ");
		lblNewLabel.setForeground(new Color(255, 140, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(252, 53, 95, 14);
		contentPane.add(lblNewLabel);
		
		age = new JTextField();
		age.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		age.setFont(new Font("Tahoma", Font.PLAIN, 14));
		age.setColumns(10);
		age.setBounds(552, 72, 46, 20);
		contentPane.add(age);
		
		JComboBox gen = new JComboBox();
		gen.setBackground(new Color(255, 255, 255));
		gen.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		gen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		gen.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		gen.setToolTipText("");
		gen.setBounds(613, 71, 101, 22);
		contentPane.add(gen);
		
		JComboBox tim = new JComboBox();
		tim.setModel(new DefaultComboBoxModel(new String[] {"Select Timing", "07:00-08:00", "08:00-09:00", "09:00-10:00"}));
		tim.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		tim.setBackground(new Color(255, 255, 255));
		tim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tim.setBounds(252, 126, 122, 22);
		contentPane.add(tim);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(239, 291, 475, 153);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.getSelectionModel().addListSelectionListener((ListSelectionListener) new ListSelectionListener(){
			@Override
			 public void valueChanged(ListSelectionEvent event) {
	            // do some actions here, for example
	            // print first column value from selected row
				if(table.getSelectedRow()!=-1)
				{
	        	 name.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
	        	  phno.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
	             age.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
	             amou.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
	             tim.setSelectedItem (table.getValueAt(table.getSelectedRow(), 5).toString());
	             coac.setSelectedItem (table.getValueAt(table.getSelectedRow(), 6).toString());
	             gen.setSelectedItem (table.getValueAt(table.getSelectedRow(), 7).toString());
				}
	        }

			
	    });
		
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(252, 189, 89, 23);
		table.add(btnNewButton);
		JtableData jt = new JtableData();
		jt.ShowDataInJtable("select * from member" , table);
		
		JButton btnNewButton_1 = new JButton("EDIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataBase db = new DataBase();
				ArrayList a = new ArrayList(); 
				
				a.add(name.getText());
				a.add(phno.getText());
				a.add(age.getText());
				a.add(amou.getText());
				a.add(tim.getSelectedItem());
				a.add(coac.getSelectedItem());
				a.add(gen.getSelectedItem());
				
			int no =	db.UpdateDetailsM(a, table.getValueAt(table.getSelectedRow(), 0).toString());
			if (no==1) {
				JOptionPane.showMessageDialog(null,"Successfully Edited");
				DefaultTableModel tableModel = (DefaultTableModel) table. getModel();
				jt.ShowDataInJtable("select * from member", table);
				
			}
			else {
				JOptionPane.showMessageDialog(null,"UNSuccessfully Edited");
			}
			}
			
		});
		
		btnNewButton_1.setBackground(new Color(255, 140, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(406, 189, 122, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataBase db = new DataBase();
				
				
			int no =	db.DeleteDetailsM(  table.getValueAt(table.getSelectedRow(), 0).toString() );
			if (no==0) {
				JOptionPane.showMessageDialog(null,"Successfully Deleted");
				DefaultTableModel tableModel = (DefaultTableModel) table. getModel();
				jt.ShowDataInJtable("select * from member", table);
				
			}
			else {
				JOptionPane.showMessageDialog(null,"Not Deleted");
			}
			}
		});
		btnNewButton_2.setBackground(new Color(255, 140, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(549, 189, 117, 23);
		contentPane.add(btnNewButton_2);

		
		
		JLabel ph = new JLabel("Phone No.");
		ph.setForeground(new Color(255, 140, 0));
		ph.setFont(new Font("Tahoma", Font.BOLD, 13));
		ph.setBounds(406, 53, 78, 14);
		contentPane.add(ph);
		
		JLabel lblNewLabel_9 = new JLabel("Age");
		lblNewLabel_9.setForeground(new Color(255, 140, 0));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_9.setBounds(552, 47, 26, 26);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Amount ");
		lblNewLabel_10.setForeground(new Color(255, 140, 0));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_10.setBounds(573, 107, 55, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Gender ");
		lblNewLabel_11.setForeground(new Color(255, 140, 0));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_11.setBounds(613, 53, 50, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Timeing");
		lblNewLabel_12.setForeground(new Color(255, 140, 0));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_12.setBounds(252, 103, 49, 22);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Coach ");
		lblNewLabel_13.setForeground(new Color(255, 140, 0));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_13.setBounds(406, 107, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		coac = new JComboBox();
		coac.setModel(new DefaultComboBoxModel(new String[] {"Select Coach"}));
		coac.setFont(new Font("Tahoma", Font.PLAIN, 14));
		coac.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		coac.setBackground(Color.WHITE);
		coac.setBounds(406, 128, 122, 22);
		contentPane.add(coac);
		updateCombo();
		
		
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		name.setColumns(10);
		name.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		name.setBounds(251, 72, 123, 20);
		contentPane.add(name);
		
		phno = new JTextField();
		phno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		phno.setColumns(10);
		phno.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		phno.setBounds(406, 72, 122, 20);
		contentPane.add(phno);
		
		amou = new JTextField();
		amou.setFont(new Font("Tahoma", Font.PLAIN, 14));
		amou.setColumns(10);
		amou.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(255, 140, 0)));
		amou.setBounds(573, 128, 93, 20);
		contentPane.add(amou);
		
		JLabel lblMemberManger = new JLabel("Member Manger ");
		lblMemberManger.setForeground(new Color(255, 140, 0));
		lblMemberManger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMemberManger.setBounds(389, 25, 129, 17);
		contentPane.add(lblMemberManger);
		
		JLabel mn = new JLabel("*");
		mn.setForeground(new Color(255, 0, 0));
		mn.setFont(new Font("Tahoma", Font.BOLD, 14));
		mn.setBounds(344, 53, 18, 14);
		contentPane.add(mn);
		mn.setVisible(false);
		
		JLabel pn = new JLabel("*");
		pn.setForeground(Color.RED);
		pn.setFont(new Font("Tahoma", Font.BOLD, 14));
		pn.setBounds(473, 54, 18, 14);
		contentPane.add(pn);
		pn.setVisible(false);
		
		
		JLabel ag = new JLabel("*");
		ag.setForeground(Color.RED);
		ag.setFont(new Font("Tahoma", Font.BOLD, 14));
		ag.setBounds(580, 54, 18, 14);
		contentPane.add(ag);
		ag.setVisible(false);
		
		JLabel gn = new JLabel("*");
		gn.setForeground(Color.RED);
		gn.setFont(new Font("Tahoma", Font.BOLD, 14));
		gn.setBounds(659, 54, 18, 14);
		contentPane.add(gn);
		gn.setVisible(false);
		
		JLabel tm = new JLabel("*");
		tm.setForeground(Color.RED);
		tm.setFont(new Font("Tahoma", Font.BOLD, 14));
		tm.setBounds(304, 106, 18, 14);
		contentPane.add(tm);
		tm.setVisible(false);
		
		JLabel ch = new JLabel("*");
		ch.setForeground(Color.RED);
		ch.setFont(new Font("Tahoma", Font.BOLD, 14));
		ch.setBounds(444, 108, 18, 14);
		contentPane.add(ch);
		ch.setVisible(false);
		
		JLabel am = new JLabel("*");
		am.setForeground(Color.RED);
		am.setFont(new Font("Tahoma", Font.BOLD, 14));
		am.setBounds(623, 108, 18, 14);
		contentPane.add(am);
		am.setVisible(false);
		
		ArrayList al = new ArrayList();
		JButton btnNewButton_3 = new JButton("ADD");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean d;
				int a = 0;
				int c =0;
				
				
				DataBase b = new DataBase();
			System.out.print(b.insertIntoDB(al));
			
			d=Pattern.compile("([a-zA-Z]{2,30}\s*)+").matcher(name.getText()).matches();
			if(d==false) {
				mn.setVisible(true);
				 
				a=1;
			}else {al.add(name.getText());}
			
			d=Pattern.compile("^\\d{10}$").matcher(phno.getText()).matches();
			if(d==false) {
				pn.setVisible(true);
				a=1;
			}else {al.add(phno.getText());}
				
			d=Pattern.compile("^\\d{1,3}$").matcher(age.getText()).matches();
			if(d==false) {
				ag.setVisible(true);
				a=1;
			}else {al.add(age.getText());}
			
			d=Pattern.compile("^\\d{1,6}$").matcher(amou.getText()).matches();
			if(d==false) {
				am.setVisible(true);
				a=1;
			}else {al.add(amou.getText());}
			
			if(tim.getSelectedIndex()==0)
			{
				tm.setVisible(true);
				a=1;
			}
			else {al.add(tim.getSelectedItem().toString());}
			
			if(coac.getSelectedIndex()==0)
			{
				ch.setVisible(true);
				a=1;
			}
			else {al.add(coac.getSelectedItem().toString());}
			
			if(gen.getSelectedIndex()==0)
			{
				gn.setVisible(true);
				a=1;
			}
			else {al.add(gen.getSelectedItem().toString());}
			
			
			
			if(a==0) {
				
				c=b.insertIntoDB(al);
			}if(c==1) {
				JOptionPane.showMessageDialog(null, "Added");
			}else {JOptionPane.showMessageDialog(null, "notAdded");}
			
			DefaultTableModel tableModel2 = (DefaultTableModel) table. getModel();
			jt.ShowDataInJtable("select * from member", table);
			}
			
			
		});
		
		btnNewButton_3.setBackground(new Color(255, 140, 0));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(252, 189, 122, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblMemberList = new JLabel("Member List ");
		lblMemberList.setForeground(new Color(255, 140, 0));
		lblMemberList.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMemberList.setBounds(425, 248, 101, 17);
		contentPane.add(lblMemberList);
		
		
		
	}

	private void updateCombo() {
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		// TODO Auto-generated method stub
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","root");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			String sql="select * from coach";
		stm = con.prepareStatement(sql);
		 ResultSet rs= stm.executeQuery();
		while(rs.next()) {
			coac.addItem(rs.getString("name"));
		}
		}catch (Exception e ) {e.printStackTrace();}
	}
}
