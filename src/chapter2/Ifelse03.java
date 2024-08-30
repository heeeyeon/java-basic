package chapter2;

public class Ifelse03 {
	public static boolean doSomeThing()	{
		return true;
	}
	public static void main(String[] args) {
		if(doSomeThing()) {
			System.out.println("실행완료!");
		} else {
			System.out.println("실행오류!");
		}
	}
}
