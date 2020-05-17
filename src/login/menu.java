package login;

import java.util.Scanner;

public class menu {
	public void menu() {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("-------메뉴--------");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		
		System.out.println("원하시는 번호를 고르시오.");
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
		System.out.println("-------메뉴---------");
		System.out.println("1. 회원 정보 수정");
		System.out.println("2. 회원 탈퇴");
		int num=scan.nextInt();
		
		return num;
	}
}
