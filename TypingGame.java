import java.util.Scanner;

public class TypingGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] sentence = {"아이우에오", "나니누네노", "타치츠테토"};
		String[] input = new String[sentence.length];
		char[] c1 = {};
		char[] c2 = {};
		int sum = 0;
		
	//	System.out.println("Start Time = "+start);

		for(int i = 0; i < sentence.length; i++){
			long start = System.currentTimeMillis();
			System.out.printf("(%d/%d)%n", i+1, sentence.length);
			System.out.println(sentence[i]);
			input[i] = in.nextLine();
			c1 = sentence[i].toCharArray();
			c2 = input[i].toCharArray();
			long end = System.currentTimeMillis();
			sum = c2.length;
			for(int j=0; j < c1.length ; j++){
				if(c1[j] != c2[j])
					sum--;
			}//inner for/
			long speed = (c2.length*60)/((end-start)/1000);
			double accuracy = (((double)sum/c2.length)*100);
			System.out.printf("타자속도 : %d타/분, 정확도 : %.1f%%%n", speed, accuracy);
			System.out.println();
			sum = 0;
		}//outer for
	
	}//main
}//class
