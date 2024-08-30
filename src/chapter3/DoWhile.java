package chapter3;

public class DoWhile {
	 public static void main(String[] args) {
		int num = 100;
		
		do {	// do 블록의 내용이 일단 실행됨.
			num++;
			System.out.println(num);
		} while (num < 100);
	}
}
