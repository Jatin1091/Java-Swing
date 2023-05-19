import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class Registration1 implements ActionListener 
{ 
	JFrame f;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8; 
    JTextField tf1, tf2, tf5, tf6, tf7; 
    JButton btn1, btn2; 
    JPasswordField p1, p2; 
    Registration1() 
    {
    	f.setVisible(true); 
        f.setSize(700, 700); 
        f.setLayout(null); 
        f.setTitle("Registration Form in Java"); 
        l1 = new JLabel("Registration Form in Windows Form:"); 
        l1.setForeground(Color.blue); 
        l1.setFont(new Font("Serif", Font.BOLD, 20)); 
        l2 = new JLabel("Name:"); 
        l3 = new JLabel("Email-ID:"); 
        l4 = new JLabel("Create Passowrd:"); 
        l5 = new JLabel("Confirm Password:"); 
        l6 = new JLabel("Country:");
        l7 = new JLabel("State:");
        l8 = new JLabel("Phone No:"); 
        tf1 = new JTextField(); 
        tf2 = new JTextField(); 
        p1 = new JPasswordField(); 
        p2 = new JPasswordField(); 
        tf5 = new JTextField(); 
        tf6 = new JTextField(); 
        tf7 = new JTextField(); 
        btn1 = new JButton("Submit"); 
        btn2 = new JButton("Clear"); 
        btn1.addActionListener(this); 
        btn2.addActionListener(this);
        l1.setBounds(100, 30, 400, 30); 
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30); 
        l4.setBounds(80, 150, 200, 30); 
        l5.setBounds(80, 190, 200, 30); 
        l6.setBounds(80, 230, 200, 30); 
        l7.setBounds(80, 270, 200, 30);
        l8.setBounds(80, 310, 200, 30); 
        tf1.setBounds(300, 70, 200, 30); 
        tf2.setBounds(300, 110, 200, 30); 
        p1.setBounds(300, 150, 200, 30); 
        p2.setBounds(300, 190, 200, 30); 
        tf5.setBounds(300, 230, 200, 30); 
        tf6.setBounds(300, 270, 200, 30); 
        tf7.setBounds(300, 310, 200, 30); 
        btn1.setBounds(50, 350, 100, 30); 
        btn2.setBounds(170, 350, 100, 30); 
        f.add(l1); 
        f.add(l2); 
        f.add(tf1); 
        f.add(l3); 
        f.add(tf2); 
        f.add(l4); 
        f.add(p1); 
        f.add(l5); 
        f.add(p2);
        f.add(l6); 
        f.add(tf5); 
        f.add(l7); 
        f.add(tf6); 
        f.add(l8); 
        f.add(tf7); 
        f.add(btn1); 
        f.add(btn2); 
    } 
    public void actionPerformed(ActionEvent e) 
    { 
    	if (e.getSource() == btn1) 
    	{  
    		String s1 = tf1.getText(); 
    		String s2 = tf2.getText(); 
    		char[] s3 = p1.getPassword();
    		char[] s4 = p2.getPassword(); 
    		String s5 = tf5.getText(); 
    		String s6 = tf6.getText(); 
    		String s7 = tf7.getText();
    		String s8 = new String(s3);
    		String s9 = new String(s4); 
    		if (s8.equals(s9)) 
    		{ 
    			JOptionPane.showMessageDialog(btn1, "Data Saved Successfully"); 
    		} 
    		else 
    		{ 
    			JOptionPane.showMessageDialog(btn1, "Password Does Not Match"); 
    		} 
    	} 
    	else 
    	{ 
    		tf1.setText("");
    		tf2.setText(""); 
    		p1.setText(""); 
    		p2.setText(""); 
    		tf5.setText(""); 
    		tf6.setText(""); 
    		tf7.setText(""); 
    	} 
    } 
    public static void main(String args[]) 
    { 
    	new Registration(); 
    } 
}
