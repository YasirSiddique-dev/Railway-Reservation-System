import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class employee_frame extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Border thickBorder = new LineBorder(new Color(218,227,229));// creating border for main button
	Border thickBorder2 = new LineBorder(new Color(15,82,87), 17);//creating border for footer button
	Border Border = new LineBorder(new Color(15,82,87), 25);//creating border for main heading
	//creating labels
	JLabel h1=new JLabel("E_TICKETING");
	//creating panels
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();
	JPanel p6=new JPanel();
	//creating buttons
	JButton b1=new JButton("Ticket Booking");
	JButton b2=new JButton("Cancel Reservation");
	JButton b4=new JButton("Booked Tickets");
	JButton b6=new JButton("Schedule");
	JButton b7=new JButton("FAQ's");
	JButton b8=new JButton("Back ");
	public employee_frame() {
		initialize();
	}
	//Initialize the method
	public void initialize() {
		//setting the properties of button 1
		b1.setBorder(thickBorder);
		b1.setBackground(new java.awt.Color(3, 71, 72));
		b1.setForeground(Color.white);
		b1.setFont(new Font("Yu Gothic UI", Font.BOLD,45));
		b1.addActionListener(this);
		//setting the properties of button 2
		b2.setBorder(thickBorder);	
		b2.setBackground(new java.awt.Color(68,124,142));
		b2.setForeground(Color.white);
		b2.setFont(new Font("Yu Gothic UI", Font.BOLD,30));
		b2.addActionListener(this);
		//setting the properties of button 4
		b4.setBorder(thickBorder);
		b4.setBackground(new Color(68,124,142));
		b4.setForeground(Color.white);
		b4.setFont(new Font("Yu Gothic UI", Font.BOLD,30));
		b4.addActionListener(this);
		//setting the properties of button 6
		b6.setBorder(thickBorder2);
		b6.setBackground(new Color(88,111,124));
		b6.setForeground(Color.white);
		b6.setFont(new Font("Yu Gothic UI", Font.BOLD,30));
		b6.addActionListener(this);
		//setting the properties of button 7
		b7.setBorder(thickBorder2);
		b7.setBackground(new Color(88,111,124));
		b7.setForeground(Color.white);
		b7.setFont(new Font("Yu Gothic UI", Font.BOLD,30));
		b7.addActionListener(this);
		//setting the properties of button 8
		b8.setBorder(thickBorder2);
		b8.setBackground(new Color(88,111,124));
		b8.setForeground(Color.white);
		b8.setFont(new Font("Yu Gothic UI", Font.BOLD,30));
		b8.addActionListener(this);
		//setting the properties of heading 1
		h1.setFont(new Font("Yu Gothic UI", Font.BOLD,40));
		h1.setForeground(Color.white);
		
		
		p1.setLayout(new GridLayout(5,1));
		p1.add(p2);
		p1.add(p3);
		p1.add(p4);
		p1.add(p5);
		p1.add(p6);
	
		p2.add(h1);
		p2.setBackground(new Color(15,82,87));
		p2.setBorder(Border);
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		p3.setBackground(new Color(218,227,229));
		p3.setLayout(new GridLayout());
		p3.add(b1);
		p3.setBorder(BorderFactory.createEmptyBorder(10,30,2,30));
		
		
		p4.setLayout(new GridLayout(1,1));
		p4.add(b2);
		p4.setBorder(BorderFactory.createEmptyBorder(5,30,5,30));
		p4.setBackground(new Color(218,227,229));
		
		p5.setBackground(new Color(218,227,229));
		p5.setLayout(new GridLayout(1,1));
		p5.setBorder(BorderFactory.createEmptyBorder(5,30,5,30));
		p5.add(b4);
		
		
		p6.setLayout(new GridLayout(1,3));
		p6.setBackground(new Color(15,82,87));
		p6.add(b6);
		p6.add(b7);
		p6.add(b8);
		
		this.getContentPane().setLayout(new CardLayout());
		this.getContentPane().add(p1);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b8)
		{
			this.dispose();
			front_frame ff=new front_frame();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			ff.setIconImage(image.getImage());
			ff.setSize(600, 550);
			ff.setTitle("E-Ticketing");
			ff.setVisible(true);
			ff.setResizable(false);
			ff.setLocation(200, 100);
		
		}
		if(e.getSource()==b7)
		{
			
			FAQ_frame ff=new FAQ_frame();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			ff.setIconImage(image.getImage());
			ff.setSize(600, 550);
			ff.setTitle("E-Ticketing");
			ff.setVisible(true);
			ff.setLocation(200, 100);
			ff.setResizable(false);
		
		}
		if(e.getSource()==b1)
		{
			
			this.dispose();
			ticket_booking tb=new ticket_booking();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			tb.setIconImage(image.getImage());
			tb.setSize(600, 550);
			tb.setTitle("E-Ticketing");
			tb.setVisible(true);
			tb.setLocation(200, 100);
			tb.setResizable(false);
			
		
		
		}
		if(e.getSource()==b2)
		{
			this.dispose();
			cancel_tickets tb=new cancel_tickets();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			tb.setIconImage(image.getImage());
			tb.setSize(600, 550);
			tb.setTitle("E-Ticketing");
			tb.setVisible(true);
			tb.setLocation(200, 100);
			tb.setResizable(false);
		}
		if(e.getSource()==b4)
		{
			
			booked_tickets bt=new booked_tickets();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			bt.setIconImage(image.getImage());
			bt.setSize(700, 550);
			bt.setTitle("E-Ticketing");
			bt.setVisible(true);
			bt.setLocation(200, 100);
			bt.setResizable(false);
		}
		
		if(e.getSource()==b6)
		{
			
			schedule s=new schedule();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			s.setIconImage(image.getImage());
			s.setSize(600, 550);
			s.setTitle("E-Ticketing");
			s.setVisible(true);
			s.setLocation(200, 100);
			s.setResizable(false);
		}
		
		
	}

}
