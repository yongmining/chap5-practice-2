package chap05_section2_test;

public class test2 {

	public static void main(String[] args) {
		/* 가로와 세로 길이를 정수형으로 입력 받아
		 * 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
		 * 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
		 * 
		 * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고
		 * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후
		 * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
		 * 
		 * -- 입력 예시 --
		 * 가로 행의 수를 입력하세요 : 5
		 * 세로 열의 수를 입력하세요 : 4
		 * 
		 * -- 출력 예시 --
		 * F H Z G 
         * W F O T 
         * O R X V 
         * W H J X 
         * W S S J 
		 * */
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int index1; // 행 크기
		int index2; // 열 크기

		while (true) { // 행 크기가 정상 입력될 때 까지 반복

			System.out.print("가로 행의 수를 입력하세요 : ");
			index1 = sc.nextInt(); //행 수 입력

			if (index1 > 10 || index1 < 1) { //행 수가 1 ~ 10 사이가 아니면
				System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
				continue; //계속 돌고
			} else {
				break; // 정상 입력 되면 종료
			}
		}

		while (true) { // 열 크기가 정상 입력될 때 까지 반복
		//위와 동일

			System.out.print("세로 열의 수를 입력하세요 : ");
			index2 = sc.nextInt();

			if (index2 > 10 || index2 < 1) {
				System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
				continue;
			} else
				break;
		}

		char[][] arr = new char[index1][index2];
		//위에서 입력한 행과 열의 크기만큼의 문자형 배열 선언

		for(int i=0;i<arr.length;i++) { // 행 인덱스 범위에서
			for(int k=0;k<arr[i].length;k++) { // 열 인덱스 범위에서
				arr[i][k] = (char) (r.nextInt(26) + 'A'); // 0 ~ 25사이의 난수 + 'A'를 배열에 입력
			}
		}

	
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				System.out.print(arr[i][k] + " ");  //배열 출력
			}
			System.out.println();
		}

	}

}
