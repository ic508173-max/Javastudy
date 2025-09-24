package ch04.sec04;

public class FloatCounterExample {

	public static void main(String[] args) {
		for(int i = 1; i<=10; i++) {
			float x = i*0.1f; //부동소수점을 for문에 사용하지 않고 연산 결과를 float으로 변경
			System.out.printf("%.1f\n",x); //0.9에서 오류가 생기므로 1의 자리수까지만 출력되도록 오류 수정
		}

	}

}
