package chapter2;

public class BankTest {
	public static void main(String[] args) {
		// 참조형 변수 선언(타입 변수명)
		// new 객체를 생성하는 키워드, 생성하고자 하는 객체의 생성자()
		Account a1 = new Account("11-11", "홍길동", 100);
		Account a2 = new Account("11-12", "사오정", 500);
		// 객체를 이용해서 변수와 메서드를 호출하는 방법
		// 객체이름.변수명, 객체이름.메서드명
		// (점 연산자라고도 부른다. 객체안의 요소를 꺼내올 수 있게하는 연산자)
		// 소유격이라고 표현할 수 있겠음
		a1.deposit(100); // 객체의 요소(인스턴스 변수)에 값을 대입함
		System.out.println(a1.accountNo + " : " + a1.balance);
	}
}
