package hw4_5;

//***************************
//파일명: FigureSortService
//작성자: 김은정
//작성일:2020.04.17
//내용: 정렬 관련 기능을 모아놓은 클래스
//***************************

public class FigureSortService {

	public static void mergeSort(Figure[] a) {
		// TODO Auto-generated method stub
		int min=0;//초기값
		int size = a.length-1; //배열의 길이를 가져오기
		mergeSort(a,min,size);//mergeSort를 진행.(호출) 
	
	}
	public static void mergeSort(Figure[] a,int min, int max) {
		if(min<max) {
			int middle = (min+max)/2; //중간값 저장
			mergeSort(a,min,middle);//mergeSort를 다시 호출 가운데로 나눈다. 가운데 기준으로 왼쪽 값
			mergeSort(a,middle+1,max);//가운데 기준으로 오른쪽 값.
			merge(a,min,middle,max);//병합 과정을 거친다.
		}
	}
	private static void merge(Figure[] figureArray, int min, int middle, int max) {
		// TODO Auto-generated method stub
		int i = min;//min 값을 저장
		int m = middle+1;//가운데 다음 값을 저장
		int middle2 = (min+max)/2;//가운데 값을 저장
		int t = min;//temp를 위한 min값
		Figure[] temp = new Figure[figureArray.length];//복사하기 위한 temp를 배열 크기만큼 생성
		while(i<=middle2||m<=max) {//가운데 값 기준으로 왼쪽값과 오른쪽 값이 전부 정렬될 때까지
			if(m>max||(i<=middle2&&figureArray[i].getArea()<figureArray[m].getArea())) {//정렬 진행
				temp[t++] = figureArray[i++];
			}else {temp[t++]=figureArray[m++];}
		}
		for(int x=min;x<=max;x++) {//정렬 후 배열을 복사.
			figureArray[x] = temp[x];
		}
	}
}
