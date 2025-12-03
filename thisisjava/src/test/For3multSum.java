package test;

public class For3multSum {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i<100; i++)
		{
			if(i%3!=0)
				continue;
			sum += i;
		}
		System.out.println("1~100 정수 중 3의 배수의 합: "+sum);

	}

}
