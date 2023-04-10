package ch03;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[10];
		
		int b[]= {10,20,30,40,50}; //배열의 선언과 동시에 초기화
		
		int c[]= {1,2,3,4,5,6,7,8,9,10};
		
//		int c;
//		int d=10;
		a[5]=100;
		int k=b[4];
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		int count=0;
		for(int j=0;j<c.length;j++) {
			System.out.println(c[j]);
			count++;
		}
		System.out.println(count);
		
	}

}
