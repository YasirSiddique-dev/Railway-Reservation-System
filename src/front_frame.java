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

public class front_frame extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;




	front_frame()
	{
		initialize();
	}
	//front panel
	Border thickBorder = new LineBorder(new Color(218,227,229), 6);
	
	Border Border = new LineBorder(new Color(15,82,87), 10);
	
	JLabel h1=new JLabel("E-TICKETING");
	
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();
	JPanel p6=new JPanel();
	JPanel p7=new JPanel();
	
	
	JButton b1=new JButton("Admin Panel");
	JButton b2=new JButton("Employee Panel");
	
	
	
	
	public void initialize() {
		
		b1.setBorder(thickBorder);
		b1.setBackground(new Color(68,124,142));
		b1.setForeground(Color.white);
		b1.setFont(new Font("Yu Gothic UI", Font.BOLD,40));
		b1.addActionListener(this);
		
		b2.setBorder(thickBorder);	
		b2.setBackground(new Color(68,124,142));
		b2.setForeground(Color.white);
		b2.setFont(new Font("Yu Gothic UI", Font.BOLD,40));
		b2.addActionListener(this);
	
		h1.setFont(new Font("Yu Gothic UI", Font.BOLD,45));
		h1.setForeground(Color.white);
		
		
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
		p4.setLayout(new GridLayout());
		p4.add(b1);
		p4.setBorder(BorderFactory.createEmptyBorder(1,40,1,40));
		
		
		p5.setLayout(new GridLayout(1,2));
		p5.add(b2);
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
		
		
		if(e.getSource()==b2)
		{
			this.dispose();
			
			employee_login el=new employee_login();
			el.setSize(600, 550);
			ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");
			el.setIconImage(image.getImage());
			el.setTitle("E-Ticketing");
			el.setVisible(true);
			el.setLocation(200, 100);
			el.setResizable(false);
			
		}
		
	}

}
