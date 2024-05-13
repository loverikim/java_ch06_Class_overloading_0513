package java_ch06_0513;

public class Test {
	
	public int sum1(int[]values){//매개변수로 배열도 올 수 있음.
		return 10;
	}
	public int sum2(Car car){
		return 10;
	}
	
	public int sum3(int a) {
		if (a > 10) {
			return 10;			
		}else {
			return 100;
		}
	}
	
	// 리턴값이 없는 메소드
	public void sum4(int a) {
		if (a>10) {
					
		}else {
			return;
		}
	}
	
	int a = sum3(10); //클래스 내부에서도 메소드 호출 가능
	
	
}
