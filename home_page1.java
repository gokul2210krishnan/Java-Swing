package _pack;
import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class home_page1
{

	JFrame f1;
	JButton jb1;
	JPanel p1,p2,p3;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,x,y,z,x1,y1;
	JTextField jt1,jt2,jt3,jt4,jt5,jt6;
	JRadioButton jr1,jr2,jr3,jr4;
	JCheckBox jcb1,jcb2,jcb3,jcb4;
	JTabbedPane jtp1;
	JList jlist1,jlist2,jlist3,jlist4,jlist5,jlist6,jlist7,jlist8,jlist9,jlist10;
	
	home_page1()
	{
		
		f1=new JFrame("airline registration");
		p1=new JPanel();
		p1.setLayout(new GridLayout(16,2));
		p2=new JPanel();
		p2.setLayout(new GridLayout(13,1));
		p3=new JPanel();
		p3.setLayout(new GridLayout(1,1));
		jtp1=new JTabbedPane();
		jtp1.setBounds(5,5,400,400);
		jl1=new JLabel();
		jl2=new JLabel();
		jl3=new JLabel();
		jl4=new JLabel();
		jl5=new JLabel();
		jl6=new JLabel();
		jl7=new JLabel();
		jl8=new JLabel();
		jl9=new JLabel();
		jl10=new JLabel();
		jl11=new JLabel();
		jl12=new JLabel();
		jl13=new JLabel();
		jl14=new JLabel();
		x=new JLabel();
		y=new JLabel();
		z=new JLabel();
		x1=new JLabel();
		y1=new JLabel();
		
		jt1=new JTextField(5);
		jt2=new JTextField(5);
		jt3=new JTextField(5);
		jt4=new JTextField(5);
		jt5=new JTextField(5);
		jt6=new JTextField(5);
		
		jr1=new JRadioButton("yes");
		jr2=new JRadioButton("no");
		ButtonGroup bg1 =new ButtonGroup();
		bg1.add(jr1);
		bg1.add(jr2);
		jr3=new JRadioButton("normal");
		jr4=new JRadioButton("Tatkaal");
		ButtonGroup bg2 =new ButtonGroup();
		bg2.add(jr3);
		bg2.add(jr4);
		jcb1=new JCheckBox("Minor");
		jcb2=new JCheckBox("adult");
		jcb3=new JCheckBox("senior");
		jb1=new JButton("submit");
		//jb1.addActionListener(this);
		//public void actionPerformed(ActionEvent ae)
		//{
			//System.out.println("....");
		//}
		
		
		 
		f1.setSize(400,400);
		f1.setLayout(new GridLayout(1,3));
		p1.add(jl1 = new JLabel("Name                         :"));
		p1.add(jt1);
		p1.add(jl2 = new JLabel("Address                      :"));
		p1.add(jt2);
		p1.add(jl3 = new JLabel("Mode of transport            :"));
		p1.add(jr3);
		p1.add(x);
		p1.add(jr4);
		p1.add(jl4 = new JLabel("is applicant ECR eligible    :"));
		p1.add(jr1);
		p1.add(y);
		p1.add(jr2);
		p1.add(jl5 = new JLabel("Applicant category           :"));
		p1.add(jcb1);
		p1.add(x1);
		p1.add(jcb2);
		p1.add(z);
		p1.add(jcb3);
		p1.add(jl6 = new JLabel("Contact                    :"));
		p1.add(jt3);
		p1.add(jl7 = new JLabel("mail-id                    :"));
		p1.add(jt4);
		p1.add(y1);
		p1.add(jb1);
		
		
		
		jtp1.add("Personal info",p1);
		jtp1.add("Acknowledgment",p2);
		jtp1.add("About",p3);
		f1.add(jtp1);
		
		//f1.setDefaultClosingOperation(JFrame.EXIT_ON_CLOSE);
		f1.pack();
		f1.setVisible(true);
		System.out.println("action performed");
		
	}
	public static void main(String args[])
	{
		new home_page1();
	}
}
