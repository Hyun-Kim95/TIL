package chap09;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SouthPanel_07 extends JPanel {
	public SouthPanel_07() {
		setBackground(Color.orange);
		JLabel la = new JLabel("계산 결과");
		la.setFont(new Font("굴림",Font.BOLD, 23));
		la.setPreferredSize(new Dimension(120,40));
		JTextField text = new JTextField("",32);
		text.setPreferredSize(new Dimension(60,40));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(la);
		add(text);
	}
}
