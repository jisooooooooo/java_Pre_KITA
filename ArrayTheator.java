import java.util.Scanner;

class Theator2{//static을 써야하는 것인가?
	int[][] seats = new int[7][7];
	
	
	void show(){
		System.out.println("현재의 예약 상태는 다음과 같습니다.");
		System.out.println("--------------------------------------------------------------------");
		System.out.print("    ");
		for(int i=1; i < 8; i++){
			System.out.printf("%4d", i);
		}//행번호 출력 for
		System.out.printf("%n--------------------------------------------------------------------%n");
			for(int j=0; j < seats.length; j++){
				System.out.printf("%d | ", j+1);
				for(int i=0; i < seats[0].length; i++){
					System.out.printf("%4d", seats[j][i]);
				}
				System.out.println();
			}
		System.out.println();
	}//메서드 괄호

}//클래스 괄호



public class ArrayTheator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Theator2 theator = new Theator2();
		
		while(true){
			System.out.print("좌석을 예약하시겠습니까?(yes or no)  ");
			String y = in.next();
			if(y.equalsIgnoreCase("no") == true) 
				break;

			while(true){			
				System.out.print("몇개의 좌석을 예약하시겠습니까? ");
				int num = in.nextInt();
				for(int t = 0;t <num ; t++){
					System.out.printf("[%d번째 자리 예약]%n", t+1);
					System.out.print("행값 입력 : ");
					int i = in.nextInt();
					System.out.print("열값 입력 : ");
					int j = in.nextInt();
					if(theator.seats[i-1][j-1] == 0){
							theator.seats[i-1][j-1] = 1;
							System.out.println("좌석이 성공적으로 예약되었습니다.");
							System.out.println();
					} else{
						System.out.printf("%d행 %d열 자리는 예약할 수 없습니다. 다른 좌석을 입력해 주세요. %n", i, j);
						t--;
					}//좌석 예약여부 확인 조건문
				}//좌석 갯수 for문
				theator.show();
			}
		}//좌석 예약 여부 확인 while문 탈출
	
	}//메인문
}//클래스