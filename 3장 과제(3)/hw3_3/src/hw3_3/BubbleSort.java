package hw3_3;
import java.util.Scanner;
//***************************
//파일명: BubbleSort.java
//작성자: 김은정
//작성일: 2020.04.10
//내용: 버블정렬 구현
//***************************

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner (System.in); 
		System.out.println("hw3_3: 김은정 \n");
		System.out.print("학생 수 입력 : ");
		
		int n=scanner.nextInt(); //학생 수 입력
		
		Student [] student = new Student[n];
		
		System.out.println("\n"+n+"명의 학생정보를 입력하세요: ");
		for(int i=0;i<n;i++) { 
			String name = scanner.next();
			int id = scanner.nextInt();
			double score = scanner.nextDouble();
			
			student[i] = new Student(name,id,score); //학생 배열 초기화
		}
		Student [] swap = new Student[1]; //swap을 저장하기 위한 값
		int last = n; //배열의 마지막 값을 줄이기 위해 사용
		for(int j=0;j<last;j++) {
			for(int i=0;i<last-1;i++) {//i가 마지막까지 돌아가면 그 다음값과 비교할 때 오류가 발생하므로 last-1보다 작을때 까지 비교.
				if(student[i].getscore()<student[i+1].getscore()) {//만약 인접한 두 배열의 점수 비교시 앞에 있는 배열의 점수가 낮으면 swap 진행
					swap[0] = new Student(student[i].getName(),student[i].getId(),student[i].getscore());
					student[i] = new Student(student[i+1].getName(),student[i+1].getId(),student[i+1].getscore());
					student[i+1] = new Student(swap[0].getName(),swap[0].getId(),swap[0].getscore());
				}
			}
			last--;//한번의 정렬 비교 끝난 후 맨 뒤의 값을 제외시키기 위해 last 값 줄이기.
		}
		System.out.println("\n"+"성적 내림차순 정렬 결과 = ");
		for(int i=0;i<n;i++) {
			System.out.println(student[i].getName()+" "+student[i].getId()+" "+student[i].getscore());
		}
	}

}
