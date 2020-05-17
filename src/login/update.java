package login;

import java.util.Scanner;

public class update {
	public void update() {
		Scanner scan=new Scanner(System.in);
		String userID;
		String userPassword;
		String gender;
		int age;
		
		System.out.println("수정할 회원의 아이디 입력: ");
		userID=scan.next();
		System.out.println("비밀번호: ");
		userPassword=scan.next();
		System.out.println("성별: ");
		gender=scan.next();
		System.out.println("나이: ");
		age=scan.nextInt();
		
		userDAO userDAO=new userDAO();
		int result=userDAO.update(userID,userPassword,gender,age);
		
		if(result==-1) {
			System.out.println("데이터베이스 오류가 발생했습니다");
		} else {
			System.out.println("수정되었습니다.");
		}
		
	}
 }
