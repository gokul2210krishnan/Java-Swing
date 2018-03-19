package _pack;


import javax.swing.*;
import java.sql.*;
import java.awt.*;

public class ac1
{
	JLabel jl1;
	JMenuBar jmb;
	JMenu jhome,jabout,jbook;
	JFrame jf;
	ac1()
	{
		jf=new JFrame("account page..!!");
		jf.setVisible(true);
		jf.setSize(500,500);
		jf.pack();
	}
	public static void main(String args[])
	{
		new ac1();
	}
	
}
