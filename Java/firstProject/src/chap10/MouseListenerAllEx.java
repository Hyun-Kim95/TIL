package chap10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.StyledEditorKit.FontSizeAction;

public class MouseListenerAllEx extends JFrame{
	private JLabel la = new JLabel("No Mouse Event");	// 메시지 출력 레이블 컴포넌트
	
	public MouseListenerAllEx() {
		setTitle("MouseListener 와 Mouse MotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();	// 리스너 객체 생성
		c.addMouseListener(listener);	// MouseListener 리스너 등록
		c.addMouseMotionListener(listener);	// MouseMotionListener 리스너 등록
		c.addMouseWheelListener(listener);	// addMouseWheelListener 리스너 등록

		c.add(la);
		setSize(300,200);
		setVisible(true);
	}
	
	// Mouse 리스너와 MouseMotion 리스너를 모두 가진 리스너 작성(+MouseWheel리스너)
	class MyMouseListener implements MouseListener, MouseMotionListener, MouseWheelListener{
		//MouseListener의 5개 메소드 구현
		public void mousePressed(MouseEvent e) {
			// 마우스가 눌러진 위치 (x,y) 점을 출력
			la.setText("mousePressed ("+e.getX()+","+e.getY()+")");
		}
		public void mouseReleased(MouseEvent e) {
			// 마우스가 떼어진 위치 (x,y) 점을 출력
			la.setText("mouseReleased ("+e.getX()+","+e.getY()+")");
		}
		public void mouseClicked(MouseEvent e) {
			la.setText("mouseClicked ("+e.getX()+","+e.getY()+")");
			// 더블클릭의 경우
			if(e.getClickCount()==2) {
				// 랜덤한 rgb를 구함
				int r = (int)(Math.random()*256);
				int g = (int)(Math.random()*256);
				int b = (int)(Math.random()*256);
				Component c = (Component)e.getSource();
				c.setBackground(new Color(r, g, b));
			}
		}
		public void mouseEntered(MouseEvent e) {
			// 마우스가 올라간 컴포넌트를 알아냄
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			// 마우스가 내려간 컴포넌트를 알아냄
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		
		// MouseMotionListener 의 2개 메소드 구현
		public void mouseDragged(MouseEvent e) {
			// 마우스가 드래깅되는 동안 계속 호출
			la.setText("mouseDragged ("+e.getX()+","+e.getY()+")");
		}
		public void mouseMoved(MouseEvent e) {
			// 마우스가 움직이는 동안 계속 호출
			la.setText("mouseMoved ("+e.getX()+","+e.getY()+")");
		}
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			int n = e.getWheelRotation();
			// 휘을 위로 올리면 -, 내리면 +
			Dimension size = la.getSize();
			System.out.println(size.getWidth()+", "+size.getHeight());
			
			Font a = la.getFont();
			if(n > 0) {
				la.setFont(new Font(getName(),Font.PLAIN,a.getSize()+1));
			}else {
				la.setFont(new Font(getName(),Font.PLAIN,a.getSize()-1));
			}
		}
	}
	public static void main(String[] args) {
		new MouseListenerAllEx();
	}
}