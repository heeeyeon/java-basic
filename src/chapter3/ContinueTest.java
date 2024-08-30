package chapter3;

public class ContinueTest {
	public static void main(String[] args) {
		int num = 0;
		// 홀수일때만 프린트 하기
		while (num < 100) {
			num++;
			if (num % 2 == 0) continue;
			
			System.out.println("num = " + num);
		}
//		
//		for (int i = 0; i <= 100; i++) {
//			if (i < 50 && i > 30) continue;
//			System.out.println("i = " + i);
//			
//		}
//
	}
}
