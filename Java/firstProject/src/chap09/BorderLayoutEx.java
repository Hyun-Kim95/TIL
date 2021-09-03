package chap09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		BorderLayout layout = new BorderLayout(30,20);
		// 컨텐트팬에 BorderLayout 배치관리자 설정
		c.setLayout(new BorderLayout(30,20));
		layout.setHgap(50);
		layout.setVgap(50);
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
