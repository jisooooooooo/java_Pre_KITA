import java.util.Scanner;

class Theator2{//static�� ����ϴ� ���ΰ�?
	int[][] seats = new int[7][7];
	
	
	void show(){
		System.out.println("������ ���� ���´� ������ �����ϴ�.");
		System.out.println("--------------------------------------------------------------------");
		System.out.print("    ");
		for(int i=1; i < 8; i++){
			System.out.printf("%4d", i);
		}//���ȣ ��� for
		System.out.printf("%n--------------------------------------------------------------------%n");
			for(int j=0; j < seats.length; j++){
				System.out.printf("%d | ", j+1);
				for(int i=0; i < seats[0].length; i++){
					System.out.printf("%4d", seats[j][i]);
				}
				System.out.println();
			}
		System.out.println();
	}//�޼��� ��ȣ

}//Ŭ���� ��ȣ



public class ArrayTheator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Theator2 theator = new Theator2();
		
		while(true){
			System.out.print("�¼��� �����Ͻðڽ��ϱ�?(yes or no)  ");
			String y = in.next();
			if(y.equalsIgnoreCase("no") == true) 
				break;

			while(true){			
				System.out.print("��� �¼��� �����Ͻðڽ��ϱ�? ");
				int num = in.nextInt();
				for(int t = 0;t <num ; t++){
					System.out.printf("[%d��° �ڸ� ����]%n", t+1);
					System.out.print("�ప �Է� : ");
					int i = in.nextInt();
					System.out.print("���� �Է� : ");
					int j = in.nextInt();
					if(theator.seats[i-1][j-1] == 0){
							theator.seats[i-1][j-1] = 1;
							System.out.println("�¼��� ���������� ����Ǿ����ϴ�.");
							System.out.println();
					} else{
						System.out.printf("%d�� %d�� �ڸ��� ������ �� �����ϴ�. �ٸ� �¼��� �Է��� �ּ���. %n", i, j);
						t--;
					}//�¼� ���࿩�� Ȯ�� ���ǹ�
				}//�¼� ���� for��
				theator.show();
			}
		}//�¼� ���� ���� Ȯ�� while�� Ż��
	
	}//���ι�
}//Ŭ����