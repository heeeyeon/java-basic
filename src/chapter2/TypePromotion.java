package chapter2;

public class TypePromotion {
	public static void main(String[] args) {
		double d = 10 / 3;
		// 피연산자의 데이터 타입이 중요함. 정수들의 연산은 결과가 정수가 나온다
		// 자동promotion이 일어났기 때문에 뒷부분이 잘렸지만 결과의 데이터타입은 double
		// 정수를 실수자료형의 변수에 대입한 상황
		System.out.println(d); // 3.0
		
		// 피연산자가 둘 중에 하나라도 double이면 결과도 double
		// 서로 다른 타입으로 
		// 실수자료형을 실수 자료형에 대입한 상황
		double d1 = 10 / 3d;
		System.out.println(d1);
		double d2 = 10.0 / 3;
		System.out.println(d2);
		
	}
}
