package chap10;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame{
	private final int FLYING_UNIT = 10;	// 레이블이 한 번 움직이는 단위는 10픽셀
	private JLabel la = new JLabel("HELLO");	// 키 입력에 따라 움직일 레이블 컴포넌트
	
	public FlyingTextEx() {
		setTitle("상,하,좌,우 기를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);	// 컨텐트팬의 배치관리자 삭제
		c.addKeyListener(new MyKeyListener());	//컨텐트팬에 Key 리스너 달기
		la.setLocation(50,50);	// la의 초기 위치는 (50,50)
		la.setSize(100,20);
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();	// 컨텐트팬이 키 입력을 받을 수 있더로 포커스 강제 지정
	}
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();	// 입력된 키의 키코드를 알아낸다.
			
			// 키 코드 값(keyCode)에 따라 상,하,좌,우 키를 판별하고 la의 위치를 이동시킨다.
			switch(keyCode) {
			case KeyEvent.VK_UP: // UP키
				la.setLocation(la.getX(),la.getY()-FLYING_UNIT); break;
			case KeyEvent.VK_DOWN: // DOWN키
				la.setLocation(la.getX(),la.getY()+FLYING_UNIT); break;
			case KeyEvent.VK_LEFT: // LEFT키
				la.setLocation(la.getX()-FLYING_UNIT,la.getY()); break;
			case KeyEvent.VK_RIGHT: // RIGHT키
				la.setLocation(la.getX()+FLYING_UNIT,la.getY()); break;
			}
		}
	}
	public static void main(String[] args) {
		new FlyingTextEx();
	}

}
