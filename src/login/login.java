package login;
import java.util.Scanner;

public class login {
	
		public void login() {
			Scanner scan=new Scanner(System.in);
			System.out.println("------�α���------");
			String userID;
			String userPassword;

			System.out.println("���̵� �Է�: ");
			userID=scan.next();
			System.out.println("��й�ȣ�� �Է�: ");
			userPassword=scan.next();
			
			userDAO userDAO=new userDAO();
			//user user=new user();
			int result=userDAO.login(userID,userPassword);
			if(result==1) {
				System.out.println("�α��� �Ǽ̽��ϴ�.");
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
				System.out.println("��й�ȣ�� Ʋ���ϴ�.");
			}
			else if(result==-1) {
				System.out.println("�������� �ʴ� ���̵��Դϴ�. ");
			}
			else if(result==-2) {
				System.out.println("�����ͺ��̽� ������ �߻��߽��ϴ�.");
			}
		}
}

