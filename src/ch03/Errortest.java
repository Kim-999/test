package ch03;

public class Errortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=100;
		int b=0;
		double divide=0;
		
		try {
			divide=a/b;
		} catch(Exception e) {
			System.out.println("모든 수는 0으로 나눌 수 없습니다. 다시 확인하세요!!");
			e.printStackTrace();
		}
		
		
		System.out.println(divide);
		

	}

}
