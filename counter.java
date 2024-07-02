package helloworld;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class counter extends JPanel implements ActionListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame1 = new JFrame();
        JButton button1 = new JButton("COUNT 1-100");
        button1.setBounds(200, 50, 200, 200);
        frame1.add(button1);
        frame1.setSize(400, 500);
        frame1.setLayout(null);
        frame1.setVisible(true);
        
        JFrame frame2 = new JFrame();
        JTextField text1 = new JTextField();
        text1.setBounds(50, 50, 150, 250);
        frame2.add(text1);
        frame2.setSize(400, 500);
        frame2.setLayout(null);
        frame2.setVisible(true);
        
        button1.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		// TODO Auto-generated method stub
        		for(int i = 1;i<=100;i++) {
        		  //String text = text1.getText(i);
        		  //int text1 = Integer.parseInt(text);
        		}
        	}
    	});
	}

}
