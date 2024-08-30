package chapter3;

public class LableTest01 {
	public static void main(String[] args) {
		OUTER:
		for (int i = 1; i <= 10; i++) {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				System.out.print(ch+" ");
//				if(ch == 'g' && i == 3) break;
				if(ch == 'g' && i == 3) break OUTER;
			}	// inner for
			System.out.println();
		}	// outer for
	}
}
