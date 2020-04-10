import java.util.Scanner;
public class hw0_2 {
	
	//2020_1학기 알고리즘 문제
	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw0_2 : 김은정");
		System.out.println("양의 정수 집합을 비교하는 프로그램입니다.");
		
		Scanner scanner = new Scanner(System.in); //입력을 위한 scanner 정의
		System.out.print("첫번째 집합을 입력하세요. 집합 입력을 마지려면 양이 아닌 정수를 입력하세요 : "); //첫번째 배열을 입력받기
		int [] base1 = new int[100]; //배열의 크기가 100인 base1 선언
		int [] base2 = new int [100];//배열의 크기가 100인 base2 선언
		for(int i=0;i<100;i++) //100의 크기만큼 for문을 돌면서
		{
			int j = scanner.nextInt(); //j를 입력받고
			if (j > 0) {//그 j가 0보다 큰 양의 정수라면 
				base1[i] = j; //i의 값에 j를 집어넣는다.
			}
			else break; //아니라면 스톱
		}
		
		System.out.print("두번째 집합을 입력하세요. 집합 입력을 마지려면 양이 아닌 정수를 입력하세요 : "); //두번째 배열을 입력받기
		for(int i=0;i<100;i++) //위와 같이 똑같은 방식으로 진행
		{
			int j = scanner.nextInt();
			if (j > 0) {
				base2[i] = j;
			}
			else break;
		}
		int first =0;//첫번째 배열 갯수 확인
		int second =0;//두번째 배열 갯수 확인
		int sum1 =0; //첫번째 배열의 값을 전부 더한 값을 저장할 sum1
		int sum2 =0; //두번째 배열의 값을 전부 더한 값을 저장할 sum2
		for(int i=0;base1[i]!=0;i++) { //for문을 돌면서 base1[i]의 값이 0 이 아닐때까지 i를 증가시킨다.
			first++;//first를 증가시키면 첫번째 배열의 갯수를 확인할 수 있다.
		}
		for(int i=0;base2[i]!=0;i++) { //for문을 돌면서 base2[i]의 값이 0이 아닐 때까지 i를 증가시킨다.
			second++;//second를 증가시키면 두번째 배열의 갯수를 확인할 수 있다.
		}
		if (first!=second) {System.out.println("두 집합은 서로 다릅니다.");} //만약 두 집합의 갯수가 같지 않을 때 두 집합은 서로 다르기 때문에 다름을 출력한다.
		else { // 만약 두 집합의 갯수가 서로 같다면
			for(int i=0;i<first;i++) { //첫번째 배열의 갯수만큼 for문을 돌려서
				sum1 += base1[i];//base1의 모든 배열의 값을 더한다.
			}
			for(int i=0;i<second;i++) { //두번째 배열의 갯수만큼 for문을 돌려
				sum2 += base2[i];//base2의 모든 배열의 값을 더한다.
			}
			if(sum1 == sum2) {System.out.println("두 집합은 같습니다.");} //만약 두 값이 같다면 두 집합은 같은 것이므로 두 집합은 같음을 출력한다.
			else {System.out.println("두 집합은 서로 다릅니다.");} // 만약 값이 다르다면 두 집합은 다르므로 두 집합은 다름을 출력한다.
		}
	}
}