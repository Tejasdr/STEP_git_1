// This is Swing GUI >TUT
import javax.swing.*;
import java.awt.event.*;

public class GUI_1 implements ActionListener{

JLabel label = new JLabel();

	GUI_1(){
		JFrame f = new JFrame("This is MY JFRAME");
		JButton b = new JButton("Click ME");
		
		
		label.setBounds(50,100,100,30);
		b.setBounds(50,50,100,30);
		f.add(b);
		f.add(label);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e){
					
				label.setText("U have clicked me");
			
	}
	
	public static void main(String args[]){
			new GUI_1();
			
	}
}


	

