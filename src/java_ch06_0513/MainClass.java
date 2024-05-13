package java_ch06_0513;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 설계도를 사용해서 집을 짖는 작업
		// 설계도를 사용해서 객체를 선언 -> 실물을 만듦, 메모리에 만들어진 실제 객체(instance) 생성.
        int a;
		Calculator cal1 = new Calculator();//운명 타입 자체가 클래스 이름.
		// Calculator 클래스로 new 연산자를 사용하여 cal1 객체를 생성				
		// RAM(메모리)에 cal1  객체가 생성됨.		
		// Calculator cal2 = new Calculator();
		
		a = cal1.add(100, 200);		
		
		System.out.println(a);
		
		cal1.pow(10); //100
		
		Car car = new Car(4); // Car 클래스로 car라는 객체를 선언
		
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
		
	}

}
