package hw5_1;
import java.util.Scanner;
//***************************
//파일명: InsertionSort.java
//작성자: 김은정
//작성일: 2020.04.23
//내용: 선택 알고리즘을 이용하여 중앙값인 정수값을 찾는 프로그램
//***************************

public class InsertionSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("hw5_1 : 김은정");
		System.out.print("\n정수갯수 입력: ");
		
		int num1 = s.nextInt();
		
		System.out.print(num1+"개의 정수 입력:  ");
		int [] number = new int[num1];
		for(int i=0;i<num1;i++) {
			number[i] = s.nextInt();
		}
		for(int i=1;i<num1;i++) { //1번부터 n번까지 정렬과정
			int loc = i-1; //i-1값을 저장
			int newItem = number[i];//i값을 newItem값에 저장
			
			while(loc>=0 && newItem<number[loc]) {//number[1~i-1]까지 이미 정렬되어 있으므로 비교과정을 통해 자리를 바꾼다.
				number[loc+1] = number[loc];
				loc--;
			}
			number[loc+1] = newItem;
		}
		if(num1%2==1) { //홀수일 때 중앙 값 출력
			int mid = ((num1-1)/2);
			System.out.println("중앙값 = "+number[mid]);
		}
		else { //짝수일 때 중앙값 출력
			int mid = (num1/2)-1;
			System.out.println("중앙값 = "+number[mid]);
		}
	}

}
