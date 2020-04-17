package hw4_5;
//***************************
//파일명: Triangle.java
//작성자: 김은정
//작성일: 2020.04.10
//내용: 삼각형 클래스 구현
//***************************

public class Triangle implements Figure {
	private double width;
	private double height;
	
	public Triangle(double width,double height) {//setter함수 삼각형 높이와 밑변
		this.height = height;
		this.width = width;
	}
	public double getTriangleWidth() {//삼각형 밑변 getter함수
		return width;
	}
	public double getTriangleHeight() {//삼각형  높이 getter함수
		return height;
	}
	public double getArea() {//삼각형 면적 구하는 getArea() 추상에서 받아와서 구현.
		return Math.round(width*height*0.5*10000)/10000.0;
	}
	public String toString() {//toString 오버라이딩.
		return "삼각형 밑변="+getTriangleWidth()+"높이="+getTriangleHeight()+"면적="+getArea();
	}

}
