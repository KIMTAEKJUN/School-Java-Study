import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class ipTextPrint {

	public static void main(String[] args) throws IOException {
		// ���ڿ� ����ϱ�
		System.out.println("�����ڵ�������б�");
		System.out.println("�ڵ���IT�а�");  //sysout + Ctrl+Space
		System.out.println("��û��");
		//���� �� ���� ���
		System.out.println(2022);
		System.out.println(2022+1004);
		//���ڿ��� ����
		System.out.println("������ ����\n"+36.5+20);
		//���İ� ���ڿ�
		System.out.println(36.5+20+"\n������ ����");
		System.out.println(2022+"��"+3+"��"+30+"��\n������");
		//���� ���
		int year, month, day;
		year=2022; month=3; day=30;
		System.out.println(year+"��"+month+"��"+day+"��\n������");
		
		int age, height, weight; //����, Ű, ������ ������ ����
		String name = new String(); //�̸��� ������ ����
/*
		Scanner scan = new Scanner(System.in);  //ǥ���Է� ��ü ����
		//Ctrl+Shift+O
		
		System.out.print("���̸� �Է��Ͻÿ�=> ");
		age = scan.nextInt();  //������ �Է� �޾Ƽ� ���� age������ ����
		System.out.print("Ű�� �Է��Ͻÿ�=> ");
		height = scan.nextInt(); 
		System.out.print("�����Ը� �Է��Ͻÿ�=> ");
		weight = scan.nextInt(); 
		System.out.print("�̸��� �Է��Ͻÿ�=> ");
		name = scan.next(); //���ڿ��� �Է� ����
		
		// age, height, weight, name�� ����� ������ ȭ�鿡 ����Ͻÿ�.
		
		System.out.println("-------------------------------------------");
		System.out.println("name\tage\theight\tweight");		
		System.out.println("-------------------------------------------");		
		System.out.println(name+"\t"+ age+"\t"+height+"\t"+weight);	
		
		String data = new String();
		data = name+"\t"+ age+"\t"+height+"\t"+weight;
		System.out.println(data);
		
		try {   //Ŭ���� �ڵ� ���Խ�Ű�� Ctrl+Shift+O
		    OutputStream output = new FileOutputStream("c:/ipdata/Output1.txt");
		    byte[] by=data.getBytes();
		    output.write(by);
				
		} catch (Exception e) {
	            e.getStackTrace();
		}
	
		
		try {   //Ŭ���� �ڵ� ���Խ�Ű�� Ctrl+Shift+O
		    OutputStream output = new FileOutputStream("c:/ipdata/Output1.txt");
		    byte[] by=data.getBytes();
		    output.write(by);
				
		} catch (Exception e) {
	            e.getStackTrace();
		}
		
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("c:/ipdata/Output2.txt"));
			bos.write(data.getBytes()); //Byte�����θ� ���� �� ����

		} catch (Exception e) {
	            e.getStackTrace();
		}finally {
			bos.close();
		} 		
		
*/		
	try{   //���� ��ü ����
		        File file = new File("c:/ipdata/output1.txt");
		         //�Է� ��Ʈ�� ����
		        FileReader fr = new FileReader(file);
		         int cur = 0;
		         System.out.println("-----------------------------");
		         System.out.println("���Ϸ� ���� �о ȭ�鿡 ����ϱ�");
		         System.out.println("-----------------------------");
		         while((cur = fr.read()) != -1){
		            System.out.print((char)cur);
		           }
		         System.out.println();
		         fr.close();
		 } catch (FileNotFoundException e) {
		            e.getStackTrace();
	}	
	
	//���۸� �̿��� �����б�, ȭ�� ���	
	try {
		  // ����Ʈ ������ �����б�
		 String filePath = "c:/ipdata/output1.txt"; // ��� ����
		 FileInputStream fileStream = null; // ���� ��Ʈ��
		        
		 fileStream = new FileInputStream( filePath );// ���� ��Ʈ�� ����
		 //���� ����
		 byte[ ] readBuffer = new byte[fileStream.available()];
		 while (fileStream.read( readBuffer ) != -1){ //���� ������ ���۷� �о��
		 }
		 System.out.println(new String(readBuffer)); //���

		  fileStream.close(); //��Ʈ�� �ݱ�
		} catch (Exception e) {
			e.getStackTrace();
	    }
		
			
	}
}
