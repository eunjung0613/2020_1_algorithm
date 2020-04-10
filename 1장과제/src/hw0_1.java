import java.util.Scanner;
public class hw0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("hw0_1 : 김은정");
		System.out.println("숫자 맞추기 프로그램입니다.");
		System.out.print("하나의 정수값을 입력하세요 : ");
		int first = scanner.nextInt();//정수값을 저장할 first int형 변수 선언 및 입력받기
		int i[] = {-30,-15,1,40,50,200,315,800,9000,12345};
		int degree1 [] = new int [10];
		int degree2 [] = new int [10];
		//컴퓨터가 오름차순으로 10개의 숫자를 저장할  i배열값과의 차이값을 저장할 degree 배열 선언
		for(int y=0;y<10;y++) {
			degree1[y] = first -i[y];
		}
		for(int z=0;z<10;z++) {
			if(degree1[z]<0) {degree2[z]= -degree1[z];} //차이값 양수로 변환
			else degree2[z] =degree1[z];
		}
		int min = degree2[0];
		for (int t=0;t<10;t++) {
			if(min>degree2[t]) {min = degree2[t];}
		}
		int grade = 100-min;
		if(grade < 0) {
			System.out.println("점수 = 0");
		}
		else System.out.println("점수  = "+grade);
	}

}
