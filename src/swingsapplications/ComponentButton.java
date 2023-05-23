package swingsapplications;

import javax.swing.JButton;

import javax.swing.JFrame;
import java.awt.FlowLayout;

class MyFrame extends JFrame{
	MyFrame(){
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		JButton b=new JButton("Click Me");
		this.add(b);
	}
	
}

public class ComponentButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame=new MyFrame();
		frame.setVisible(true);
		

	}

}
