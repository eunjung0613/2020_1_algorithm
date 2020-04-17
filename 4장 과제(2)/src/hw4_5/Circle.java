package hw4_5;
//***************************
//파일명: Circle.java
//작성자: 김은정
//작성일: 2020.04.10
//내용: 원 클래스(도형 인터페이스 구현)
//***************************

public class Circle implements Figure {
	private double round;
	public Circle(double round) {//원의 반지름을, set
		this.round = round;
	}
	
	public double getRound() { //원의 반지름, get
		return round;
	}
	public double getArea() {
		return Math.round(3.14*round*round*10000)/10000.0; //Math.round로 소수점 4번째에서 반올림.
	}
	public String toString() {//toString 오버라이딩을 통해 호출 시 출력
		return "원 반지름="+getRound()+"면적="+getArea();
	}
}
