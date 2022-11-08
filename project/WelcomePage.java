import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePage {
   

    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon();
    JLabel diplayFieldD = new JLabel();
    

    WelcomePage(){
        



    frame.setSize(788,720);
    frame.setTitle("WELCOMEPAGE");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(panel);
    try{

        image = new ImageIcon(getClass().getResource("Screenshot_384.png"));
        JLabel displayField = new JLabel(image);
        frame.add(displayField);
        }catch(Exception e){
            System.out.println("image not found");
        }
        

    panel.setLayout(null);
    frame.setVisible(true);

    


   


   
    }
    public static void main(String[] args) {

    }
}
    
