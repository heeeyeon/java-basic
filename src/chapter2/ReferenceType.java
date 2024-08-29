package chapter2;

public class ReferenceType {
	// 인스턴스 변수
	int x, y;
	
	// 생성자 (메서드처럼 보이지만 메서드 이름이 클래스와 같다, 리턴타입이 없다)
	// 인스턴스 변수를 초기화 하는 역할
	public ReferenceType(int newX, int newY) {
		// 수업에서 이해도를 높이기 위해(구분) 매개변수의 이름에 new를 붙임
		// 보통은 이름을 맞추고, 구분을 하기 위해서라면 this.x = newX;
		x = newX;
		y = newY;
	}
	public static void main(String[] args) {
		// 인스턴스 생성
		ReferenceType rt1 = new ReferenceType(10, 20);
		ReferenceType rt2 = new ReferenceType(30, 40);
		
		System.out.println("rt1x = "+rt1.x+", rt1y = "+rt1.y);
		System.out.println("rt2x = "+rt2.x+", rt2y = "+rt2.y);
	}
}
