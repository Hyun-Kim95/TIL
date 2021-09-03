package chap09;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NorthPanel_07 extends JPanel{
	public NorthPanel_07() {
		setBackground(Color.lightGray);
		JLabel la = new JLabel("수식입력");
		JTextField text = new JTextField("",30);
		setLayout(new FlowLayout());
		add(la);
		add(text);	
	}
}