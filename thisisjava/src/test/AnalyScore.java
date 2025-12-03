package test;

import java.util.Scanner;

public class AnalyScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int[] scores=null;
		
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수입력 | 3. 점수리트스 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.print("선택> ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				System.out.print("학생수> ");
				String studentNum = scanner.nextLine();
				scores = new int[Integer.parseInt(studentNum)];	
			} else if(strNum.equals("2")) {
				for(int i = 0; i<scores.length; i++) {
					System.out.print("scores["+i+"]: ");
					String studentScore = scanner.nextLine();
					scores[i] = Integer.parseInt(studentScore);
				}
			} else if(strNum.equals("3")) {
				for(int i = 0; i<scores.length; i++)
				{
					System.out.println("scores["+i+"]: "+scores[i]);
				}
			} else if(strNum.equals("4")) {
				int max = scores[0];
				int sum = 0;
				double avg=0;
				for(int i = 0; i<scores.length; i++) {
					if(max<scores[i])
						max = scores[i];
					sum+=scores[i];
					avg = (double)sum/scores.length;
				}
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
				
			} else if(strNum.equals("5"))
				run = false;
			
			
			
		}
		System.out.println("종료");
		

	}

}
