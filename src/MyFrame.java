import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class MyFrame extends JFrame implements ActionListener {
    // JButton button;
    JRadioButton pizzabtn;
    JRadioButton burgerbtn;
    JRadioButton pastrybtn;

    JComboBox comboBox;

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editJMenu;
    JMenu helpMenu;

    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

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

    // ----------------------------------------------------------------------

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JRadioButton pizzabtn = new JRadioButton("Pizza");
        JRadioButton burgerbtn = new JRadioButton("Burger");
        JRadioButton pastrybtn = new JRadioButton("Pastry");

        ButtonGroup grp = new ButtonGroup();
        grp.add(pizzabtn);
        grp.add(burgerbtn);
        grp.add(pastrybtn);
        
        this.add(pizzabtn);
        this.add(burgerbtn);
        this.add(pastrybtn);
        this.pack();
        this .setVisible(true);
    }

    // ----------------------------------------------------------------------

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"Dog","Cat","Bird"};

        JComboBox comboBox = new JComboBox<>();

        comboBox.setEditable(true);
        comboBox.getItemCount();
        comboBox.addItem("Combobox");
        comboBox.insertItemAt("Pig",0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("cat");
        comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this .setVisible(true);
    }



    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);
        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == loadItem){
            System.out.println("LOAD");
        }
        else if(e.getSource() == saveItem){
            System.out.println("SAVE");
        }
        else if(e.getSource() == exitItem){
            System.exit(0);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == button){
            System.out.println("Fooo");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e1){
        if(e1.getSource() == pizzabtn){
            System.out.println("Pizza");
        }
        else if(e1.getSource() == burgerbtn){
            System.out.println("Burger");
        }
        else if(e1.getSource()== pastrybtn){
            System.out.println("Pastry");
        }
    }
}
