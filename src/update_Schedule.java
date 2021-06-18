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

public class update_Schedule extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	update_Schedule()
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
	
	
	
	JButton b1=new JButton("Update");
	JButton b2=new JButton("Cancel");

	String[] trains= {"Badar Express","Awaam Express","chenab Express", "Ghouri Express","Khyber Mall","Millat Express" };

	JComboBox<String> field1=new JComboBox<String> (trains);
	
	String[] from= {"Islamabad","Lahore","Gujrat", "Kasur","Narowal","Malkwal","Patoki","Rahim Yar Khan" };
	JComboBox<String> field2=new JComboBox<String>(from);
	
	String[] To= {"Lahore","Gujrat", "Kasur","Narowal","Malkwal","Patoki","Rahim Yar Khan" };
	JComboBox<String> field3=new JComboBox<String>(To);
	
	String[] mode= {"AM","PM" };
	JComboBox<String> field4=new JComboBox<String>(mode);
	
	JTextField field5=new JTextField();
	
	
	
	JLabel label1=new JLabel("Ticket ID");
	JLabel label2=new JLabel("From");
	JLabel label3=new JLabel("To");
	
	JLabel label5=new JLabel("Time");
	JLabel label4=new JLabel("Mode");
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

		
		field1.setFont(new Font("Yu Gothic UI", Font.BOLD,14));
		field1.setBackground(Color.white);
		field1.setBorder(null);
		
		field2.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		field2.setBackground(Color.white);
		field2.setBorder(null);
		field3.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		field3.setBackground(Color.white);
		field3.setBorder(null);
		
		field4.setFont(new Font("Yu Gothic UI", Font.BOLD,12));
		field4.setBackground(Color.white);
		field4.setBorder(null);
		
		
		

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
		
		
		c.gridx = 0;
		c.gridy = 0;
	
		p4.add(label5,c);
		
		c.ipady = 10;
		c.anchor = GridBagConstraints.LINE_START;
		c.insets = new Insets(10,170,0,170);
		c.gridwidth = 5;
		c.gridx = 10;
		c.gridy = 0;
		p4.add(field5,c);
	
		
		c.gridx = 10;
		c.gridy = 0;
		c.insets = new Insets(5,350,0,0);
		p4.add(label4,c);
		
		
		c.ipady = 5;
		c.anchor = GridBagConstraints.PAGE_START;
		c.insets = new Insets(10,395,0,0);
		c.gridwidth = 5;
		c.gridx = 10;
		c.gridy = 0;
		p4.add(field4,c);
	
		p4.setBorder(BorderFactory.createEmptyBorder(1,0,1,80));
		
		
		
		p5.setBackground(new Color(218,227,229));
		
		p6.setBackground(new Color(218,227,229));
		
		p6.setLayout(new GridBagLayout());
		c.fill = GridBagConstraints.HORIZONTAL;
		
		
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0,140,0,290);
		p6.add(b1,c);
		
		
		
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(0,320,0,110);
		p6.add(b2,c);
		
		
		p7.setBackground(new Color(218,227,229));
		this.getContentPane().setLayout(new CardLayout());
		this.getContentPane().add(p1);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			String trains=(String)field1.getSelectedItem();
			String from=(String)field2.getSelectedItem();
			String to=(String)field3.getSelectedItem();
			
			String time=field5.getText();
			String mode=(String)field4.getSelectedItem();
	
		
			 try 
			 
			   {
				   Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eTicketing","root","10965252");
				
			
					String query2=" update schedule_ Set time_=? , mode_=? where trains=? AND from_=? AND to_=?;";
					PreparedStatement pstmt = con.prepareStatement(query2);
					pstmt.setString(1, time);
					pstmt.setString(2, mode);
					pstmt.setString(3, trains);
					pstmt.setString(4, from);
					pstmt.setString(5, to);
					pstmt.execute();
					JOptionPane.showMessageDialog(null, "successfully updated");
					this.dispose();
				   
			   }
			catch(Exception z)
			   {
					System.out.print(e);
			   }
		}
		if(e.getSource()==b2)
		{
			this.dispose();
			admin_frame ad=new admin_frame();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			ad.setIconImage(image.getImage());
			ad.setSize(600, 550);
			ad.setTitle("E-Ticketing");
			ad.setVisible(true);
			ad.setLocation(200, 100);
			ad.setResizable(false);
			
		}
		
	}

}
