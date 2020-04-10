package hw3_2;
import java.util.Scanner;

import hw3_2.Student;

//***************************
//파일명: Selection.java
//작성자: 김은정
//작성일: 2020.04.09
//내용: 선택정렬 구현
//***************************

public class Selection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner (System.in); 
		System.out.println("hw3_2: 김은정 \n");
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
		
		int location = 0; // 배열의 위치를 표시하기 위한 location
		Student [] swap = new Student[1]; //가장 큰 값을 저장해둘 swap 배열 생성(이름이 가장 큰 사람이 뒤로 작은사람이 앞으로 가야 오름차순 정렬)
		String max = student[0].getName(); //0번째의 이름이 가장 크다고 가정.
		
		for(int i=n-1; i>=0;i--) { 
			// i는 배열의 마지막 값을 가르킨다.
			for(int j=0;j<i;j++) { //처음부터 끝까지 for문을 통한 큰 수 찾기
				if(max.compareTo(student[j].getName())<=0) { //max의 값과 compareTo를 사용하여 비교하여 값이 0보다 작거나 같으면 max가 더 앞에 있어야 하므로
					max = student[j].getName();//max의 값을 student[j]의 이름으로 바꾸고
					location = j;//max string의 배열 위치 location으로 초기화
				}
			}
			swap[0] = new Student(student[location].getName(),student[location].getId(),student[location].getscore()); //swap에 가장 큰 값을 저장
			student[location] = new Student(student[i].getName(),student[i].getId(),student[i].getscore());//그 위치로 맨 오른쪽 수를 옮긴다.
			student[i] = new Student(swap[0].getName(),swap[0].getId(),swap[0].getscore());//그 자리에 swap에 들어 있는 값을 다시 옮긴다.
		}
		System.out.println("\n"+"성명 오름차순 정렬 결과 = ");
		for(int i=0;i<n;i++) {
			System.out.println(student[i].getName()+" "+student[i].getId()+" "+student[i].getscore());
		}
	}

}
