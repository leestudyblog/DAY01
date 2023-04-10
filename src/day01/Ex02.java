package day01;

public class Ex02 {
	public static void main(String[] args) {
		/*escape 문자 : 문자열 안에서 특수한 기능을 하는 것.
		 * 문자열 : " " 큰따옴표로 묶여있는 값들
		 * \n : 역슬래시 엔터와 비슷한 역할 
		 * \t : tab(space 8칸정도) 만큼 오른쪽 이동
		 * \\ : \ 하나 표현
		 * \" : " 하나 표현
		 * */
		System.out.println("\"안녕하세요\"");
		System.out.println("1234\t567\t89");
		System.out.println("이름\t나이");
		System.out.println("홍길동\t22세");
		System.out.println("\\ 경로표현 시 많이 사용");
		System.out.println("\"큰 따옴표 오류 방지\"");
	}
}
