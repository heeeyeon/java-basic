package chapter2;

public class IntegerType {
	// 접근제어자, 객체를 생성하지 않고도 호출 가능하다, 리턴타입,  메서드이름, 매개변수
	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i = 1000;
		// L을 넣지 않으면 에러 남 뒷부분(변수에 대입할 대상)이 정수형으로 인식되기 때문
//		long l = 10000000000;
		long l = 10000000000L;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
	}
}
