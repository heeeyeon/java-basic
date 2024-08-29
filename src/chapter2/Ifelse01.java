package chapter2;

// 패키지 : 기능이 유사한 클래스들의 묶음
// 현재 클래스와 다른 패키지에 있는 클래스를 불러와서 사용하는 방법 import
// 이게 있으면 java.util 패키지 아래의 전체 클래스를 불러옴
import java.util.*;	
// Asterisk * == all
// Scanner 클래스 : 여러 입력장치로부터 데이터를 읽는 기능을 갖는 클래스
// 클래스를 사용한다? -> 객체를 만든다
import java.util.Scanner;

public class Ifelse01 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요:");
		// 스캐너 클래스의 생성자의 매개변수에는 입력장치에 대한 정보(객체)를 넣는다
		// System.in : 표준입력 장치에 대한 정보를 갖는 객체
		// System.out : 표준출력 장치에 대한 정보를 갖는 객체
		Scanner input = new Scanner(System.in); 	// input 변수는 이제 입력을 받기 위해 준비가 된 객체(를 참조를 가진변수)가 되었다!
		// Scanner 클래스 객체가 가진 nextInt라는 메서드를 부르기 위해 점 연산자를 사용하였다.
		int score = input.nextInt();
		
		System.out.println(score);
	}
}
