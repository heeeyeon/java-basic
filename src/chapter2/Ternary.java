package chapter2;

public class Ternary {
	public static void main(String[] args) {
		// 삼항연산자 (조건연산자)			// 물건의 매진여부를 판단한다고 했을때,  매진이면 구입불가 아니면 구입가능 이런 경우에 쓰일 수 있다.
		// 변수 = 조건식 ? 값1 : 값2		// 조건이 참일때 값 1 거짓일때 값 2

		int a = 10;
		int b = a < 9 ? 3 : 5;
		
		System.out.println(b);
	}
}
