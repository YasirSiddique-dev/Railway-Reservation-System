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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class ticket_booking extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ticket_booking()
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
	
	
	
	JButton b1=new JButton("Confirm");
	JButton b2=new JButton("Cancel");
	JTextField field1=new JTextField();
	
	
	String[] from= {"Islamabad","Lahore","Gujrat", "Kasur","Narowal","Malkwal","Patoki","Rahim Yar Khan" };
	JComboBox<String> field2=new JComboBox<String>(from);
	
	String[] To= {"Islamabad","Lahore","Gujrat", "Kasur","Narowal","Malkwal","Patoki","Rahim Yar Khan" };
	JComboBox<String> field3=new JComboBox<String>(To);
	
	String[] Services= {"Business Class","Economy Class", "Luxury Class" };
	JComboBox<String> field6=new JComboBox<String>(Services);
	
	String[] Seat= {"1","2", "3","4","5","6","7","8","9","10" };
	JComboBox<String> field7=new JComboBox<String>(Seat);
	
	
	JComboBox<String> field9=new JComboBox<String>();
	
	UtilDateModel model = new UtilDateModel();
	JDatePanelImpl datePanel = new JDatePanelImpl(model);
	JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
	 
	
	
	JTextField field4=new JTextField();
	JTextField field5=new JTextField();
	
	
	JLabel label1=new JLabel("Ticket ID");
	JLabel label2=new JLabel("From");
	JLabel label3=new JLabel("To");
	
	JLabel label4=new JLabel("Name");
	JLabel label5=new JLabel("Phone");
	JLabel label6=new JLabel("Services");
	JLabel label7=new JLabel("Seats");
	JLabel label8=new JLabel("Date");
	JLabel label9=new JLabel("Time");
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
		
		label1.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label2.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label3.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label4.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label5.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label6.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label7.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label8.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		label9.setFont(new Font("Yu Gothic UI", Font.BOLD,16));
		datePicker.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		datePicker.setBackground(Color.white);
		datePicker.setBorder(null);
		
		field2.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		field2.setBackground(Color.white);
		field2.setBorder(null);
		field3.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		field3.setBackground(Color.white);
		field3.setBorder(null);
		field6.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		field6.setBackground(Color.white);
		field6.setBorder(null);
		field7.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		field7.setBackground(Color.white);
		field7.setBorder(null);
		
		field9.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		field9.setBackground(Color.white);
		field9.setBorder(null);
		
		
		field1.setSize(30, 50);
		field1.setEditable(false);
		try
		{
		  Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eTicketing","root","10965252");
			Statement stmt=con.createStatement();
			String query=" Select Distinct time_ from schedule_;";
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				field9.addItem(rs.getString("time_"));
			}
			con.close();
		}
		catch(Exception z)
		   {	
				System.out.print(z);
		   }

		
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
		c.insets = new Insets(5,10,0,70);
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
		
		
		
		p6.setBackground(new Color(218,227,229));
		
		p6.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.weightx = 1;
		c.gridx = 10;
		c.gridy = 0;
		c.insets = new Insets(-20,80,30,0);
		p6.add(label8,c);
		
		
		c.weightx = 1;
		c.gridx = 10;
		c.gridy = 0;
		c.insets = new Insets(-20,140,30,240);
		p6.add(datePicker,c);
		
		c.weightx = 1;
		c.gridx = 10;
		c.gridy = 0;
		c.insets = new Insets(-20,400,30,0);
		p6.add(label9,c);
		
		c.ipady = 5;
		c.insets = new Insets(-20,445,30,40);
		c.gridwidth = 5;
		c.gridx = 11;
		c.gridy = 0;
		p6.add(field9,c);
		
		
		
		p7.setBackground(new Color(218,227,229));
		
		p7.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0,140,0,290);
		p7.add(b1,c);
		
		
		
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0,320,0,110);
		p7.add(b2,c);
		this.getContentPane().setLayout(new CardLayout());
		this.getContentPane().add(p1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			int fare=0;
			int rowcount = 0;
			try 
			   {
				   Class.forName("com.mysql.jdbc.Driver");
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eTicketing","root","10965252");
					Statement stmt=con.createStatement();
					
					String query=" Select COUNT(*) from tickets";
					ResultSet rs=stmt.executeQuery(query);
					rs.next();
					rowcount=rs.getInt(1);
					
				   
			   }
			catch(Exception z)
			   {	
					System.out.print(e);
			   }
			
			if(rowcount<171)
			{
				try 
				   {
					   tickets t=new tickets();
					   
					   t.setName(field4.getText());
					   
					   long x=Long.parseLong(field5.getText());
					   t.setPhone(x);
					   
					   String FromLoc=(String)field2.getSelectedItem();
					   t.setFrom(FromLoc);
					   
					   String ToLoc=(String)field3.getSelectedItem();
					   t.setTo(ToLoc);
					   
					   String Services=(String)field6.getSelectedItem();
					   t.setServices(Services);
					   
					   
					   
					   String s=(String)field7.getSelectedItem();
					   int seats=Integer.parseInt(s);
				
					   t.setSeats(seats);
					   
					   if(Services=="Business Class")
					   {
						   fare=700*seats;
					   }
					   if(Services=="Luxury Class")
					   {
						   fare=1000*seats;
					   }
					   if(Services=="Economy Class")
					   {
						   fare=500*seats;
					   }
					   String time=(String)field9.getSelectedItem();
					   t.setTime(time);
					   
					   Date selectedDate = (Date) datePicker.getModel().getValue();
					   DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
					   
					   String strDate = dateFormat.format(selectedDate);  
					   t.setDate(strDate);
					   
					
					 	Class.forName("com.mysql.jdbc.Driver");
						
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eTicketing","root","10965252");
						   
						
						   
						String query1="INSERT INTO tickets(Name_,phone,FromLocation,ToLocation,Services,seats,date_,time_) values(?,?,?,?,?,?,?,?); ";
						PreparedStatement pstmt=con.prepareStatement(query1);
						
						pstmt.setString(1,t.getName());
						pstmt.setLong(2, t.getPhone());
						pstmt.setString(3, t.getFrom());
						pstmt.setString(4, t.getTo());
						pstmt.setString(5, t.getService());
						pstmt.setInt(6, t.getSeats());
						pstmt.setString(7, t.getDate());
						pstmt.setString(8, t.getTime());
						
						pstmt.executeUpdate();
				

					
						con.close();
						
						String msg="<html><p>Name : "+t.getName()+" <br> Phone : "+t.getPhone()+"<br> Standard : "+t.getService()+"<br> Seats : "+t.getSeats()+"<br> fare : "+fare+" <br> Booking Confirmed</p></html>";
						JOptionPane.showMessageDialog(null,msg);
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
				catch(Exception z)
				   {
						JOptionPane.showMessageDialog(null, "Error While Inputting the Data");
						System.out.print(e);
						
				   }
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Train is full");
			}
					}
		if(e.getSource()==b2)
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
		
	}

}
