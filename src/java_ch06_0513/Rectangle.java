package java_ch06_0513;

public class Rectangle {	
	
	// 생성자는 필수, 일반 메소드 오버로딩은 선택 / 오버라이딩은 필수!!!
	public int areaRetangle(int width){ //반환타입은 나중에 써도 됨.
		return width * width; // 정사각형
	}
	
	public int areaRetangle(int width, int height){ //반환타입은 나중에 써도 됨.
		return width * height; // 직사각형
	}
	
}
