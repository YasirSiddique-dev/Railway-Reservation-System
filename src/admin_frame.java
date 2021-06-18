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

public class admin_frame extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	Border thickBorder = new LineBorder(new Color(218,227,229)); //creating border for center buttons
	Border thickBorder2 = new LineBorder(new Color(15,82,87), 17); //creating border for footer buttons
	Border Border = new LineBorder(new Color(15,82,87), 25); //creating border for main heading
	//creating the main label
	JLabel h1=new JLabel("E_TICKETING");
	//creating the panels
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();
	JPanel p6=new JPanel();
	//creating the buttons
	JButton b1=new JButton("Update Schedule");
	JButton b2=new JButton("View Employees");
	JButton b6=new JButton("Schedule");
	JButton b7=new JButton("FAQ's");
	JButton b8=new JButton("Back ");
	//creating non parameterized constructor
	public admin_frame() {
		initialize();//create a function
	}
	//writing the definition of the above function
	public void initialize() {
		//setting the properties of the button 1
		b1.setBorder(thickBorder);
		b1.setBackground(new java.awt.Color(3, 71, 72));
		b1.setForeground(Color.white);
		b1.setFont(new Font("Yu Gothic UI", Font.BOLD,45));
		b1.addActionListener(this);
		//setting the properties of the button 2
		b2.setBorder(thickBorder);	
		b2.setBackground(new java.awt.Color(68,124,142));
		b2.setForeground(Color.white);
		b2.setFont(new Font("Yu Gothic UI", Font.BOLD,30));
		b2.addActionListener(this);
		//setting the properties of the button 6
		b6.setBorder(thickBorder2);
		b6.setBackground(new Color(88,111,124));
		b6.setForeground(Color.white);
		b6.setFont(new Font("Yu Gothic UI", Font.BOLD,30));
		b6.addActionListener(this);
		//setting the properties of the button 7
		b7.setBorder(thickBorder2);
		b7.setBackground(new Color(88,111,124));
		b7.setForeground(Color.white);
		b7.setFont(new Font("Yu Gothic UI", Font.BOLD,30));
		b7.addActionListener(this);
		//setting the properties of the button 8
		b8.setBorder(thickBorder2);
		b8.setBackground(new Color(88,111,124));
		b8.setForeground(Color.white);
		b8.setFont(new Font("Yu Gothic UI", Font.BOLD,30));
		b8.addActionListener(this);
		//setting the properties of the main heading
		h1.setFont(new Font("Yu Gothic UI", Font.BOLD,40));
		h1.setForeground(Color.white);
		//setup the main panel
		p1.setLayout(new GridLayout(5,1));
		p1.add(p2);
		p1.add(p3);
		p1.add(p4);
		p1.add(p5);
		p1.add(p6);
		//setting the second panel
		p2.add(h1);
		p2.setBackground(new Color(15,82,87));
		p2.setBorder(Border);
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		//setting the panel 3
		p3.setBackground(new Color(218,227,229));
		p3.setLayout(new GridLayout());
		p3.add(b1);
		p3.setBorder(BorderFactory.createEmptyBorder(10,30,2,30));
		//setting the panel 34
		p4.setLayout(new GridLayout(1,1));
		p4.add(b2);
		p4.setBorder(BorderFactory.createEmptyBorder(5,30,5,30));
		p4.setBackground(new Color(218,227,229));
		//setting the panel 5
		p5.setBackground(new Color(218,227,229));
		//setting the panel 6
		p6.setLayout(new GridLayout(1,3));
		p6.setBackground(new Color(15,82,87));
		p6.add(b6);
		p6.add(b7);
		p6.add(b8);
		//setup the frame and adding the main panel
		this.getContentPane().setLayout(new CardLayout());
		this.getContentPane().add(p1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//setup the back button
		if(e.getSource()==b8)
		{
			this.dispose();
			front_frame ff=new front_frame();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			ff.setIconImage(image.getImage());
			ff.setSize(600, 550);
			ff.setTitle("E-Ticketing");
			ff.setVisible(true);
			ff.setLocation(200, 100);
			ff.setResizable(false);
		
		}
		//setup the view employee button
		if(e.getSource()==b2)
		{
			
			view_Employee ve=new view_Employee();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			ve.setIconImage(image.getImage());
			ve.setSize(600, 550);
			ve.setTitle("E-Ticketing");
			ve.setVisible(true);
			ve.setLocation(200, 100);
			ve.setResizable(false);
		}
		//setup the faq button
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
		//setup the schedule button
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
		//setup the update schedule button
		if(e.getSource()==b1)
		{
			
			update_Schedule us=new update_Schedule();
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			us.setIconImage(image.getImage());
			us.setSize(600, 550);
			us.setTitle("E-Ticketing");
			us.setVisible(true);
			us.setLocation(200, 100);
			us.setResizable(false);
		
		}
		
	}

}
