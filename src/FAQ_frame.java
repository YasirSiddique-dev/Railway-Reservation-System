import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class FAQ_frame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	FAQ_frame()
	{
		initialize();
	}

		Border Border = new LineBorder(new Color(15,82,87), 10);
	
	
	
	JLabel h1=new JLabel("E-TICKETING");
	
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	JPanel p4=new JPanel();
	JPanel p5=new JPanel();
	JPanel p6=new JPanel();
	JPanel p7=new JPanel();
	
	JLabel label1=new JLabel();
	JLabel label2=new JLabel();
	JLabel label3=new JLabel();
	public void initialize() {
		
		
		
		
	
		h1.setFont(new Font("Yu Gothic UI", Font.BOLD,45));
		h1.setForeground(Color.white);
		
		String text="<html><p></br><br><strong>Who We Are?</strong><br>We provide an important mode of transportation in farthest corner of"
				+ " Pakistan. We are truly dedicated to make our service as simple and unique. </p></html>";
		label1.setText(text);
		
		
		label1.setFont(new Font("Yu Gothic UI", Font.PLAIN,16));
		
		String text2="<html><p>Now with this app you can easily book a railway tickets with ease."
				+ "<br><strong>What we do?</strong><br>This Application is used for E-ticketing service of the railway. "
				+ "Which provide the whole detail and service regarding railway system. This app provides the </p></html>";
		label2.setText(text2);
		label2.setFont(new Font("Yu Gothic UI", Font.PLAIN,16));
		
		String text3="<html><p>timings and route of trains to ensure the reliability to the customer. "
				+ "This includes sign up section to provide verified registration of "
				+ "e-ticketing. With this application, you can easily find already reserved "
				+ "seats to avoid any kind of contradiction.</p></html>";
		label3.setText(text3);
		label3.setFont(new Font("Yu Gothic UI", Font.PLAIN,16));
		
		
		
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

		p3.setLayout(new GridLayout());
		p3.setBackground(new Color(218,227,229));
		p3.setBorder(BorderFactory.createEmptyBorder(1,20,1,20));
		p3.setBackground(Color.white);
		
		p3.add(label1);
		
		
		p4.setBackground(new Color(218,227,229));
		p4.setLayout(new GridLayout());
		p4.setBorder(BorderFactory.createEmptyBorder(1,20,1,20));
		p4.setBackground(Color.white);
		p4.add(label2);
		
		p5.setBackground(new Color(218,227,229));
		p5.setLayout(new GridLayout());
		p5.setBackground(new Color(218,227,229));
		p5.setBorder(BorderFactory.createEmptyBorder(1,20,1,20));
		p5.setBackground(Color.white);
		p5.add(label3);
		
		p6.setBackground(new Color(218,227,229));
		p6.setBackground(Color.white);
		p7.setBackground(new Color(218,227,229));
		p7.setBackground(Color.white);
		

		
		
		this.getContentPane().setLayout(new CardLayout());
		this.getContentPane().add(p1);
	}



}
