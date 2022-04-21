import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		int answer;
		int num;
		Scanner scan = new Scanner(System.in);  //ǥ���Է� ��ü ����
		Random rd = new Random();
		answer = rd.nextInt(100)+1;
		
		while(true) {
		  System.out.println("1-100���̰� �� �κ��� ������ ���� ���߾� ������ => ");		
		  num = scan.nextInt();
		
		  if(answer == num) {
		      System.out.println("���� :"+ answer);
		      break;
		      }
		  else if(answer > num)
			    System.out.println("UP !!!");
		  else
		        System.out.println("Down !!!");
		}
	}
}


