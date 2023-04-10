package day01;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println(100);
		System.out.println(100.123);
		
		System.out.println(100+100);
		System.out.println(100.123 + 100.123);
		
		System.out.println("백 : " + 100);// 이건 숫자로서의 100
		System.out.println("백 : 100");
		
		System.out.println("100"); // 이건 문자로서의 100 일반 연산 X
		System.out.println("100" +100+100);// +은 우선순위가 같아서 "100" +100이 먼저 출력
		System.out.println("100" +(100+100));//문자열과 함께 사용할 때는 소괄호 사용
		
		
		
	}

}
