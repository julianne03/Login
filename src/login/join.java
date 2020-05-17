package login;
import java.util.Scanner;

public class join {
	public void join() {
		String userID;
		String userPassword;
		String gender;
		int age;

		Scanner scan=new Scanner(System.in);
		System.out.println("------회원가입------");
		System.out.println("아이디: ");
		userID=scan.next();
		System.out.println("비밀번호: ");
		userPassword=scan.next();
		System.out.println("성별: ");
		gender=scan.next();
		System.out.println("나이: ");
		age=scan.nextInt();
		
		if(userID==null || userPassword==null || gender==null || age==0) {
			System.out.println("입력이 안 된 사항이 있습니다.");
		}
		else {
			userDAO userDAO=new userDAO();
			int result=userDAO.join(userID,userPassword,gender,age);
			
			if(result==-1) {
				System.out.println("이미 존재하는 아이디입니다.");
			}
			else {
				System.out.println("회원가입 되셨습니다.");
			}
		}
		
	}
}
