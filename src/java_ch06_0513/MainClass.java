package java_ch06_0513;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 설계도를 사용해서 집을 짖는 작업
		// 설계도를 사용해서 객체를 선언 -> 실물을 만듦, 메모리에 만들어진 실제 객체(instance) 생성.
        int a;
        double b;
		Calculator cal1 = new Calculator();//운명 타입 자체가 클래스 이름.
		// Calculator 클래스로 new 연산자를 사용하여 cal1 객체를 생성				
		// RAM(메모리)에 cal1  객체가 생성됨.		
		// Calculator cal2 = new Calculator();
		
		a = cal1.add(100, 200);		
		b = cal1.divid(10, 3);
		
		System.out.println(a);
		
		cal1.pow(10); //100
		
		// new 연산자
		Car car = new Car(4); // Car 클래스로 car라는 객체를 선언
		//new 연산자 생성자를 호출 반환타입 써주지 않아도 됨 public car()가 생략되어 있음 
		
		System.out.println(car.company);
		car.speed = 150;
		
		System.out.println(car.speed);
//		car.price[0];
		System.out.println(car.price[0]);
		
		System.out.println(car.tire);
		
		Car car2 = new Car(2);
		Car2 car3 = new Car2("포르쉐","911 터보 카브리올레","화이트", 500);
		System.out.println(car3.company);


		Car2 car4 = new Car2("포르쉐","911 터보 카브리올레","화이트");
		Car2 car5 = new Car2();//,기본 생성자를 쓰기 위해서는 Car2 class에서 작성을 해줘야 함.
		
		Test test = new Test();
		//test.sum1(null);null에 들어가는 값이 배열
		int[] arrTest = {1,2,3,4,5};
		test.sum1(arrTest);
		test.sum2(car2);		
		
		System.out.println();
		
		PrinterExample printer = new PrinterExample();
		printer.println(10);
		printer.println(true);
		printer.println(4.6);
		printer.println("박서준");
		
		Student stu1 = new Student();
		
		Student stu2 = new Student(null, null, a, null);
		// 멤버값들을 초기화할 때 사용.
				
		Worker worker1 = new Worker("홍길동", 27, "010-1234-5678", "서울시 용산구");
		//메모리에 Worker객체가 만들어 지고 안에 값이 메모리에 저장됨 
		
	}

}
