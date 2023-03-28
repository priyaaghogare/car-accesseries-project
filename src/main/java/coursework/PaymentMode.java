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

import javax.swing.JOptionPane;

public class PaymentMode implements ActionListener
 {
	
	
	Button online,cash;
	Label lable;
	
	PaymentMode()
	{
	Frame f=new Frame();
	f.setSize(300, 300);
	f.setLayout(null);
	f.setVisible(true);
	f.setBackground(Color.CYAN);
	
	
	f.addWindowListener(new WindowAdapter()
	{
		public void windowClosing (WindowEvent e)
		{
			System.exit(0);
		}
	});
	
	lable=new Label("Select payment mode");
	lable.setBounds(80, 100, 300, 30);
	lable.setFont(new Font("verdana",Font.BOLD,14)); 
	  f.add(lable);
	
	
	online=new Button("Online");
	
	  online.setBounds(50, 150, 100, 30); 
	  online.setFont(new Font("verdana",Font.BOLD,14)); 
	  f.add(online);
	 online.setBackground(Color.LIGHT_GRAY); 
	 online.addActionListener(this);
	 online.setVisible(true);
	 
	 online.addActionListener(new java.awt.event.ActionListener() 
		{
	        public void actionPerformed(java.awt.event.ActionEvent evt)
	        {
	        	if (evt.getSource() == online)
		 		 { 
			 
	        		AccountDetail ac=new AccountDetail();
	        		ac.setVisible(true);
					 
		 		 }
		 		 else {
		 			 System.out.println("not submited...!");
		 		 }
	        }
	    });
	
	
	cash=new Button("Cash");
	cash.setBounds(180,150, 100, 30);
	cash.setFont(new Font("verdana",Font.BOLD,14)); 
	f.add(cash);
	cash.setBackground(Color.LIGHT_GRAY); 
	
	}
	public static void main(String[] args) {
		PaymentMode paymode=new PaymentMode();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}