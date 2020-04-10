package hw3_1;

public class Student {
	private String name;//성명을 입력받기 위한  문자열 변수
	private int number; //학번을 입력받기 위한 정수형 변수
	private float grade; //성적을 입력받기 위한 실수형 변수
	public Student(String name, int number, float grade) { //이 메소드 호출 시 각 이름과 학번 성적을 Student class 안의 private
		this.name = name;
		this.number = number;
		this.grade = grade;
	}
	public String getName() { //학생의 이름을 얻는 get메소드
		
		return this.name; //return값으로 현재 Student의 이름을 넘김
	}
	public float getGrade() { // 학생의 성적을 얻는 get메소드
		return this.grade;//return값으로 현재 Student의 성적을 넘김
	}
}
