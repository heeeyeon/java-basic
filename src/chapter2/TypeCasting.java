package chapter2;

public class TypeCasting {
	public static void main(String[] args) {
		double d = 10.1;
		// int i = d;	// error
		// 캐스팅 : (변환하려는 데이터 타입, 작은컵) 변환 대상의 값 또는 변수
		int i = (int)d;
		
		// 큰 컵의 내용물을 작은컵에 옮겨담음으로서 넘치는 부분이 잘려나감
		System.out.println(i);	// 10
		
		// 무리한 강제 형변환(캐스팅)을 하게되면 데이터의 손실이 발생한다.
		byte b = (byte)128;
		System.out.println(b);	// -128
		
	}
}
