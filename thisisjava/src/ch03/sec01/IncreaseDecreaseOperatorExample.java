package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		x++; //x = 11이 됨
		++x; // 다른 연산이 없으므로 x=12가 됨 
		System.out.println("x="+x); //x=12 출력
		
		System.out.println("---------------------------");
		y--; //y=9
		--y; //y=8
		System.out.println("y="+y); //y=8 출력
		
		System.out.println("---------------------------");
		z=x++; //z=12으로 초기화
		System.out.println("z="+z); //z=12 출력
		System.out.println("x="+x); //x=13 출력
		
		System.out.println("---------------------------");
		z=x++; //z=13으로 초기화
		System.out.println("z="+z); //z=13 출력
		System.out.println("x="+x); //x=14 출력
		
		System.out.println("---------------------------");
		z=++x + y++; //z=15+8=23 
		System.out.println("z="+z); //z=23 출력
		System.out.println("x="+x); //x=15 출력
		System.out.println("y="+y); //y=9 출력
	}

}
