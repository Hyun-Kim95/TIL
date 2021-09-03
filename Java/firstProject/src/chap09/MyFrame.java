package chap09;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("ContentPane 과 JFrame");
		// X버튼으로 프로그램 종료되도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		// 컨텐트팬의 색을 오렌지로
		contentPane.setBackground(Color.orange);
		// 컨텐트팬의 FlowLayout 배치관리자 달기
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,20,40));
		
		// 버튼 달기
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		
		setSize(500,300);	// 프레임 크기 설정
		setVisible(true);	// 화면에 프레임 출력
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}
