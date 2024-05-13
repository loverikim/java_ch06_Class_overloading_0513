package java_ch06_0513;

public class Student {
	
	// 기본생성자와 이름만 매개변수로 가진 생성자 1
	
	// 이클립스에 자동생성 기능이 있음. 
	public Student() {// 기본 생성자
		super();// 부모클래스의 생성자 호출
		
	}		
	
	public Student(String name, String hakbun, int age, String grade, String address) {
		super();
		
		// 생성자 초기화
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}
	
	public Student(String name, String hakbun, int age, String grade) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
		this.grade = grade;
	}
	// 객체들은 배열에 못 넣기 때문에 리스트로 담아서 보냄.
	// 리스트 --> 객체들을 묶는데 사용함.


	// 학생 한명이 갖는 내용. 
	String name;
	
	String hakbun;
	int age;
	String grade;
	String address;
	
	// 리턴값이 없을 경우.
	public void printName() {//리턴겂이 없는 메소드 -> void
		System.out.println("학생이름:" + this.name);
		
	}
	

}
