import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import java.applet.*;


 
public class Restaurant extends JFrame 
{
    
        private JFrame jframe;
        JLabel label1,label2;
        //JTextField text1,text2;
        JButton bill,manage,history,logout;
        JPanel panel;  //window declare
                
		
        public  Restaurant()
		{  
		
			this.setSize(750, 600);
			this. setLayout(null);
			
			label1  = new   JLabel("Wellcome to Your billing management System");
			label1.setFont(new Font("Serif", Font.BOLD, 25));       
			label1.setBounds(100, 50, 700, 30);
			this.add(label1);
			
			label2 = new JLabel("Please Select Your Option");
			label2.setFont(new Font("Serif",Font.PLAIN,24));
			label2.setBounds(220,100,700,30);
			this.add(label2);
        
        
			bill = new JButton("Billing"); 
			bill.setFont(new Font("Serif",Font.BOLD,20));
			bill.setBounds(120,310,220,40);
			this.add(bill);
			
		manage = new JButton("Manage Product"); 
			manage.setFont(new Font("Serif",Font.BOLD,20));
			manage.setBounds(380,310,220,40);
			this.add(manage); 
			
		history = new JButton("View Order History"); 
			history.setFont(new Font("Serif",Font.BOLD,20));
			history.setBounds(120,390,220,40);
			this.add(history);
			
		logout = new JButton("Log Out"); 
			logout.setFont(new Font("Serif",Font.BOLD,20));
			logout.setBounds(380,390,220,40);
			this.add(logout);
			
			manage.setEnabled(false);
			
		
		
			history.addActionListener(new ActionListener()
			{
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
					BillHistory bhi = new BillHistory("U");
					bhi.setVisible(true);
					setVisible(false); 
				}
			});
        
       
        bill.addActionListener(new ActionListener() {
                       
            public void actionPerformed(java.awt.event.ActionEvent e) {
               Billing bu = new Billing("U");
               bu.setVisible(true);
	           setVisible(false); 
            }
        }); 
		
		
		logout.addActionListener(new ActionListener() 
		{            
            public void actionPerformed(java.awt.event.ActionEvent e) 
			{
				RestaurantBillingSystem rbs2 = new RestaurantBillingSystem();
				rbs2.setVisible(true);
				setVisible(false); 
            }
        }); 
		
       
			this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
      
          
          }
        
                    

	public static void main (String args [])
	{
		Restaurant rs = new Restaurant();
		rs.setLocationRelativeTo(null);
		rs.setVisible(true);
                
	}
    
    
}

