package study;

public class ControlTest {

	public static void main(String[] args) {
		
		//1~100�� ���� ���ϴ� ���α׷� �����1
		
		long sum=0, i;  //Overflow ���� ó���� ���� longŸ�� ����
		
		for(i=1; i<=1000000;i++)
			sum = sum+i;		
		System.out.println(sum);
		
		//1~100�� ���� ���ϴ� ���α׷� �����2
		long n=1000000,sum2; //Overflow ���� ó���� ���� longŸ�� ����	
		sum2=(n*(n+1))/2;
		System.out.println(sum2);
		
		
		// 1~100�� ���� ���߿� ¦���� ��, Ȧ�� �� ���� ���ؼ� ����ϱ�
		// ���?  ¦���� : 250000500000, Ȧ���� : 250000000000
		long sum3=0,sum4=0;  //Overflow ���� ó���� ���� longŸ�� ����
		
		for(i=1; i<=1000000;i++)
			if(i%2==0)
			 sum3 = sum3+i;
			else
			 sum4 = sum4+i;
		
		System.out.println("¦���� :"+ sum3);
		System.out.println("Ȧ���� :"+ sum4);
	
		
		// 1~10�� ���� ���߿� 7�� ������ 9�� ������� ������ ���ؼ� ����ϱ� 		
		// ���?  714264285
		long sum5=0;
		for(i=1; i<=100000;i++)
			if(i%7==0 || i%9==0)
			 sum5 = sum5+i;	
		System.out.println("7�ǹ��, 9�ǹ���� �� :"+ sum5);
	
	}
}






