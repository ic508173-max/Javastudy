package ch03.sec11;

public class ConditionalOpeartionExample {

	public static void main(String[] args) {
		int score = 85;
		char grade = (score>90) ? 'A' : ((score>80)?'B':'C'); 
		//90점 초과이면 A, 90이하 80초과이면 B, 80이하는 C
		System.out.println(score+"점은 "+grade+"등급입니다.");

	}

}
