import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class cancel_tickets extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	cancel_tickets()
	{
		initialize();
	}
	Border thickBorder = new LineBorder(new Color(218,227,229), 6);//creating border for buttons
	Border Border = new LineBorder(new Color(15,82,87), 10); //creating border for main heading
	GridBagConstraints c = new GridBagConstraints();//making an object of grid bag constraints
	//creating main label
	JLabel h1=new JLabel("E-TICKETING");
	//creating panels
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();
	JPanel p6=new JPanel();
	JPanel p7=new JPanel();
	//creating buttons
	JButton b1=new JButton("Search");
	JButton b2=new JButton("Confirm");
	JButton b3=new JButton("Cancel");
	//creating text field
	JTextField field1=new JTextField();
	JTextField field4=new JTextField();
	JTextField field5=new JTextField();
	//creating Combo boxes
	String[] from= {"Islamabad","Lahore","Gujrat", "Kasur","Narowal","Malkwal","Patoki","Rahim Yar Khan" };
	JComboBox<String> field2=new JComboBox<String> (from);
	String[] To= {"Islamabad","Lahore","Gujrat", "Kasur","Narowal","Malkwal","Patoki","Rahim Yar Khan" };
	JComboBox<String>  field3=new JComboBox<String> (To);
	String[] Services= {"Business Class","Economy Class", "Luxury Class" };
	JComboBox<String>  field6=new JComboBox<String>(Services);
	String[] Seat= {"1","2", "3","4","5","6","7","8","9","10" };
	JComboBox<String>  field7=new JComboBox<String>(Seat);
	//creating the labels
	JLabel label1=new JLabel("Ticket ID");
	JLabel label2=new JLabel("From");
	JLabel label3=new JLabel("To");
	JLabel label4=new JLabel("Name");
	JLabel label5=new JLabel("Phone");
	JLabel label6=new JLabel("Services");
	JLabel label7=new JLabel("Seats");
	JLabel label8=new JLabel("date");
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
		b2.setEnabled(false);
		//setting the properties of button 3
		b3.setBorder(thickBorder);
		b3.setBackground(new Color(38,89,107));
		b3.setForeground(Color.white);
		b3.setFont(new Font("Yu Gothic UI", Font.BOLD,24));
		b3.addActionListener(this);
		//setting the properties of main heading
		h1.setFont(new Font("Yu Gothic UI", Font.BOLD,45));
		h1.setForeground(Color.white);
		//setting the properties of labels
		label1.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label2.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label3.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label4.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label5.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label6.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label7.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label8.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		//setting the properties of field 2
		field2.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		field2.setBackground(Color.white);
		field2.setBorder(null);
		//setting the properties of field 3
		field3.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		field3.setBackground(Color.white);
		field3.setBorder(null);
		//setting the properties of field 6
		field6.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		field6.setBackground(Color.white);
		field6.setBorder(null);
		//setting the properties of field 7
		field7.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		field7.setBackground(Color.white);
		field7.setBorder(null);
		
		
		//disabling the fields	
		field4.setEditable(false);
		field5.setEditable(false);
		//setting the main panel
		p1.setLayout(new GridLayout(6,1));
		p1.add(p2);
		p1.add(p3);
		p1.add(p4);
		p1.add(p5);
		p1.add(p6);
		p1.add(p7);
		//setting the panel 2
		p2.add(h1);
		p2.setBackground(new Color(15,82,87));
		p2.setBorder(Border);
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		//setting the panel 3
		p3.setBackground(new Color(218,227,229));
		p3.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.weightx = 1;
		c.gridx = 10;
		c.gridy = 0;
		c.insets = new Insets(5,90,0,0);
		p3.add(label1,c);
		
		c.ipady = 10;
		c.weightx = 10.0;
		c.anchor = GridBagConstraints.PAGE_START;
		
		c.insets = new Insets(5,10,0,100);
		c.gridwidth = 5;
		c.gridx = 11;
		c.gridy = 0;
		p3.add(field1,c);
		
		c.weightx = 1;
		c.gridx = 10;
		c.gridy = 5;
		c.insets = new Insets(10,5,0,0);
		p3.add(label2,c);
		
		c.ipady = 5;
		c.weightx = 5.0;
		c.insets = new Insets(10,-110,0,220);
		c.gridwidth = 5;
		c.gridx = 11;
		c.gridy = 5;
		p3.add(field2,c);
		
		c.weightx = 5;
		c.gridx = 11;
		c.gridy = 5;
		c.insets = new Insets(10,90,0,0);
		p3.add(label3,c);
		
		c.ipady = 5;
		c.weightx = 5.0;
		c.insets = new Insets(10,120,0,0);
		c.gridwidth = 20;
		c.gridx = 11;
		c.gridy = 5;
		p3.add(field3,c);
		
		p3.setBorder(BorderFactory.createEmptyBorder(1,50,1,80));
		//setting the panel 4
		p4.setBackground(new Color(218,227,229));
		p4.setLayout(new GridBagLayout());
	
		c.weightx = 1;
		c.gridx = 10;
		c.gridy = 0;
		c.insets = new Insets(60,30,20,0);
		p4.add(label4,c);
		
		c.ipady = 10;
		c.weightx = 10.0;
		c.anchor = GridBagConstraints.LINE_START;
		c.insets = new Insets(50,90,0,150);
		c.gridwidth = 5;
		c.gridx = 11;
		c.gridy = 0;
		p4.add(field4,c);
			
		p4.setBorder(BorderFactory.createEmptyBorder(1,50,1,80));
		//setting the panel 5
		p5.setLayout(new GridBagLayout());

		c.weightx = 1;
		c.gridx = 10;
		c.gridy = 0;
		c.insets = new Insets(-20,25,30,0);
		p5.add(label5,c);
		
		c.ipady = 10;
		c.weightx = 10.0;
		c.anchor = GridBagConstraints.PAGE_START;
		c.insets = new Insets(50,90,100,150);
		c.gridwidth = 5;
		c.gridx = 11;
		c.gridy = 0;
		p5.add(field5,c);
		
		c.weightx = 1;
		c.gridx = 10;
		c.gridy = 0;
		c.insets = new Insets(85,10,30,0);
		p5.add(label6,c);
		
		c.ipady = 5;
		c.weightx = 5.0;
		c.anchor = GridBagConstraints.PAGE_START;
		c.insets = new Insets(85,90,30,150);
		c.gridwidth = 5;
		c.gridx = 11;
		c.gridy = 0;
		p5.add(field6,c);
		
		c.weightx = 1;
		c.gridx = 10;
		c.gridy = 0;
		c.insets = new Insets(87,350,30,0);
		p5.add(label7,c);
		
		c.ipady = 5;
		c.weightx = 5.0;
		c.anchor = GridBagConstraints.PAGE_START;
		c.insets = new Insets(85,395,30,10);
		c.gridwidth = 5;
		c.gridx = 11;
		c.gridy = 0;
		p5.add(field7,c);
				
		p5.setBorder(BorderFactory.createEmptyBorder(1,50,1,80));
		p5.setBackground(new Color(218,227,229));
		//setting the panel 6
		p6.setBackground(new Color(218,227,229));
		p6.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(30,140,0,290);
		p6.add(b1,c);
		
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(30,320,0,110);
		p6.add(b2,c);
		//setting the panel 7
		p7.setBackground(new Color(218,227,229));
		p7.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0,250,0,200);
		p7.add(b3,c);
		//adding the main panel to frame
		this.getContentPane().setLayout(new CardLayout());
		this.getContentPane().add(p1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{	
			//storing the id to the variable
			int x= Integer.parseInt(field1.getText());
			
			try 
			   {
					//making connection to the DB
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eTicketing","root","10965252");
					//Preparing statement
					Statement stmt=con.createStatement();
					String query=" Select * from tickets where ticketId='"+x+"'";
					ResultSet rs=stmt.executeQuery(query);
					if(rs.next())
					{
						//storing the data from DB to variables
						JOptionPane.showMessageDialog(null, "Data Found");
						String name=rs.getString("Name_");
						String phone=rs.getString("phone");
						String from=rs.getString("FromLocation");
						String toloc=rs.getString("ToLocation");
						String serv=rs.getString("Services");
						String seat1=rs.getString("seats");
						//setting the fields
						field2.setSelectedItem(from);
						field3.setSelectedItem(toloc);
						field4.setText(name);
						field5.setText(phone);
						field6.setSelectedItem(serv);
						field7.setSelectedItem(seat1);
						b2.setEnabled(true);		
					}
					else
					{
						JOptionPane.showMessageDialog(null, "No Data Found");
					}
			   }
			catch(Exception z)
			   {	
					System.out.print(z);
			   }
		}
		//setting the delete buttong
		if(e.getSource()==b2)
		{
			int x= Integer.parseInt(field1.getText());
			
			try 
			   {
					//making connection to the DB
				 	Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eTicketing","root","10965252");
					//Preparing the statement
					String query1="Delete from tickets where ticketId=? ";
					PreparedStatement pstmt=con.prepareStatement(query1);
					pstmt.setInt(1,x);
					//Execution the statement
					pstmt.executeUpdate();
					//close the connection after deletion
					con.close();
					JOptionPane.showMessageDialog(null, "Data Deleted");
					//closing the current frame
					this.dispose();
					//opening the new frame
					employee_frame ef=new employee_frame();
					ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
					ef.setIconImage(image.getImage());
					ef.setSize(600, 550);
					ef.setTitle("E-Ticketing");
					ef.setVisible(true);
					ef.setLocation(200, 100);
					ef.setResizable(false);
					
			   }
			catch(Exception z)
			   {
				//showing error message in case of exception
					JOptionPane.showMessageDialog(null, "Error While Deleting the data");
					System.out.print(e);
					
			   }
			
		}
		//setting the back button
		if(e.getSource()==b3)
		{
			this.dispose();
			employee_frame ef=new employee_frame();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			ef.setIconImage(image.getImage());
			ef.setSize(600, 550);
			ef.setTitle("E-Ticketing");
			ef.setVisible(true);
			ef.setLocation(200, 100);
			ef.setResizable(false);
			
		}
		
	}

}
