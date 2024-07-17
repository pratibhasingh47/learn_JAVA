import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;

    MyFrame() {
        this.setTitle("Java JFrame Title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(420, 420);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("C:\\Users\\DELL\\Pictures\\Camera Roll");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.MAGENTA);
    }

    // ----------------------------------------------------------------------

    MyFrame(){

        JButton button = new JButton();
        button.setBounds(200, 100, 200, 100);
        button.addActionListener(this);
        // button.addActionListener(e -> System.out.println("Foo..."));
        button.setText("I am a button");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic Sans",Font.ITALIC,20));
        button.setForeground(Color.BLACK);
        button.setBackground(Color.ORANGE);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("Fooo");
        }
    }
}
