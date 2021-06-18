import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class booked_tickets extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	booked_tickets()
	{
		initialize();
	}

	Border thickBorder = new LineBorder(new Color(218,227,229), 6);//creating border for buttons
	Border Border = new LineBorder(new Color(15,82,87), 10);//creating border title 
	//creating panels
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	//creating tabel to store data
	DefaultTableModel model = new DefaultTableModel();
	JTable table=new JTable(model);
	JScrollPane scrollpane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	//creating main label
	JLabel label6=new JLabel("E-TICKETING");
	public void initialize() {
		//setting the properties of main label
		label6.setFont(new Font("Yu Gothic UI", Font.BOLD,18));
		label6.setFont(new Font("Yu Gothic UI", Font.BOLD,45));
		label6.setForeground(Color.white);
		//setting the front panel
		p3.setLayout(new BorderLayout());
		p3.add(p2,BorderLayout.NORTH);
		p3.add(p1,BorderLayout.CENTER);
		//setting the panel no 2
		p2.add(label6);
		p2.setBackground(new Color(15,82,87));
		p2.setBorder(Border);
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		//setting the panel no 1
		p1.setLayout(new GridLayout());
		p1.setBackground(Color.BLUE);
		p1.setBorder(BorderFactory.createEmptyBorder(1,0,1,0));
		//creating columns in table
		model.addColumn("Ticket ID");
		model.addColumn("Name");
		model.addColumn("Phone");
		model.addColumn("From");
		model.addColumn("To");
		model.addColumn("Service");
		model.addColumn("Seats");
		model.addColumn("Date");
		model.addColumn("Time");
		
		try 
		   {
			//making connection to DB
			   Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eTicketing","root","10965252");
				Statement stmt=con.createStatement();
				//Preparing statement
				String query=" Select * from tickets ";
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next())
				{
					//storing the data from DB to variables
					String id=rs.getString("ticketId");
					String name=rs.getString("Name_");
					String phone=rs.getString("phone");
					String from=rs.getString("FromLocation");
					String toloc=rs.getString("ToLocation");
					String serv=rs.getString("Services");
					String seat1=rs.getString("seats");
					String date=rs.getString("date_");
					String time=rs.getString("time_");
					//adding data to row
					Object[] row=null;
					String string=id+","+name+","+phone+","+from+","+toloc+","+serv+","+seat1+","+date+","+time;
					row=string.split(",");
					//adding row to table
					model.addRow(row);
					p1.add(scrollpane);
				}
		   }
		catch(Exception z)
		   {	
				System.out.print(z);
		   }
		//adding component to frame
		this.getContentPane().setLayout(new CardLayout());
		this.getContentPane().add(p3);
	}
	
}
