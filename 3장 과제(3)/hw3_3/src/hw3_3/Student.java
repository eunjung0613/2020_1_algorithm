package hw3_3;

//***************************
//파일명: Student.java
//작성자: 첨부파일참조
//작성일: 2020.03.30
//내용: [hw3_1] 학생 배열 생성 과제
//***************************

public class Student {
	private String name;
	private int id;
	private double score;
	
	
	public Student(String name, int id, double score) {
		this.name = name;
		this.id = id;
		this.score = score;
	}

	public String getName() {	//이름 리턴
		return name;
	}
	public int getId() { //학번 리턴
		return id;
	}
	public double getscore() { // 성적 리턴
		return score;
	}
}