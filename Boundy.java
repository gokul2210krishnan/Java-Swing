package _pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Boundy {

	JFrame f;
	JLabel l1,l2;
	JTextField tf1,tf2;
	JButton b1,b2;
	Boundy()
	{
		f=new JFrame("bound usage..!!");
		l1=new JLabel("Id ");
		l2=new JLabel("Password");
		tf1=new JTextField(20);
		tf2=new JTextField(20);
		b1=new JButton("Signup");
		b2=new JButton("Login ");
		l1.setBounds(125,200,100,30);
		l2.setBounds(125,240,100,30);
		tf1.setBounds(230,200,100,30);
		tf2.setBounds(230,240,100,30);
		b1.setBounds(125,280,100,30);
		b2.setBounds(230,280,100,30);
		f.setLayout(null);
		f.add(l1);
		f.add(tf1);
		f.add(l2);
		f.add(tf2);
		f.add(b1);
		f.add(b2);
		f.setSize(500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new Boundy();
	}
}
