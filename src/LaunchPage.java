import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage implements ActionListener {
    
    JFrame frame = new JFrame();
    JButton mybutton = new JButton("New Window");
    LaunchPage(){
        mybutton.setBounds(100,160,200,40);
        mybutton.setFocusable(false);
        mybutton.addActionListener(this);

        frame.add(mybutton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420) ;
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");

        if(e.getSource() == mybutton){
            frame.dispose();
        }
    }
}
