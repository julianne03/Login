package login;
import java.util.Scanner;

public class join {
	public void join() {
		String userID;
		String userPassword;
		String gender;
		int age;

		Scanner scan=new Scanner(System.in);
		System.out.println("------ȸ������------");
		System.out.println("���̵�: ");
		userID=scan.next();
		System.out.println("��й�ȣ: ");
		userPassword=scan.next();
		System.out.println("����: ");
		gender=scan.next();
		System.out.println("����: ");
		age=scan.nextInt();
		
		if(userID==null || userPassword==null || gender==null || age==0) {
			System.out.println("�Է��� �� �� ������ �ֽ��ϴ�.");
		}
		else {
			userDAO userDAO=new userDAO();
			int result=userDAO.join(userID,userPassword,gender,age);
			
			if(result==-1) {
				System.out.println("�̹� �����ϴ� ���̵��Դϴ�.");
			}
			else {
				System.out.println("ȸ������ �Ǽ̽��ϴ�.");
			}
		}
		
	}
}
