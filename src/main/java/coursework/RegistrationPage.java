package coursework;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JPanel;
import javax.swing.*;

public class RegistrationPage implements ActionListener{

	
	 Button b;
	Label lblTitle;
	Font titleFont;
	TextField t,t1,t2,t3,t4,t5,t6;
	private String INSERT_;
	RegistrationPage(){
		
		
		
		Frame f=new Frame();
		f.setSize(800, 500);
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		 
		//f.setForeground(Color.green);
		f.setBackground(Color.CYAN);
		
		lblTitle=new Label("***RAGISTRATION FORM***");
		lblTitle.setBounds(300,40,300,50);
		lblTitle.setFont(new Font("verdana",Font.BOLD,16));
		lblTitle.setForeground(Color.BLUE);
		f.add(lblTitle);
		
		
		
		Label l=new Label("First Name:");
		 t=new TextField();
		l.setBounds(100, 90, 100, 50);
		t.setBounds(200, 100, 150, 30);
		l.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l);
		f.add(t);
		
		
		Label l1=new Label("Last Name:");
		 t1=new TextField();		
		l1.setBounds(400, 70, 100, 80);		
		t1.setBounds(500, 90, 150, 30);
		l1.setFont(new Font("verdana",Font.BOLD,14));
		f.add(t1);	
		f.add(l1);
		
		Label l2=new Label("Mobile No:");
		 t2=new TextField();
		l2.setBounds(100, 140, 100, 50);
		t2.setBounds(200, 150, 150, 30);
		l2.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l2);
		f.add(t2);
		
		Label l3=new Label("Password:");
		 t3=new TextField();
		l3.setBounds(400, 140, 100, 50);
		t3.setBounds(500, 150, 150, 30);
		l3.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l3);
		f.add(t3);
		
		Label l4=new Label("Email:");
		 t4=new TextField();
		l4.setBounds(100, 200, 100, 50);
		t4.setBounds(200, 210, 450, 30);
		l4.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l4);
		f.add(t4);
		
		Label L5=new Label("Address:");
		 t5=new TextField();
		L5.setBounds(100, 270, 100, 50);
		t5.setBounds(200, 280, 450, 30);
		L5.setFont(new Font("verdana",Font.BOLD,14));
		f.add(L5);
		f.add(t5);
		
		f.setForeground(Color.BLACK);
	    b=new Button("Register"); 
		 b.setBounds(140, 400, 150, 30); 
		 b.setFont(new Font("verdana",Font.BOLD,14));
		 //action listener......
		 b.addActionListener(this);
		  f.add(b);
		  b.setBackground(Color.LIGHT_GRAY);
		  
		  Button b1=new Button("Cancel");
		  b1.setBounds(450, 400, 130, 30);
		  b1.setFont(new Font("verdana",Font.BOLD,14));
		  //action listener......
		  b1.addActionListener(this);
		  f.add(b1);
		  b1.setBackground(Color.LIGHT_GRAY);
		
	
   
}
	    


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource()==b)
		 {
			 	
			 	String fname=t.getText();
			 	String lname=t1.getText();
			 	String mob=t2.getText();
			 	String password=t3.getText();
			 	String email=t4.getText();
			 	String Address=t5.getText();
			 	
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/logindata","root","1234");
					
					System.out.println("Inserting Record....");
					String sql="INSERT INTO  customer(fname,lname,mob,password,email,Address) VALUES(?,?,?,?,?,?)";
					
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1,fname );
					ps.setString(2, lname);
					ps.setString(3, mob);
					ps.setString(4, password);
					ps.setString(5, email);
					ps.setString(6, Address);
					
					//ps.executeUpdate(INSERT_);
					//ps.executeUpdate(sql);
					 int rowsInserted = ps.executeUpdate();
					 System.out.println("record inserted");
					 		 if (e.getSource() == b)
					 		 { 
						 JOptionPane.showMessageDialog(null, "Register...!");
						 CarAccesseries n=new CarAccesseries();
						 n.setVisible(true);
								 
					 		 }
					 		 else {
					 			 System.out.println("not submited...!");
					 		 }
				}
				catch(Exception e1)
				{
				e1.printStackTrace();	
				}
		 }
		 
		 
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistrationPage ragistration=new RegistrationPage();
		
	}



	public void setvisible() {
		// TODO Auto-generated method stub
		
	}



	public void setVisible(boolean c) {
		// TODO Auto-generated method stub
		
	}
		
	
	}


