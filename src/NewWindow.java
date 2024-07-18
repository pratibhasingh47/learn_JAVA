import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
    
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello Window");
    NewWindow(){

        label.setBounds(0,0,100,150);
        label.setFont(new Font("Lucida Calligraphy",Font.BOLD,25));
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420) ;
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
