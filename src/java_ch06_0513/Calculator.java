package java_ch06_0513;

public class Calculator {
	
	public Calculator() {
		// 기본생성자 생략
	}
	// 필드와 메소드 선언
	
	// 속성 or 필드
	int firstNum; 
	int secondNum;
	
	// 메소드 선언
	// 파이썬에서 함수 만들 때, def add(firstNum,secondNum):
	// 						return firstNum + secondNum
	//					   add(10,20) -> 30
	
	// 접근지정자
	
		 // ↓ return 값의 타입을 적어줘야 함.****************************
	public int add(int first, int second) { //public 무조건 쓰기
		int sum = first + second;
		return sum;
	}
	
	public int sub(int first, int second) {
		return first - second;		
	}
	
	public int mul(int first, int second) {
		return first * second;		
	}
	
	public int divid(int first, int second) {
		return first / second;		
	}
	
	
	// 제곱 연산
	public int pow(int number) {
		return number * number;		
	}
	public int pow(int number, int number2) {//매개변수가 다르면 가능(메소드 오버로딩)
		return number * number;		
	}
	
	//***************************************************

	// main 함수가 아닌 class는 실행할 수 였음
	// class는 설계도로 생각하면 됨.
	
	//***************************************************	
	
	
}
