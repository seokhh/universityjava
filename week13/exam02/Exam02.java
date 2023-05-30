package javaprogramming.week13.exam02;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
class Event01 extends JFrame implements ActionListener {
    private JButton b1,b2;
    private JPanel panel;
    public Event01(){
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        b1 = new JButton("노란색");
        b2 = new JButton("초록색");
        panel.add(b1);
        panel.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(panel);
        setVisible(true);
    }//setSize  setDefault
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            panel.setBackground(Color.yellow);
        }
        if(e.getSource()==b2){
            panel.setBackground(Color.green);
        }
    }
}
public class Exam02 {
    public static void main(String[] args){
        Event01 obj = new Event01();
    }
}