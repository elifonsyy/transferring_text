package helloworld;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class helloworld extends JPanel implements ActionListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Frame1
        JFrame frame1 = new JFrame();
        JTextField text1 = new JTextField("Hello");
        JButton button1 = new JButton("SEND");
        text1.setBounds(50, 50, 150, 50);
        button1.setBounds(200, 50, 100, 100);
        frame1.add(text1);
        frame1.add(button1);
        frame1.setSize(400, 500);
        frame1.setLayout(null);
        frame1.setVisible(true);
        
        //Frame2
        JFrame frame2 = new JFrame();
        JTextField text2 = new JTextField("World");
        JButton button2 = new JButton("SEND");
        text2.setBounds(50, 50, 150, 50);
        button2.setBounds(200, 50, 100, 100);
        frame2.add(text2);
        frame2.add(button2);
        frame2.setSize(400, 500);
        frame2.setLayout(null);
        frame2.setVisible(true);
        
        button1.addActionListener(new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		// TODO Auto-generated method stub
    		String text = text1.getText();
    		text2.setText(text);
    	}
	});
        button2.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		// TODO Auto-generated method stub
        		String text = text2.getText();
        		text1.setText(text);
        	}
    	});
	}
}
