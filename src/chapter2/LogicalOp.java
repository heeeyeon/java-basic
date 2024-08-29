package chapter2;

public class LogicalOp {
	public static void main(String[] args) {
		int i = 10;
		
		System.out.println(i != 0); // true
		System.out.println(100/i > 10); // false
		
		// 논리연산자) and연산 해 보기
		System.out.println((i != 0) && (100/i > 10)); // false
		
		// 논리연산자) or연산 해 보기
		System.out.println((i != 0) || (100/i > 10)); // true
		
		// 논리연산자) exclusive or
		System.out.println(i < 0); // false
		System.out.println(i == 10); // true
		System.out.println((i < 0) ^ (i == 10)); // true
		
		// 논리연산자) not연산자 (반전)
		System.out.println(!(i < 0)); // true

		// 이미지프로세싱에 주로 사용된다, 이미지 축소 특성추출 등
		// 소규모 마이크로에디션 프로그래밍?에 쓰임 웹 개발로 가면 별로 안쓰임
		// 공부를 더 하고싶으면 정처기할때 나오거나 컴공전공하면 나옴
		// 더 설명하면 머리아플 것
		// 비트연산자) &   이거 좀 어렵네  00000101 & 00000010
		System.out.println(5 & 2); // 0
		// 비트연산자) |   00000101 | 00000010
		System.out.println(5 | 2); // 7
		// 비트이동연산자...........................접할일 별로 없고 그냥 설명은 함
		// (비트데이터) >> (이동할 비트 수)  은 숫자가 작아짐 signed Right Shift (왼쪽비트는 부호비트로 채워넣는다 원래부호비트로 채움)
		// (비트데이터) >>> (이동할 비트 수)  은 숫자가 작아짐 unsigned Right Shift (왼쪽비트는 부호비트로 채워넣는다  무조건 0으로채움)
		// (비트데이터) << (이동할 비트 수)  은 숫자가 커짐 
		
		// 혼합연산자 (단항대입연산자)
		// 삼항연산자 (조건연산자)			// 물건의 매진여부를 판단한다고 했을때,  매진이면 구입불가 아니면 구입가능 이런 경우에 쓰일 수 있다.
		// 변수 = 조건식 ? 값1 : 값2		// 조건이 참일때 값 1 거짓일때 값 2
	}
}
