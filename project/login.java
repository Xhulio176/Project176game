import java.awt.*;  
import java.awt.event.*;  
import java.util.EventListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class login implements ActionListener{
  private static final String TEXT = null;
  private static JLabel userlabel;
  private static JTextField userText;
  private static JLabel passlabel;
  private static JPasswordField passwordText;
  private static JButton button;
  private static JLabel success;
  private static JLabel usepass;
  private static JLabel passpass;
  
 
  
  public static void main(String[] args) {

     JPanel panel = new JPanel();
     JFrame frame = new JFrame();

        
      frame.setSize(1200, 700);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("TzoulioAgo");
      frame.add(panel);
     

  

     
      

     panel.setLayout(null);
     userlabel = new JLabel("Username:");
     userlabel.setBounds(85,20,100,25);
     userlabel.setFont(new Font("Anton",Font.BOLD,20));
     panel.add(userlabel);

     userText = new JTextField(20);
     userText.setBounds(200,20,165,25);
     panel.add(userText);

     passlabel = new JLabel("Password:");
     passlabel.setBounds(85,50,160,25);
     passlabel.setFont(new Font("Anton",Font.BOLD,20));
     panel.add(passlabel);

     passwordText = new JPasswordField();
     passwordText.setBounds(200,50,165,25);
     panel.add(passwordText);

     button = new JButton("Login");
     button.setBounds(84,80,100,30);
     button.addActionListener(new login());
     panel.add(button);

     success = new JLabel("");
     success.setBounds(86,110,100,25);
     panel.add(success);

     
     usepass = new JLabel("passwords");
     usepass.setBounds(400,20,100,25);
     panel.add(usepass);

     
     passpass = new JLabel("password");
     passpass.setBounds(400,45,100,25);
     panel.add(passpass);






     
     frame.setVisible(true);
    









    }



    public void actionPerformed(ActionEvent e){  
      String user = userText.getText();
      String password = passwordText.getText();
      System.out.println(user + " " + password);
      if(user.equals("bio") && password.equals("bio2022")){
        success.setText("Login Success");
        success.setForeground(Color.BLACK);
        WelcomePage WelcomePage = new WelcomePage();
      }else if(user.equals("passwords") && password.equals("password")){
        success.setText("Login Success");
        success.setForeground(Color.green);
        welcomePage2 welcomePage2 = new welcomePage2();

      }
      else if(user.equals("game") && password.equals("123")){
        success.setText("Login Success");
        success.setForeground(Color.green);
        game176 welcomePage3 = new game176();
      }
      else{
        success.setText("WargPass");
        success.setForeground(Color.red);
      }



}

}