package cxj18044501;
import javax.swing.*;

public class SwingDemo01 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("简介");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(700, 300, 500, 500);
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("用户名");
		JTextField t1=new JTextField(8);
		panel.add(label);
		panel.add(t1);
		
		JLabel labe2 = new JLabel("密码");
		JPasswordField password = new JPasswordField(8);
		panel.add(labe2);
		panel.add(password);
		
		JLabel labe3 = new JLabel("性别");
		JRadioButton S1= new JRadioButton("男  ");
		JRadioButton S2 = new JRadioButton("女                       ");
		ButtonGroup bg=new ButtonGroup();
		bg.add(S1);
		bg.add(S2);
		S1.setSelected(true);		
		panel.add(labe3);
		panel.add(S1);
		panel.add(S2);
		
		JLabel labe4 = new JLabel("职业：");
		JCheckBox jcb1 = new JCheckBox("医生");
		JCheckBox jcb2 = new JCheckBox("教师");
		JCheckBox jcb3 = new JCheckBox("警察");
		JCheckBox jcb4 = new JCheckBox("歌手                                                ");
		panel.add(labe4);
		panel.add(jcb1);
		panel.add(jcb2);
		panel.add(jcb3);
		panel.add(jcb4);
		
		JLabel labe5 = new JLabel("        职业介绍");		
		JTextArea area = new JTextArea(10,30);
		area.setLineWrap(true);
		panel.add(labe5);
		panel.add(area);
		JButton button = new JButton("提交");
		panel.add(button);
		
		jf.add(panel);
		jf.setVisible(true);
	}

}
