package login;

import java.util.Scanner;

public class update {
	public void update() {
		Scanner scan=new Scanner(System.in);
		String userID;
		String userPassword;
		String gender;
		int age;
		
		System.out.println("������ ȸ���� ���̵� �Է�: ");
		userID=scan.next();
		System.out.println("��й�ȣ: ");
		userPassword=scan.next();
		System.out.println("����: ");
		gender=scan.next();
		System.out.println("����: ");
		age=scan.nextInt();
		
		userDAO userDAO=new userDAO();
		int result=userDAO.update(userID,userPassword,gender,age);
		
		if(result==-1) {
			System.out.println("�����ͺ��̽� ������ �߻��߽��ϴ�");
		} else {
			System.out.println("�����Ǿ����ϴ�.");
		}
		
	}
 }
