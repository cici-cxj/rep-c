package cxj18044501;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.WindowConstants;

public class Demo03_menu {
	public static void main(String[] args) {
		JFrame jf = new JFrame("���Ծ��Բ���");
		jf.setSize(300,300);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("�ļ�");
		JMenu editMenu = new JMenu("�༭");
		JMenu viewMenu = new JMenu("��ͼ");
		
		JMenuItem newItem = new JMenuItem("�½�");
		JMenuItem openItem = new JMenuItem("��");
		JMenuItem outItem = new JMenuItem("�˳�");
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(outItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(viewMenu);
		
		jf.setJMenuBar(menuBar);
		jf.setVisible(true);
		newItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("���½�ҳ��");
				jf.setVisible(false);
			}
		});
	}
}
		
	


