package login;

import java.util.Scanner;

public class menu {
	public void menu() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("-------�޴�--------");
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		
		System.out.println("���Ͻô� ��ȣ�� ���ÿ�.");
		int num=scan.nextInt();
		
		if(num==1) {
			join join=new join();
			join.join();
			menu();
		}
		else if(num==2) {
			login login=new login();
			login.login();
			menu();
		}
	}
	
	public int loginMenu() {
		Scanner scan=new Scanner(System.in);
		System.out.println("-------�޴�---------");
		System.out.println("1. ȸ�� ���� ����");
		System.out.println("2. ȸ�� Ż��");
		int num=scan.nextInt();
		
		return num;
	}
}
