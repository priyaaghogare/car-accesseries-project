package coursework;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AccountDetail implements ActionListener {

	
	
 Label lblTitle;
 Button btn;

AccountDetail(){
		
		JTextArea res;
		
		Frame f=new Frame();
		f.setSize(500, 350);
		f.setLayout(null);
		f.setVisible(true);
		
		//f.setForeground(Color.green);
		f.setBackground(Color.CYAN);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		 res = new JTextArea("");
		
		lblTitle=new Label("Account detail");
		lblTitle.setBounds(150,40,200,50);
		lblTitle.setFont(new Font("verdana",Font.BOLD,16));
		lblTitle.setForeground(Color.BLUE);
		f.add(lblTitle);
		
		
		
		Label l=new Label("Account no:");
		TextField t=new TextField();
		l.setBounds(100, 90, 100, 50);
		t.setBounds(210, 100, 170, 30);
		l.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l);
		f.add(t);
		
		
		Label l2=new Label("Card no:");
		TextField t2=new TextField();
		l2.setBounds(100, 140, 100, 50);
		t2.setBounds(210, 150, 170, 30);
		l2.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l2);
		f.add(t2);
		
		
		Label l3=new Label("Cvv:");
		TextField t3=new TextField();
		l3.setBounds(100, 180, 100, 50);
		t3.setBounds(210, 200, 170, 30);
		l3.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l3);
		f.add(t3);
		
		/*
		 * Label l4=new Label("Cvv:"); TextField t4=new TextField(); l4.setBounds(100,
		 * 180, 100, 50); t4.setBounds(210, 200, 170, 30); l4.setFont(new
		 * Font("verdana",Font.BOLD,14)); f.add(l4); f.add(t4);
		 */
		
		
		 btn=new Button("Add");
		  btn.setBounds(100, 270, 150, 30); 
		  btn.setFont(new Font("verdana",Font.BOLD,14));
		  f.add(btn);
		 f.add(btn);
		 btn.setBackground(Color.LIGHT_GRAY); 
		 
		 btn.addActionListener(this);
		 btn.setVisible(true);

		 
	        btn.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt)
	            {
	           // JOptionPane.showMessageDialog(null, "Added...!");
	              
	              
	              
	              if(evt.getSource()==btn)
	     		 {
	     			 	
	     			 	String Ac_no=t.getText();
	     			 	String Cd_no=t2.getText();
	     			 	String cvv=t2.getText();
	     			 	
	     			 	
	     				try {
	     					Class.forName("com.mysql.jdbc.Driver");
	     					Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/logindata","root","1234");
	     					
	     					System.out.println("Inserting Record....");
	     					String sql="INSERT INTO  accountdetail(Ac_no, cd_no, cvv_no) VALUES(?,?,?)";
	     					
	     					PreparedStatement ps=con.prepareStatement(sql);
	     					ps.setString(1,Ac_no );
	     					ps.setString(2, Cd_no);
	     					ps.setString(3, cvv);
	     					
	     					
	     					//ps.executeUpdate(INSERT_);
	     					//ps.executeUpdate(sql);
	     					 int rowsInserted = ps.executeUpdate();
	     					 System.out.println("record inserted");
	     					 		 if (evt.getSource() == btn)
	     					 		 { 
	     						 JOptionPane.showMessageDialog(null, "Submitted...!");
	     						
	     								 
	     					 		 }
	     					 		 else {
	     					 			 System.out.println("not submited...!");
	     					 		 }
	     					 		
	     				}
	     				catch(Exception e1)
	     				{
	     					//JOptionPane.showMessageDialog(null, "Please fill details");
	     				 e1.printStackTrace();	
	     				}
	     		 }
	     		 
	              
	              JOptionPane.showMessageDialog(null, "Added...!");
	            }
	        });
		 
}
public static void main(String[] args) {
	AccountDetail ac=new AccountDetail();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
public void setVisible(boolean b) {
	// TODO Auto-generated method stub
	
}


}