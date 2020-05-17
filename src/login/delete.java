package login;

import java.util.Scanner;

public class delete {
	public void delete() {
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제 할 아이디를 입력: ");
		String userID=scan.next();
		
		userDAO userDAO=new userDAO();
		int result=userDAO.delete(userID);
		
		if(result==-1) {
			System.out.println("데이터베이스 오류가 발생했습니다");
		} else {
			System.out.println("삭제되었습니다.");
		}
	}
 }
