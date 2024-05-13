package java_ch06_0513;

public class Car2 {
	// 생성자 오버로딩 -> 매개변수가 다른 생성자 3개 선언.
	// 매개변수의 갯수나 타입이 다를 때만 적용. 순서만 바꾼다고 오버로딩 되지 않음.
	
	public Car2() { // 기본 생성자
		// 기본생성자 생략 -> 매개변수 없음.
		// 생성자는 매개변수가 다르면 다른 메서드로 취급 --> 여러개의 생성자를 만들 수 있음.		
	}
	
	public Car2(String company, String model,String color) {
		this.company = company;
		this.model = model;
		this.color = color;	
		//여기서 this는 밑에 있는 필드
		
	}
	
	public Car2(String company, String model,String color,int maxspeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;		
	}
	
	

	// 생성자
	// 회사, 모델명, 컬러, 최고속도 모두 생성자를 통하여 초기화 하도록 생성자를 작성하시오.
	// 생성자 작성 후 MainClass에서 Car2객체를 선언하시오.	
	String company;
	String model;
	String color;
	int maxspeed;
	Car car; //다른 클래스로 만든 객체도 필드로 사용가능.
	

}
