import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class employee_login extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	employee_login()
	{
		initialize();
	}
	//front panel
	Border thickBorder = new LineBorder(new Color(218,227,229), 6);
	
	Border Border = new LineBorder(new Color(15,82,87), 10);
	
	GridBagConstraints c = new GridBagConstraints();
	
	
	JLabel h1=new JLabel("E-TICKETING");
	
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();
	JPanel p6=new JPanel();
	JPanel p7=new JPanel();
	
	
	
	JButton b1=new JButton("Sign In");
	JButton b2=new JButton("Sign Up");
	JTextField field1=new JTextField();
	JPasswordField field2=new JPasswordField();
	JLabel label1=new JLabel("Username");
	JLabel label2=new JLabel("Password");
	
	public void initialize() {
		
		b1.setBorder(thickBorder);
		b1.setBackground(new Color(38,89,107));
		b1.setForeground(Color.white);
		b1.setFont(new Font("Yu Gothic UI", Font.BOLD,24));
		b1.addActionListener(this);
		
		b2.setBorder(thickBorder);	
		b2.setBackground(new Color(38,89,107));
		b2.setForeground(Color.white);
		b2.setFont(new Font("Yu Gothic UI", Font.BOLD,24));
		b2.addActionListener(this);
	
		h1.setFont(new Font("Yu Gothic UI", Font.BOLD,45));
		h1.setForeground(Color.white);
		
		label1.setFont(new Font("Yu Gothic UI", Font.BOLD,18));
		label2.setFont(new Font("Yu Gothic UI", Font.BOLD,18));
		
		p1.setLayout(new GridLayout(6,1));
		p1.add(p2);
		p1.add(p3);
		p1.add(p4);
		p1.add(p5);
		p1.add(p6);
		p1.add(p7);
		
		
		p2.add(h1);
		p2.setBackground(new Color(15,82,87));
		p2.setBorder(Border);
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));

		p3.setBackground(new Color(218,227,229));
		
		
		p4.setBackground(new Color(218,227,229));
		p4.setLayout(new GridBagLayout());
		
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 0;
		p4.add(label1,c);
		
		c.ipady = 10;
		c.weightx = 10.0;
		c.gridwidth = 8;
		c.gridx = 5;
		c.gridy = 0;
		p4.add(field1,c);
		
		c.weightx = 0.5;
		c.gridx = 0;
		c.gridy = 3;
		p4.add(label2,c);
		
		c.ipady = 10;
		c.weightx = 10.0;
		c.gridwidth = 8;
		c.gridx = 5;
		c.gridy = 3;
		p4.add(field2,c);
		
		p4.setBorder(BorderFactory.createEmptyBorder(1,150,1,120));
		
		
		
		p5.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		
		
		c.gridx = 5;
		c.gridy = 5;
		p5.add(b1,c);
		
		
		c.gridx = 20;
		c.gridy = 5;
		p5.add(b2,c);
		
		p5.setBorder(BorderFactory.createEmptyBorder(1,40,1,40));
		p5.setBackground(new Color(218,227,229));
		
		p6.setBackground(new Color(218,227,229));
		p7.setBackground(new Color(218,227,229));
		this.getContentPane().setLayout(new CardLayout());
		this.getContentPane().add(p1);
		
		
		
		
		
		this.getContentPane().setLayout(new CardLayout());
		this.getContentPane().add(p1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			String user= field1.getText();
			char[] x= field2.getPassword();
		   String pass=String.valueOf(x);
		    
		   try 
		   {
			   Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eTicketing","root","10965252");
				Statement stmt=con.createStatement();
				
				String query=" Select * from employee where UserName='"+user+"' and password_='"+pass+"'";
				ResultSet rs=stmt.executeQuery(query);
				
				if(rs.next())
				{
					this.dispose();
					employee_frame ef=new employee_frame();
					ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
					ef.setIconImage(image.getImage());
					ef.setSize(600, 550);
					ef.setTitle("E-Ticketing");
					ef.setVisible(true);
					ef.setResizable(false);
					ef.setLocation(200, 100);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Incorrect UserName OR password");;
				}
			   
		   }
		catch(Exception z)
		   {
				System.out.print(e);
		   }
			
			
			
		}
		if(e.getSource()==b2)
		{
			
			
			this.dispose();
			employee_SignUp es =new employee_SignUp();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			es.setIconImage(image.getImage());
			es.setVisible(true);
			es.setSize(600, 550);
			es.setTitle("E-Ticketing");
			es.setLocation(200, 100);
			es.setResizable(false);
			
		}
		
	}

}
