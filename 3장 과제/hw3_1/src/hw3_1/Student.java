package hw3_1;

public class Student {
	private String name;//������ �Է¹ޱ� ����  ���ڿ� ����
	private int number; //�й��� �Է¹ޱ� ���� ������ ����
	private float grade; //������ �Է¹ޱ� ���� �Ǽ��� ����
	public Student(String name, int number, float grade) { //�� �޼ҵ� ȣ�� �� �� �̸��� �й� ������ Student class ���� private
		this.name = name;
		this.number = number;
		this.grade = grade;
	}
	public String getName() { //�л��� �̸��� ��� get�޼ҵ�
		
		return this.name; //return������ ���� Student�� �̸��� �ѱ�
	}
	public float getGrade() { // �л��� ������ ��� get�޼ҵ�
		return this.grade;//return������ ���� Student�� ������ �ѱ�
	}
}
