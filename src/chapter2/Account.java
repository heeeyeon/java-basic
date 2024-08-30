package chapter2;

// 무형의 객체인 계좌를 만들기 위한 클래스
public class Account {
	// 계좌번호 (문자열 형태의 자료)
	String accountNo;
	// 계좌 소유주 이름 (문자열 형태의 자료)
	String owner;		// 질문 String 자료형과 int 자료형 왜 대소문자차이?
	// 잔고 (정수 형태의 자료)
	int balance;
	
	// 생성자
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	// 입금 ver1
//	void deposit (int amount) {
//		balance = balance + amount;
//	}
	// 입금 ver2
	int deposit (int amount) {
		return balance = balance + amount;
	}

	boolean withdraw(int amount) {
		boolean result = false;	// 출금 결과를 저장 : 성공 -> true, 실패 -> false
		if (balance >= amount) {
			balance = balance - amount;
			result = true;
		}	//end if
		return result;
	}	// end method
}
