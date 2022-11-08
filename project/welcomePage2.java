import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class welcomePage2 {

    
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon();
    JLabel displayField = new JLabel();

    welcomePage2(){



    frame.setSize(650,450);
    frame.setTitle("codes");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.add(panel);
    try{

    image = new ImageIcon(getClass().getResource("info.png"));
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
