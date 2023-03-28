package coursework;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

import org.w3c.dom.UserDataHandler;
public class Loginpage extends Frame implements ActionListener
{
	
	static Label user;
	 static Label pass;
	 Label lblTitle;
	 Font titleFont;
	 private Label textField;
	 private Label passwordField;
	 public Button b ,b1;
	 TextField t ,t1;
	 JButton loginbt;
	
	
	Loginpage(){
		
		
	Frame f=new Frame();
	
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent e)
			{
				System.exit(0);
			}
		});
		//f.setForeground(Color.green);
		
		lblTitle=new Label("***LOGIN FORM***");
		lblTitle.setBounds(180,40,300,50);
		lblTitle.setFont(new Font("verdana",Font.BOLD,16));
		lblTitle.setForeground(Color.BLUE);
		f.add(lblTitle);
		f.setBackground(Color.CYAN);
		
		
		Label l=new Label("USERNAME:");
		JTextField t=new JTextField();
		l.setBounds(100, 90, 100, 50);
		t.setBounds(200, 100, 200, 30);
		l.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l);
		f.add(t);
		
		
		Label l1=new Label("PASSWORD:");
		JTextField t1=new JTextField();		
		l1.setBounds(100, 130, 100, 80);		
		t1.setBounds(200, 150, 200, 30);	
		l1.setFont(new Font("verdana",Font.BOLD,14));
		f.add(t1);	
		f.add(l1);
		
		
		f.setSize(600, 500);
		//f.setTitle("Login form");		
		f.setLayout(null);
		f.setVisible(true);
		//f.setForeground(Color.GREEN);
		
		
		
		Label Note1=new Label("Only admin can login...");
		Label Note2=new Label("New user Register please...");
		Note1.setBounds(50, 320, 200, 50);
		Note1.setForeground(Color.blue);
		Note2.setForeground(Color.blue);
		Note1.setFont(new Font("verdana",Font.BOLD,14));
		Note2.setBounds(50, 350, 200, 50);
		Note2.setFont(new Font("verdana",Font.BOLD,14));
	
		f.add(Note1);
		f.add(Note2);
		
		
		
		  b=new Button("Register");
		  b.setBounds(100, 270, 150, 30); 
		  b.setFont(new Font("verdana",Font.BOLD,14)); add(b);
		 f.add(b);
		 b.setBackground(Color.LIGHT_GRAY); 
		 
		 b.addActionListener(this);
		 setVisible(true);
		 
			 
		 
		b1=new Button("login");
		b1.setBounds(300, 270, 130, 30);
		b1.setFont(new Font("verdana",Font.BOLD,14));
		f.add(b1);
		b1.setBackground(Color.LIGHT_GRAY);
	    b1.addActionListener(this);
		b1.addActionListener(this);
		b1.setVisible(true);
		  
		  
		   
	       setVisible(true);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e)
	    {
				
				 if (e.getSource() == b1)
				 	//if(t.contains(admin)&& t1.contains(password))
				 { 
					// JOptionPane.showMessageDialog(null, "Register...!");
					 CarAccesseries n=new CarAccesseries();
					 n.setVisible(true);
					
				 }
				 		
				 else {
				 			 System.out.println("not submited...!");
				 		
				 }
			
	    	if(e.getSource()==b)
	    	{
	    		
	    		RegistrationPage r= new RegistrationPage();
	    		r.setvisible();
	    		//JOptionPane.showMessageDialog(null, "Login Sucessfull...!");
	    	}
	    	 else {
	 			 System.out.println("not submited...!");
	 		
	    	 }
		 }
	    	
	    
		 
	 public static void main(String[] args)
	 {
					Loginpage obj=new Loginpage();
		
	 }
}
		
		