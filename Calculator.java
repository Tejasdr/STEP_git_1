// To create a calculatorr
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator /*implements ActionListener */{
	
	JFrame f ;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,btemp;
	JButton b_ce,b_dot,b_add,b_sub,b_div,b_mul,b_percent;
	JTextArea ta;
	
	Calculator(){
			
		f = new JFrame("Calculator");
		
		ta = new JTextArea("This is my text area");
		ta.setBounds(50,50,400,100);
		
		b0 = new JButton("0");
		//b0.setBounds(50,230,100,80);
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b4.setBounds(50,310,100,80);
		b5 = new JButton("5");
		b5.setBounds(150,310,100,80);
		b6 = new JButton("6");
		b6.setBounds(250,310,100,80);
		b7 = new JButton("7");
		b7.setBounds(50,230,100,80);
		b8 = new JButton("8");
		b8.setBounds(150,230,100,80);
		b9 = new JButton("9");
		b9.setBounds(250,230,100,80);
		
		b_ce = new JButton("CE");
		b_ce.setBounds(50,150,200,80);
		b_dot = new JButton(".");
		b_add = new JButton("+");
		b_sub = new JButton("-");
		b_div = new JButton("/");
		b_mul = new JButton("x");
		b_percent = new JButton("%");
		b_percent.setBounds(250,150,200,80);
		
		btemp = new JButton("");
		// Setting the jframe's size 
		f.add(ta);
		f.add(b_ce);
		f.add(b_percent);
		f.add(b4);
		f.add(b5);
		f.add(b6);;
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(btemp);
		
		f.setSize(500,500);
		f.setVisible(true);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Setting bounds for the Buttons 
	}
	
	public static void main(String args[]){
		
		new Calculator();
	}
	
	
	
}		