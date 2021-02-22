import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class GUI extends JFrame{

     private final JFrame frame = new JFrame();
     private final JButton history = new JButton();
     private final JButton training = new JButton();
     private final JButton free = new JButton();
     private JLabel picLabel = new JLabel();

     GUI() {
         frame.setSize(450,700);

         history.setText("History");
         history.setBounds(120,200,200,70);
         history.setForeground(Color.white);
         history.setFont(new Font("name",Font.ROMAN_BASELINE,18));
         history.setOpaque(true);
         history.setContentAreaFilled(false);
         //history.setBorderPainted(false);
         history.setFocusable(false);
         history.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));


         training.setText("Pre-selected Workout");
         training.setBounds(120,300,200,70);
         training.setForeground(Color.white);
         training.setFont(new Font("name",Font.ROMAN_BASELINE,18));
         training.setOpaque(true);
         training.setContentAreaFilled(false);
         //training.setBorderPainted(false);
         training.setFocusable(false);
         training.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

         free.setText("Free Mode");
         free.setBounds(120,400,200,70);
         free.setForeground(Color.white);
         free.setFont(new Font("name",Font.ROMAN_BASELINE,18));
         free.setOpaque(true);
         free.setContentAreaFilled(false);
         //free.setBorderPainted(false);
         free.setFocusable(false);
         free.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

         frame.add(history);
         frame.add(training);
         frame.add(free);


         image();
         frame.setLocationRelativeTo(null);

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
     }

     public void image(){
         BufferedImage myPicture = null;
         try {
             myPicture = ImageIO.read(new File("C:\\Users\\Jialin\\Desktop\\frank-grillo40.jpg"));
         } catch (IOException e) {
             e.printStackTrace();
         }
         picLabel.setIcon(new ImageIcon(myPicture));
         frame.add(picLabel);
     }

     public static void main( String args[] ){
        GUI menuUI = new GUI();

    } // end method main} // end class Addition
 }