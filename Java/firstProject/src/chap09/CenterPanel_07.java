package chap09;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class CenterPanel_07 extends JPanel{
	public CenterPanel_07() {
		setLayout(new GridLayout(4,4,5,5));
		add(new MyButton_07("0"));
		add(new MyButton_07("1"));
		add(new MyButton_07("2"));
		add(new MyButton_07("3"));
		add(new MyButton_07("4"));
		add(new MyButton_07("5"));
		add(new MyButton_07("6"));
		add(new MyButton_07("7"));
		add(new MyButton_07("8"));
		add(new MyButton_07("9"));
		add(new MyButton_07("CE",20));
		add(new MyButton_07("계산",25));
		add(new MyButton_07("+",30, Color.CYAN));
		add(new MyButton_07("-",30, Color.CYAN));
		add(new MyButton_07("X",30, Color.CYAN));
		add(new MyButton_07("/",30, Color.CYAN));
		setVisible(true);
	}
}