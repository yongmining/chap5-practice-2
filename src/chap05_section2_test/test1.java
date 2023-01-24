package chap05_section2_test;

public class test1 {

	public static void main(String[] args) {
		/* 행의 길이가 3, 열의 길이가 4인 정수형 2차원 배열을 선언 및 할당하고,
		 * 각 인덱스에 차례대로 1부터 12까지의 정수를 대입한 뒤
		 * 그 값을 출력하는 코드를 작성하시오. 
		 * 
		 * -- 출력 예시 --
		 * 1  2  3  4
		 * 5  6  7  8
		 * 9 10 11 12
		 * 
		 * 단, 출력물의 줄맞춤은 신경쓰지 말고 풀어보세요
		 * */
		
		int[][] arr = new int[3][4]; // 3 X 4 크기의 2차원 배열 선언 

		int value = 1; //입력할 값

		for (int i = 0; i < arr.length; i++) { // 배열의 행 인덱스 범위 중
			for (int k = 0; k < arr[i].length; k++) // 각 행의 열 인덱스 범위에서
				arr[i][k] = value++; //값 입력
		}

		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				System.out.print(arr[i][k] + " ");  //위와 동일한 범위에서 출력
			}
			System.out.println();
		}

	}

}
