package hw4_4;

//***************************
//파일명: GetArea.java
//작성자: 김은정
//작성일: 2020.04.10
//내용: 도형 인터페이스 정의
//***************************

public interface Figure {
	public double width = 0; 
	public double height = 0;
	default double getArea() { //도형의 인터페이스에 getArea()를 abstract로 정의.
		return width*height;
	}
	
}
