package chap09;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class MyButton_07 extends JButton {
	public MyButton_07(String text) {
		this(text, 30);
	}
	public MyButton_07(String text, int textSize) {
		this(text, textSize, null);
	}
	public MyButton_07(String text, int textSize, Color color) {
		super(text);
		this.setFont(new Font("고딕", Font.PLAIN, textSize));
		setBackground(color);
	}
}
