import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notepad implements ActionListener {
    JFrame frame;
    JTextArea myarea;
    JButton button;
    Notepad(){
        // creating frame
        frame = new JFrame("Notepad");
        frame.setBounds(250,250,300,300);
        frame.setBackground(Color.black);
        frame.getContentPane().setBackground(Color.black);
        // creating button
        button = new JButton("Click");
        button.setBounds(120,20,50,20);
        button.addActionListener(this);
        // creating text area
        myarea = new JTextArea("Wellcome to the text area");
        myarea.setBounds(50,50,200,200);
        myarea.setBackground(Color.red);
        // adding all the things to the frame
        frame.add(button);
        frame.add(myarea);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        Notepad obj = new Notepad();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        myarea.setText("You clicked the button");
    }
}
