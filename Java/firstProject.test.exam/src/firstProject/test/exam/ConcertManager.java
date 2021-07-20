package firstProject.test.exam;

public class ConcertManager {
	public static void main(String[] args) {
		concert1();
		//concer2();
	}
	public static void concer2() {
		Concert2 concert = new Concert2(10);
		while(true) {
			try {
				switch(concert.getMenu1()) {
				case 1:  // ����
					int seat = concert.getMenu2();
					concert.show(seat-1);
					concert.reserve(seat-1);
					break;
				case 2:  // ��ȸ
					concert.show(Concert2.SEAT_S);
					concert.show(Concert2.SEAT_A);
					concert.show(Concert2.SEAT_B);
					System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
					break;
				case 3:  // ���
					concert.cancel();
					break;
				case 4:  // ������
					concert.setEnd();
					break;
				default:
					System.out.println("�߸��Է��߽��ϴ�.");
				}
				if(concert.isEnd()) {
					System.out.println("��ǰ �ܼ�Ʈ ����ý����� �����մϴ�.");
					break;
				}
			}catch(Exception e) {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
			
		}
	}
	public static void concert1() {
		Concert1 concert = new Concert1(10);
		while(true) {
			switch(concert.getMenu1()) {
			case 1:  // ����
				int seat = concert.getMenu2();
				concert.show(seat-1);  // �¼�Ȯ��
				concert.reserve(seat-1);  // ����
				break;
			case 2:  // ��ȸ
				concert.show(Concert1.SEAT_S);
				concert.show(Concert1.SEAT_A);
				concert.show(Concert1.SEAT_B);
				System.out.println("<<<조회를 완료하였습니다.>>>");
				break;
			case 3:  // ���
				concert.cancel();
				break;
			case 4:  // ������
				concert.setEnd();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			if(concert.isEnd()) {
				System.out.println("명품콘서트홀 예약 시스템이 종료되었습니다.");
				break;
			}
		}
	}
}
