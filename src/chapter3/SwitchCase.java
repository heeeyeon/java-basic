package chapter3;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.print("분류코드를 입력하세요 :");
		Scanner input = new Scanner(System.in);	// 자동임포트 소개
		int code = input.nextInt();	
		
		// 자동완성 및 탭키로 입력란 이동 소개
		switch (code) {
		case 1:
			System.out.println("제육볶음입니다.");
			break;
		case 2:
			System.out.println("돈까스입니다.");
			break;
		case 3:
			System.out.println("회덮밥입니다.");
			break;
		case 4:
			System.out.println("김치찌개입니다.");
			break;
		case 5:
			System.out.println("라면정식입니다.");
			break;

		default:
			System.out.println("또 뭐 있지");
			break;
		}
	}
}
