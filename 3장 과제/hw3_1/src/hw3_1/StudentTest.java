package hw3_1;
import java.util.Scanner;


public class StudentTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//***************************
		// ���ϸ�: StudentText.java / pakage hw3_1
		// �ۼ���: ������
		// �ۼ���: 2020.04.06
		// ����: �л��� ������ �Է¹޾� ��ü �л��� ���� ��� �� �ְ��� �л��� ���� ���
		//***************************
		Scanner scanner = new Scanner(System.in); //�Է¹ޱ� ���� scanner ����
		Student [] student; //student �迭 ����
		System.out.println("hw3_1 : ������");//������ �̸�
		System.out.print("�л��� �Է�: ");
		int first = scanner.nextInt(); //�л��� �Է¹ޱ�
		student = new Student[first];//��ü�� �迭�� ���� �迭�� �Է¹��� �л� �� ��ŭ ����
		 System.out.println(first+"���� �л� ������ �Է��ϼ���: ");
		for (int i=0;i<first;i++) { //10���� �л� ������ �ʱ�ȭ �ϴ� �۾� for��
			String name = scanner.next(); // �̸��� �Է�
			int number = scanner.nextInt();// �й� �Է�
			float grade = scanner.nextFloat();// ���� �Է�
			student[i] = new Student(name,number,grade); //�� ��ü �迭�� �ʱ�ȭ
		}
		float sum = 0; //������ �� ���� ������ sum
		for (int i=0; i<first;i++) { //������ ������ ���ϱ� ���� for��
			sum += student[i].getGrade(); //getGrade()�޼ҵ带 ����� sum�� ���ϱ�
		}
		float average = sum/first; //���� ����� ���� ���� average float ����
		System.out.println("");
		System.out.println("���� ��� = "+Math.round(average*100)/100.0); //math �Լ��� ����Ͽ� �Ҽ��� ��° �ڸ����� �ݿø�
		float max = student[0].getGrade(); //�л��� �� ó�� ������ ���� ũ�ٰ� ����
		String maxname = student[0].getName();//���� ���� ������ ���� 
		for(int i=0;i<first;i++) {
			if (max<student[i].getGrade()) { //max �л��� ������ for���� ���鼭 ���ʰ� �� ����� �������� ������
				max = student[i].getGrade(); //max�� �� �л��� ������ ����
				maxname = student[i].getName(); // �̸��� �� �л��� �̸����� �ٲٱ�
			}
		}
		System.out.println("");
		System.out.println("���� �л� ���� = "+maxname); //���� �л��� �̸��� ���
		
	}

}
