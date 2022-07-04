package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MemberLogin {
	public void login() {
		System.out.println("아이디 : ");
		String id = Main.sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String pwd = Main.sc.nextLine();
		
		boolean isLogin = ProcessLogin(id,pwd);
		if(isLogin) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}

	private boolean ProcessLogin(String id, String pwd) {
			boolean result = false;
			File f = new File("C:\\dev\\member.txt");
			
			try (BufferedReader br = new BufferedReader(new FileReader(f));){
				while(true) {
					String data = br.readLine();
					if(data==null) break;
					if(data.length() < 2) continue;
					String[] idPwdArr = data.split(" ");
					String dataId = idPwdArr[0];
					String dataPwd = idPwdArr[1];
					result = dataId.equals(id) && dataPwd.equals(pwd);
					if(result) break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			} return result;
	} 
}
