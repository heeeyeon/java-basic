package chapter3;

import java.util.Scanner;

public class CheckMaxDays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("년도를 입력하세요:");
		int year = input.nextInt();
		System.out.println("월을 입력하세요:");
		int month = input.nextInt();
		
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(month+"월은 31일까지 있습니다.");
			break;
		case 4, 6, 9, 11:
			System.out.println(month+"월은 30일까지 있습니다.");
			break;
		case 2:
			// 윤년인 경우에는 29일까지, 평년인 경우에는 28일까지
			/*
			 * 서력 기원 연수가 4로 나누어 떨어지는 해는 윤년으로 한다. 
			 * (1988년, 1992년, 1996년, 2004년, 2008년, 2012년, 2016년, 2020년, 2024년, 2028년, 2032년, 2036년, 2040년, 2044년 ...)
			 * 서력 기원 연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다. 
			 * (1900년, 2100년, 2200년, 2300년, 2500년...)
			 * 서력 기원 연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다. 
			 * (2000년, 2400년...)
			 */
			if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
				System.out.println(month+"월은 29일까지 있습니다.");
			} else {
				System.out.println(month+"월은 28일까지 있습니다.");
			}
			
			
			boolean leapYear = false;
			
			if (year % 4 == 0) {	//4로 나누어 떨어지면 윤년
				if (year % 100 == 0) {	// 4로 나누어 떨어진 뒤 100으로 나누어 떨어지면 평년
					leapYear = year % 400 == 0; // 4, 100, 400으로 나누어 떨어지면 윤년
				} else {	// 4로 나누어 떨어진 뒤 100으로 나누어 떨어지지 않으면 윤년
					leapYear = true;	// 윤년이기 때문에 true 넣어 리턴
				} 
			} else {	// 4로 나누어 떨어지지 않으면 평년
				leapYear = false;
			}
			System.out.println(month+"월은 28일까지 있습니다.");
			break;
		default:
			System.out.println("월 입력 오류!");
			break;
		}
	}
}
