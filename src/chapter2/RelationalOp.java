package chapter2;

public class RelationalOp {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		String x = new String("hello World");
		String y = new String("hello World");
		
		System.out.println(a==b); // true
		// x와y의 참조를 비교
		// (포인터를 비교, 리모컨을 비교, 두 변수에 다른 리모컨이 들어있다)
		// new 
		System.out.println(x==y); //  (false) 
		// x와y가 (가진 참조가 가리키는) 참조하는 객체 안의 값을 비교
		System.out.println(x.equals(y)); // true
		
		// 문자열 상수법을 이용해 실제 값을 이용해 대입을 하게 되면
		// 새로 객체를 생성하지 않고 기존에 만들어져있는 같은 값을 가진 객체를 참조(참조를 갖게)하게끔 선언된다.
		String x1 = "hello World";
		String y1 = "hello World";
		System.out.println(x1 == y1); // true
		// 문자열의 내용이 바뀌면 참조하고있는 객체의 실제 값을 바꾸는 것이 아니라
		// 새로운 객체가 생성되며 해당 객체를 참조(를 갖게)하게 된다.
		x1 = x1 + "!";

		System.out.println(x1 == y1); // false
		
	}
}
