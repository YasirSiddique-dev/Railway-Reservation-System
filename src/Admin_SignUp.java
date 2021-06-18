import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Admin_SignUp extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Admin_SignUp()
	{
		initialize();
	}
	Border Border = new LineBorder(new Color(15,82,87), 10);//setting the border for mai heading
	Border thickBorder = new LineBorder(new Color(218,227,229), 6);//setting the border for button
	GridBagConstraints c = new GridBagConstraints();//creating an object of GridBagConstraint
	//creating the panels
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	//creating the buttons
	JButton b1=new JButton("Confirm");
	JButton b2=new JButton("Cancel");
	//creating the fields for frame
	JTextField field1=new JTextField();
	JTextField field2=new JTextField();
	JTextField field3=new JTextField();
	JTextField field4=new JTextField();
	JTextField field5=new JTextField();
	//creating the labels for fields
	JLabel label1=new JLabel("First Name");
	JLabel label2=new JLabel("Last Name");
	JLabel label3=new JLabel("Age");
	JLabel label4=new JLabel("Phone No");
	JLabel label5=new JLabel("Password");
	JLabel label6=new JLabel("E-TICKETING");
	//adding a method for above function
	public void initialize() {
		//setting the properties of button 1
		b1.setBorder(thickBorder);
		b1.setBackground(new Color(38,89,107));
		b1.setForeground(Color.white);
		b1.setFont(new Font("Yu Gothic UI", Font.BOLD,24));
		b1.addActionListener(this);
		//setting the properties of button 2
		b2.setBorder(thickBorder);	
		b2.setBackground(new Color(38,89,107));
		b2.setForeground(Color.white);
		b2.setFont(new Font("Yu Gothic UI", Font.BOLD,24));
		b2.addActionListener(this);
		//setting the properties of labels
		label1.setFont(new Font("Yu Gothic UI", Font.BOLD,18));
		label2.setFont(new Font("Yu Gothic UI", Font.BOLD,18));
		label3.setFont(new Font("Yu Gothic UI", Font.BOLD,18));
		label4.setFont(new Font("Yu Gothic UI", Font.BOLD,18));
		label5.setFont(new Font("Yu Gothic UI", Font.BOLD,18));
		label6.setFont(new Font("Yu Gothic UI", Font.BOLD,18));
		label6.setFont(new Font("Yu Gothic UI", Font.BOLD,45));
		label6.setForeground(Color.white);
		//setting the main panel
		p3.setLayout(new BorderLayout());
		p3.add(p2,BorderLayout.NORTH);
		p3.add(p1,BorderLayout.CENTER);
		//setting and adding the components in panel2
		p2.add(label6);
		p2.setBackground(new Color(15,82,87));
		p2.setBorder(Border);
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		//setting and adding the components in panel1
		p1.setLayout(new GridBagLayout());
		p1.setBackground(new Color(218,227,229));
		p1.setBorder(BorderFactory.createEmptyBorder(1,150,1,120));
		//defining the properties of gridBag layout 
		c.fill = GridBagConstraints.HORIZONTAL;
		c.anchor = GridBagConstraints.PAGE_START;
		c.insets = new Insets(0,0,10,0);
	
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 1;		
		p1.add(label1,c);
		
		c.ipady = 10;
		c.gridwidth = 60;
		c.gridx = 5;
		c.gridy = 1;
		p1.add(field1,c);
		
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 2;
		p1.add(label2,c);
		
		c.ipady = 10;
		c.weightx = 10.0;
		c.gridwidth = 60;
		c.gridx = 5;
		c.gridy = 2;
		p1.add(field2,c);
		
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 3;
		p1.add(label3,c);
		
		c.ipady = 10;
		c.weightx = 10.0;
		c.gridwidth = 60;
		c.gridx = 5;
		c.gridy = 3;
		p1.add(field3,c);
	
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 4;
		p1.add(label4,c);
		
		c.ipady = 10;
		c.weightx = 10.0;
		c.gridwidth = 60;
		c.gridx = 5;
		c.gridy = 4;
		p1.add(field4,c);

		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 5;
		p1.add(label5,c);
		
		c.ipady = 10;
		c.weightx = 10.0;
		c.gridwidth =60;
		c.gridx = 5;
		c.gridy = 5;
		p1.add(field5,c);
		
		c.gridx = 6;
		c.gridy = 6;
		p1.add(b1,c);
		
		c.gridx = 6;
		c.gridy = 7;
		p1.add(b2,c);
		
		p1.setBorder(BorderFactory.createEmptyBorder(1,60,1,150));
		//adding the main panel into the frame
		this.getContentPane().setLayout(new CardLayout());
		this.getContentPane().add(p3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			 try 
			   {	
				 //storing the data from field to setter
				   admin_detail ed=new admin_detail();
				   
				   ed.setName(field1.getText());
				   ed.setUser(field2.getText());
				   
				   int age=Integer.parseInt(field3.getText());
				   ed.setAge(age);
				   
				   long phone=Long.parseLong(field4.getText());
				   ed.setPhone(phone);
				   
				   ed.setPass(field5.getText());
				   //building a connection
				 	Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eTicketing","root","10965252");
					//preparing the query
					String query="INSERT INTO employee(fullName,UserName,age,phone,password_) values(?,?,?,?,?); ";
					
					PreparedStatement pstmt = con.prepareStatement(query);
					pstmt.setString(1, ed.getName());
					pstmt.setString(2, ed.getUser());
					pstmt.setInt(3, ed.getAge());
					pstmt.setLong(4, ed.getPhone());
					pstmt.setString(5, ed.getPassword());
					//executing the query
					pstmt.execute();
						JOptionPane.showMessageDialog(null, "Success..!");
						this.dispose();
						Admin_login al=new Admin_login();
						ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
						al.setIconImage(image.getImage());
						al.setSize(600, 550);
						al.setTitle("E-Ticketing");
						al.setVisible(true);
						al.setLocation(200, 100);
					//closing the connections
					con.close();
			   }
			catch(Exception z)
			   {
					JOptionPane.showMessageDialog(null, "Error While Inputting the Data");
					System.out.print(e);
			   }	
		}
		if(e.getSource()==b2)
		{
			this.dispose();
			Admin_login al=new Admin_login();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			al.setIconImage(image.getImage());
			al.setSize(600, 550);
			al.setTitle("E-Ticketing");
			al.setVisible(true);
			al.setLocation(200, 100);
			al.setResizable(false);
		}

	}

}
