import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Gui {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You age is " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You age is " + height);

        // --------------------------------------------------------------

        JFrame frame = new JFrame();
        frame.setTitle("Java JFrame Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("C:Users\\DELL\\Pictures\\Camera Roll");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.MAGENTA);

        MyFrame myframe = new MyFrame();
        Border border = BorderFactory.createLineBorder(Color.green,3);

        // -----------------------------------------------------

        JLabel label = new JLabel();
        label.setText("How you doing ?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("MV Boli",Font.BOLD,20));
        label.setIconTextGap(10);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 250, 250); 

        // ---------------------------------------------------

        JLabel l = new JLabel();
        l.setText("Hiii");

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.CYAN);
        panel1.setBounds(0, 0, 250, 250);

        JPanel panel2 = new JPanel();
        panel2.setBounds(250, 0, 250, 250);
        panel2.setBackground(Color.PINK);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.yellow);
        panel3.setBounds(0, 250, 500, 250);
        panel3.setLayout(new BorderLayout());

        // --------------------------------------------

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));
        frame.setVisible(true);
        frame.add(label);
        panel1.add(l);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.pack();

        MyFrame frame = new MyFrame();

        JPanel panel_1 = new JPanel();        
        JPanel panel_2 = new JPanel();        
        JPanel panel_3 = new JPanel();        
        JPanel panel_4 = new JPanel();        
        JPanel panel_5 = new JPanel();  
        
        panel_1.setBackground(Color.RED);
        panel_2.setBackground(Color.YELLOW);
        panel_3.setBackground(Color.ORANGE);
        panel_4.setBackground(Color.CYAN);
        panel_5.setBackground(Color.PINK);

        panel_1.setPreferredSize(new Dimension(100,50));
        panel_2.setPreferredSize(new Dimension(100,100));
        panel_3.setPreferredSize(new Dimension(100,100));
        panel_4.setPreferredSize(new Dimension(100,100));
        panel_5.setPreferredSize(new Dimension(100,100));

        frame.add(panel_1,BorderLayout.NORTH);
        frame.add(panel_2,BorderLayout.WEST);
        frame.add(panel_3,BorderLayout.EAST);
        frame.add(panel_4,BorderLayout.SOUTH);
        frame.add(panel_5,BorderLayout.CENTER);

        LaunchPage launchPage = new LaunchPage();

        JOptionPane.showMessageDialog(null, "This is not useful", "TITLE", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is not useful", "TITLE", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is not useful", "TITLE", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is not useful", "TITLE", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is not useful", "TITLE", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showConfirmDialog(null, "What language you code in ?", "Question", JOptionPane.YES_NO_CANCEL_OPTION);
        JOptionPane.showInputDialog("What is your name");
        JOptionPane.showOptionDialog(null, "You are awesome", "Secret message", JOptionPane.YES_NO_OPTION, 0, null, null, null);

        SliderDemo sliderDemo = new SliderDemo();

    }
}
