package coursework;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Order implements ActionListener {

	
	
	Label lblTitle,l6,l7;
	TextField t,t1,t2,t3,t4,t5;
	Font titleFont;
	JButton payButton;
	JRadioButton onlinePayment,cashPayment;
	 Button btn;
	JTextArea res;
	
	Order(){
		
		
		
		Frame f=new Frame();
		f.setSize(850, 550);
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
		
		lblTitle=new Label("***ORDER FORM***");
		lblTitle.setBounds(300,40,300,50);
		lblTitle.setFont(new Font("verdana",Font.BOLD,16));
		lblTitle.setForeground(Color.BLUE);
		f.add(lblTitle);
		
		
		
		Label l=new Label("Product Name:");
		TextField t=new TextField();
		l.setBounds(100, 90, 100, 50);
		t.setBounds(210, 100, 170, 30);
		l.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l);
		f.add(t);
		
		
		Label l1=new Label("company:");
		TextField t1=new TextField();		
		l1.setBounds(400, 70, 100, 80);		
		t1.setBounds(500, 90, 150, 30);
		l1.setFont(new Font("verdana",Font.BOLD,14));
		f.add(t1);	
		f.add(l1);
		
		Label l2=new Label("Product price:");
		TextField t2=new TextField();
		l2.setBounds(100, 140, 100, 50);
		t2.setBounds(210, 150, 170, 30);
		l2.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l2);
		f.add(t2);
		
		Label l3=new Label("Category:");
		TextField t3=new TextField();
		l3.setBounds(400, 140, 100, 50);
		t3.setBounds(500, 150, 150, 30);
		l3.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l3);
		f.add(t3);
		
	    
		
		Label l4=new Label("Description:");
		TextField t4=new TextField();
		l4.setBounds(100, 220, 100, 50);
		t4.setBounds(200, 230, 450, 30);
		l4.setFont(new Font("verdana",Font.BOLD,14));
		f.add(l4);
		f.add(t4);
		
		
		Label L5=new Label("Address:");
		TextField t5=new TextField();
		L5.setBounds(110, 300, 100, 50);
		t5.setBounds(200, 310, 450, 30);
		L5.setFont(new Font("verdana",Font.BOLD,14));
		f.add(L5);
		f.add(t5);
		
		//f.setForeground(Color.BLACK);
		
		Button b1=new Button("Cancel");
		  b1.setBounds(450, 400, 130, 30);
		  b1.setFont(new Font("verdana",Font.BOLD,14));
		  f.add(b1);
		 // b1.addActionListener(this);
		  b1.setBackground(Color.LIGHT_GRAY);
		
	     btn=new Button("Payment"); 
		 btn.setBounds(140, 400, 150, 30); 
		 btn.setFont(new Font("verdana",Font.BOLD,14));
		 
		 //btn.addActionListener(this);
		  f.add(btn);
		  btn.setBackground(Color.LIGHT_GRAY);
		   
	  
	btn.addActionListener(new java.awt.event.ActionListener() 
	{
        public void actionPerformed(java.awt.event.ActionEvent evt)
        {
        	if(evt.getSource()==btn)
        	{
        		PaymentMode pm=new PaymentMode();
        		pm.setVisible(true);
        	}
          
          if(evt.getSource()==btn)
 		 {
					 res.setText("");
					 	String Product_Name=t.getText();
					 	String Quantity=t1.getText();
					 	String Product_price_=t2.getText();
					 	String Category=t3.getText();
					 	String Desription =t4.getText();
					 	String Address=t5.getText();
					 	
					 	
					 	
						try {
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/logindata","root","1234");
							
							//System.out.println("Inserting Record....");
							String sql="INSERT INTO  paymentdata(Productname, Company, Productprice, category, Description, address) VALUES(?,?,?,?,?,?)";
							
							PreparedStatement ps=con.prepareStatement(sql);
							ps.setString(1,Product_Name );
							ps.setString(2, Quantity);
							ps.setString(3, Product_price_);
							ps.setString(4, Category);
							ps.setString(5,Desription );
							ps.setString(6,Address );
							
							
							//ps.executeUpdate(INSERT_);
							//ps.executeUpdate(sql);
							 int rowsInserted = ps.executeUpdate();
							
							 
							 
						}
						
						catch(Exception e1)
						{
							JOptionPane.showMessageDialog(null, "Add all field..");
						e1.printStackTrace();	
						}
				 }
        }
	});
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order=new Order();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	}
/*
 * if (evt.getSource() == btn) { JOptionPane.showMessageDialog(null,
 * "Submitted...!");
 * 
 * 
 * } else { System.out.println("not submited...!"); }
 */

