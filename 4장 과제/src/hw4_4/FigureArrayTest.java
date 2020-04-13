package hw4_4;
import java.util.Scanner;

//***************************
//파일명:FigureArrayTest.java
//작성자:김은정
//작성일:2020.04.10
//내용:메인 클래스 구현
//***************************

public class FigureArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("hw4_4: 김은정");
		System.out.print("\n"+"원 갯수 입력: ");
		int n1 = s.nextInt();
		System.out.print("삼각형 갯수 입력: ");
		int n2 = s.nextInt();
		int sum = n1+n2; //총 도형의 갯수
		Figure [] figureArray = new Figure[sum];
		
		System.out.println("\n"+n1+"개의 원 정보(반지름)를 입력하세요:");
		for(int i=0;i<n1;i++) {
			double round = s.nextDouble();
			figureArray[i] = new Circle(round);
		}
		System.out.println("\n"+n2+"개의 삼각형 정보(밑변과 높이)를 입력하세요:");
		for(int i=n1;i<sum;i++) {
			double width = s.nextDouble();
			double height = s.nextDouble();
			figureArray[i] = new Triangle(width,height);
		}
		
		System.out.println("\n"+sum+"개의 도형 정보와 면적 =");
		for(int i=0;i<sum;i++) {
			System.out.println(figureArray[i].toString());
		}

	}

}
