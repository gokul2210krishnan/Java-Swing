package _pack;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

/*
<applet coode="register" width="1000" height="1000">
</applet>
*/


public class register extends JApplet
{
	JButton jb1;
	JLabel jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,jl11,jl12,jl13,jl14,x,y,z,x1,y1;
	JTextField jt1,jt2,jt3,jt4,jt5,jt6;
	JRadioButton jr1,jr2,jr3,jr4,jcb1,jcb2,jcb3;
	JList jlist1,jlist2,jlist3,jlist4,jlist5,jlist6,jlist7,jlist8,jlist9,jlist10;
	
	public void register1()
	{
		//setStatus("..registration form..");
		setLayout(new GridLayout(16,2));
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
		jr1.setActionCommand(jr1.getText());
		jr2=new JRadioButton("no");
		jr2.setActionCommand(jr2.getText());
		ButtonGroup bg1 =new ButtonGroup();
		bg1.add(jr1);
		bg1.add(jr2);
		jr3=new JRadioButton("normal");
		jr3.setActionCommand(jr3.getText());
		jr4=new JRadioButton("Tatkaal");
		jr4.setActionCommand(jr4.getText());
		ButtonGroup bg2 =new ButtonGroup();
		bg2.add(jr3);
		bg2.add(jr4);
		jcb1=new JRadioButton("Minor");
		jcb1.setActionCommand(jcb1.getText());
		jcb2=new JRadioButton("adult");
		jcb2.setActionCommand(jcb2.getText());
		jcb3=new JRadioButton("senior");
		jcb3.setActionCommand(jcb3.getText());
		ButtonGroup bg3 =new ButtonGroup();
		bg3.add(jcb1);
		bg3.add(jcb2);
		bg3.add(jcb3);
		jb1=new JButton("submit");
		//public void actionPerformed(ActionEvent ae)
		{
			//String x=(String)ae.setText(ae.getActionCommand());
		}
		jb1.addActionListener(
				new ActionListener()
				{
					
					public void actionPerformed(ActionEvent ae)
					{
						String rad1=null,rad2=null,rad3=null;
						Connection con=null;
						Statement s=null;
						PreparedStatement p=null;
					try
					{
						Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					}
					catch(ClassNotFoundException ce)
					{
						System.out.println("...error in registering driver..");
					}
					try
					{
						//String Url="C:/User/gokul/workspace/airline1.accdb";
						//String DbUrl="jdbc.ucanaccess://"+Url;
						//System.out.println(".........");
						//con=DriverManager.getConnection(DbUrl);
						String msAccDB = "C:/Users/gokul/workspace/airline1.accdb";
			            String bURL = "jdbc:ucanaccess://" + msAccDB;
			            System.out.println("...!!!...");
			         // Step 2.A: Create and get connection using DriverManager class
			            con = DriverManager.getConnection(bURL); 
			            System.out.println("...!!!...");
						if(jr1.isSelected())
						{
							rad1 =jr1.getActionCommand();
						}
						else
						if(jr2.isSelected())
						{
							rad1 =jr2.getActionCommand();
						}
						else
						if(jr3.isSelected())
						{
							rad2 =jr2.getActionCommand();
						}
						else
						if(jr4.isSelected())
						{
							rad2 =jr2.getActionCommand();
						}
						else
							if(jcb1.isSelected())
							{
								rad3 =jcb1.getActionCommand();
							}	
							else
								if(jcb2.isSelected())
								{
									rad3 =jcb2.getActionCommand();
								}
								else
									if(jcb3.isSelected())
									{
										rad3 =jcb3.getActionCommand();
									}
						System.out.println(".........");
						//String sql="insert into customer values('"+jt1.getText()+"','"+jt2.getText()+"','"+rad1+"','"+rad2+"','"+rad3+"','"+jt3.getText()+"','"+jt4.getText()+"')";
						//s =con.createStatement();
						int val=Integer.parseInt(jt3.getText());
						p=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?)");
						p.setInt(1,1);
						p.setString(2,jt1.getText());
						p.setString(3,jt2.getText());
						p.setString(4,rad1);
						p.setString(5,rad2);
						p.setString(6, rad2);
						p.setInt(7,val);
						p.setString(8,jt4.getText());
						p.executeUpdate();
						System.out.println(".........");
						//s.executeUpdate(sql);
						System.out.println("succesfully inserted..");
					}
					catch(SQLException se)
					{
						System.out.println("..error in jdbc..");
					}
					finally
					{
						try{
					         if(s!=null)
					            s.close();
					      }catch(SQLException se2){
					      }// nothing we can do
					      try{
					         if(con!=null)
					            con.close();
					      }catch(SQLException se){
					         se.printStackTrace();
					      }
					}
					}
				});
		
		
		
		add(jl1 = new JLabel("Name                          :"));
		add(jt1);
		add(jl2 = new JLabel("Address                       :"));
		add(jt2);
		add(jl3 = new JLabel("Mode of transport             :"));
		add(jr3);
		add(x);
		add(jr4);
		add(jl4 = new JLabel("is applicant ECR eligible     :"));
		add(jr1);
		add(y);
		add(jr2);
		add(jl5 = new JLabel("Applicant category            :"));
		add(jcb1);
		add(x1);
		add(jcb2);
		add(z);
		add(jcb3);
		add(jl6 = new JLabel("Contact                       :"));
		add(jt3);
		add(jl7 = new JLabel("mail-id                       :"));
		add(jt4);
		add(y1);
		add(jb1);
		
		
		
	}
	public void init()
	{
		try{
			SwingUtilities.invokeLater(
					new Runnable()
					{
						public void run()
						{
							register1();
						}
					});
			}
			catch(Exception e)
			{
				System.out.println("error occured..");
			}
	}
}

