package login;
import java.util.Scanner;

public class login {
	
		public void login() {
			Scanner scan=new Scanner(System.in);
			System.out.println("------로그인------");
			String userID;
			String userPassword;

			System.out.println("아이디를 입력: ");
			userID=scan.next();
			System.out.println("비밀번호를 입력: ");
			userPassword=scan.next();
			
			userDAO userDAO=new userDAO();
			//user user=new user();
			int result=userDAO.login(userID,userPassword);
			if(result==1) {
				System.out.println("로그인 되셨습니다.");
				menu me=new menu();
				int num=me.loginMenu();
				
				if(num==1) {
					update up=new update();
					up.update();
				}
				else if(num==2) {
					delete de=new delete();
					de.delete();
				}
			}
			else if(result==0) {
				System.out.println("비밀번호가 틀립니다.");
			}
			else if(result==-1) {
				System.out.println("존재하지 않는 아이디입니다. ");
			}
			else if(result==-2) {
				System.out.println("데이터베이스 오류가 발생했습니다.");
			}
		}
}

