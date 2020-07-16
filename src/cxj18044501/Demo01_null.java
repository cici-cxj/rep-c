package cxj18044501;

import javax.swing.*;

public class Demo01_null {
	public static void main(String[] args) {
		JFrame jf = new JFrame("²âÊÔ¾ø¶Ô²¼¾Ö");
		jf.setSize(300,300);
		jf.setLocation(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(null);
		JButton button = new JButton("button01");
		button.setLocation(50,50);
		button.setSize(100,50);
		JButton button2 = new JButton("button02");
		button2.setLocation(50,100);
		button2.setSize(100,50);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
		JButton button3 = new JButton("button03");
		button3.setBounds(panel.getWidth()-100, panel.getHeight()-50, 100, 50);
		System.out.println(panel.getWidth());
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		
	}

}
