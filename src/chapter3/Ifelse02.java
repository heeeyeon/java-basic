package chapter3;

public class Ifelse02 {
	public static void main(String[] args) {
		boolean isFind = false;
		
		// 검색로직
		// 검색 결과가 있으면 isFind를 true로 변경
		isFind = true;
		
		if (isFind) {
			System.out.println("검색결과가 있습니다.");
		} else {
			System.out.println("검색결과가 없습니다.");
		}
	}
}
