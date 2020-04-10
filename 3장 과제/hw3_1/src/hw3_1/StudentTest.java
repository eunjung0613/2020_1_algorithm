package hw3_1;
import java.util.Scanner;


public class StudentTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//***************************
		// 파일명: StudentText.java / pakage hw3_1
		// 작성자: 김은정
		// 작성일: 2020.04.06
		// 내용: 학생의 정보를 입력받아 전체 학생의 성적 평균 및 최고점 학생의 성명 출력
		//***************************
		Scanner scanner = new Scanner(System.in); //입력받기 위한 scanner 선언
		Student [] student; //student 배열 선언
		System.out.println("hw3_1 : 김은정");//과제의 이름
		System.out.print("학생수 입력: ");
		int first = scanner.nextInt(); //학생수 입력받기
		student = new Student[first];//객체의 배열을 위해 배열을 입력받은 학생 수 만큼 생성
		 System.out.println(first+"명의 학생 정보를 입력하세요: ");
		for (int i=0;i<first;i++) { //10명의 학생 정보를 초기화 하는 작업 for문
			String name = scanner.next(); // 이름을 입력
			int number = scanner.nextInt();// 학번 입력
			float grade = scanner.nextFloat();// 성적 입력
			student[i] = new Student(name,number,grade); //각 객체 배열을 초기화
		}
		float sum = 0; //성적의 총 합을 저장할 sum
		for (int i=0; i<first;i++) { //성적의 총합을 더하기 위한 for문
			sum += student[i].getGrade(); //getGrade()메소드를 사용해 sum에 더하기
		}
		float average = sum/first; //성적 평균을 내기 위한 average float 변수
		System.out.println("");
		System.out.println("성적 평균 = "+Math.round(average*100)/100.0); //math 함수를 사용하여 소수점 둘째 자리에서 반올림
		float max = student[0].getGrade(); //학생의 맨 처음 점수가 가장 크다고 가정
		String maxname = student[0].getName();//가장 높은 점수를 가진 
		for(int i=0;i<first;i++) {
			if (max<student[i].getGrade()) { //max 학생의 점수가 for문을 돌면서 차례가 된 사람의 점수보다 낮으면
				max = student[i].getGrade(); //max를 그 학생의 점수로 갱신
				maxname = student[i].getName(); // 이름도 그 학생의 이름으로 바꾸기
			}
		}
		System.out.println("");
		System.out.println("수석 학생 성명 = "+maxname); //수석 학생의 이름을 출력
		
	}

}
