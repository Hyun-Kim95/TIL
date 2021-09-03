package chap09;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

public class Exam07 extends JFrame{
public Exam07() {
	
	setTitle("계산기 프레임");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(500,400);
	Container c = getContentPane();
	c.setLayout(new BorderLayout());
	c.add(new NorthPanel_07(),BorderLayout.NORTH);
	c.add(new CenterPanel_07(),BorderLayout.CENTER);
	c.add(new SouthPanel_07(),BorderLayout.SOUTH);
	
	setVisible(true);
	}
	public static void main(String[] args) {
		new Exam07();
	}

}