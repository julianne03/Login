package login;

import java.util.Scanner;

public class delete {
	public void delete() {
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �� ���̵� �Է�: ");
		String userID=scan.next();
		
		userDAO userDAO=new userDAO();
		int result=userDAO.delete(userID);
		
		if(result==-1) {
			System.out.println("�����ͺ��̽� ������ �߻��߽��ϴ�");
		} else {
			System.out.println("�����Ǿ����ϴ�.");
		}
	}
 }
