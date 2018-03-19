package _pack;

import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import _pack.register;

/*<applet code="Login1" width="500" height="500">
</applet>
*/
 
public class Login1 extends JApplet
{
	JButton lb1,lb2;
	  JTextField ltf1;
	  JTextField ltf2;
	  JLabel ll1,ll2;
	  String name;
  public void login1()
  {  
	  
	  lb1= new JButton("sign up");
	  lb2= new JButton("login");
	  ltf1= new JTextField(25);
	  ltf2= new JTextField(25);
	  ll1= new JLabel("User ID  :");
	  ll2= new JLabel("Password :");
	  lb1.addActionListener(
		 new ActionListener()
		 {
			 public void actionPerformed(ActionEvent ae)
			 {
				 System.out.println("...!!!....");
				 new register1();
			 }
		 });

	  lb2.addActionListener(
		  new ActionListener()
		  {
			  public void actionPerformed(ActionEvent ae)
			  {
				  System.out.println(ltf1.getText());
				  String i,x;
				  x=ltf1.getText();
				  String i1,y;
				  y=ltf2.getText();
				  System.out.println(x);
				  System.out.println("signing into our website..!!");
				  Connection connection = null;
				  Statement statement = null;
				  ResultSet resultSet = null;
				  ResultSet resultSet1=null;
						try
						{
							Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
						}
						catch(ClassNotFoundException ce)
						{
							System.out.println("problem in loading");
						}
						try
						{
							String msAccDB = "C:/Users/gokul/workspace/airline1.accdb";
				            String bURL = "jdbc:ucanaccess://" + msAccDB;
				            System.out.println("...!!!...");
				         // Step 2.A: Create and get connection using DriverManager class
				            connection = DriverManager.getConnection(bURL); 
				            System.out.println("...!!!...");				 
				            // Step 2.B: Creating JDBC Statement 
				            statement = connection.createStatement();
				            System.out.println("...u can create statement...");

				            //connection = DriverManager.getConnection(dbURL);
				            System.out.println("...!!!...");
				            //statement = connection.createStatement();
				            
				            resultSet = statement.executeQuery("SELECT Name FROM customer");
				            resultSet1 = statement.executeQuery("SELECT pass FROM customer");
				            int check=0;
				            while(resultSet.next()&&resultSet1.next()) 
				            {
				            	System.out.println("...!!!...");
				            	
				            i=resultSet.getString(1);
				            i1=resultSet1.getString(1);
				            
			            	if(i.equals(x) && i1.equals(y))
			            	{
			            		new ac1();
			            		check=1;
			            	}
				            }
				            if(check==0)
			            	{
			            		System.out.println("login error..");
			            	}
						}
						catch(SQLException se)
						{
							System.out.println("sql exception found..!!");
						}
						finally
						{
							try{
						         if(statement!=null)
						            statement.close();
						      }catch(SQLException se2){
						      }// nothing we can do
						      try{
						         if(connection!=null)
						            connection.close();
						      }catch(SQLException se){
						         se.printStackTrace();
						      }
						}

				  }
			  });
	  ll1.setBounds(125,200,100,30);
		ll2.setBounds(125,240,100,30);
		ltf1.setBounds(230,200,100,30);
		ltf2.setBounds(230,240,100,30);
		lb1.setBounds(125,280,100,30);
		lb2.setBounds(230,280,100,30);
	  setLayout(null);
	  add(ll1);
	  add(ltf1);
	  add(ll2);
	  add(ltf2);
	  add(lb1);
	  add(lb2);
	  setVisible(true);
  }
  public void init()
  {
   SwingUtilities.invokeLater(
		   new Runnable()
		   {
			   public void run()
			   {
				   login1();
			   }
		   }
		   );
  }
}