import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class view_Employee extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	view_Employee()
	{
		initialize();
	}
	//front panel
	Border thickBorder = new LineBorder(new Color(218,227,229), 6);
	Border Border = new LineBorder(new Color(15,82,87), 10);
	

	
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();
	
	DefaultTableModel model = new DefaultTableModel();
	JTable table=new JTable(model);
	
	
	JScrollPane scrollpane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	JLabel label6=new JLabel("E-TICKETING");
	public void initialize() {
		
		
		label6.setFont(new Font("Yu Gothic UI", Font.BOLD,18));
		
		label6.setFont(new Font("Yu Gothic UI", Font.BOLD,45));
		label6.setForeground(Color.white);
		
		p3.setLayout(new BorderLayout());
		p3.add(p2,BorderLayout.NORTH);
		p3.add(p1,BorderLayout.CENTER);
		
		
		
		p2.add(label6);
		p2.setBackground(new Color(15,82,87));
		p2.setBorder(Border);
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		p1.setLayout(new GridLayout());
		p1.setBackground(Color.BLUE);
		p1.setBorder(BorderFactory.createEmptyBorder(1,0,1,0));

		model.addColumn("Full Name");
		model.addColumn("Username Name");
		model.addColumn("Age");
		model.addColumn("Phone");
		
		try 
		   {
			   Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eTicketing","root","10965252");
				
				Statement stmt=con.createStatement();
				String query=" Select * from employee ";
				ResultSet rs=stmt.executeQuery(query);
				while(rs.next())
				{
				
				
					String name=rs.getString("fullName");
					String user=rs.getString("UserName");
					String age=rs.getString("age");
					String phone=rs.getString("phone");
			
					
					Object[] row=null;
					String string=name+","+user+","+age+","+phone;
					row=string.split(",");
					
					model.addRow(row);
					
					p1.add(scrollpane);
				
				}
				con.close();
			   
		   }
		catch(Exception z)
		   {	
				System.out.print(z);
		   }
		
		
		
	
		
		
		
		
		this.getContentPane().setLayout(new CardLayout());
		
		this.getContentPane().add(p3);
		
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		

	}

}
