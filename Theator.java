import java.util.Scanner;

public class Theator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int[] seats = new int[10];
	
		while(true){
			System.out.print("Do you want to make reservation in our theator? Press 1 or 0(1: continue, 0: quit) : ");
			int yes = in.nextInt();
			if (yes == 1){
				System.out.printf("%nWhat seat do you want? ");
				int seatNo = in.nextInt();
				if(seats[seatNo-1] == 1){
					while(true){
						System.out.printf("%d seat is already occupied. Please choose other seats. ", seatNo);
						seatNo = in.nextInt();
						if(seats[seatNo-1] == 0)
							break;
					}//중복여부 확인 while
						seats[seatNo-1] = 1;
					System.out.println("Reservation complete");
					System.out.println("--------------------------------------------------------------------");
					for(int i=1; i < 11; i++)
						System.out.printf("%4d", i);
						System.out.printf("%n--------------------------------------------------------------------%n");
					for(int i=0; i < seats.length; i++)
						System.out.printf("%4d", seats[i]);
						System.out.println();
						System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}//중복인 경우		
				else{
					seats[seatNo-1] = 1;
					System.out.println("Reservation complete");
					System.out.println("--------------------------------------------------------------------");
					for(int i=1; i < 11; i++)
						System.out.printf("%4d", i);
						System.out.printf("%n--------------------------------------------------------------------%n");
					for(int i=0; i < seats.length; i++)
						System.out.printf("%4d", seats[i]);
					System.out.println();
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}//중복이 아닐 경우
			}else
				break;//yes if
			}//while
	}//main
}
