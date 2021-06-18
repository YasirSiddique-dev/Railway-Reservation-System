import javax.swing.ImageIcon;

public class driver{
	

	public static void main(String[] args) {
				

		front_frame f=new front_frame();
		f.setSize(600, 550);// setting the size of the frame
		f.setTitle("E-Ticketing");// setting the title of the frame
		f.setLocation(200, 100);//setting the location of the frame
		ImageIcon image = new ImageIcon("E:\\Java\\final project\\train.png");  //parsing the icon for frame
		f.setIconImage(image.getImage()); //setting the icon of the frame
		f.setVisible(true);//setting the visibility of the frame
		f.setResizable(false);
	}	

}
