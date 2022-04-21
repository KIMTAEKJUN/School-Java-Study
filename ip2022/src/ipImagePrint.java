import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ipImagePrint {

	public static void main(String[] args) {
		String uri = "C:\\ipdata\\";  //�̹��� ������ �� �ִ� ���
		try {  //Ctrl+shift+O ��Ű�� �ڵ� ���Խ�Ű�� ����
			FileInputStream fis = new FileInputStream(uri + "img1.png"); //�Է� ���ϸ�
			FileOutputStream fos = new FileOutputStream(uri+"img2.png"); //��� ���ϸ�
			
			byte[] b = new byte[1000];
			int len;
			while((len = fis.read(b))!=-1) {     //fis.read(b) --> byte�� �о���̰� len�� ���� 
				fos.write(b,0,len);          // �о���� byte�� 0������ len ���� 
			}
			fos.flush();
			fos.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("���� ���� �߻�!");
		} catch (IOException e) {
			 System.out.println("�����ó�����ܹ߻�!");
		}finally {
			System.out.println("�������� �Ϸ�!");
		}
	}
}
