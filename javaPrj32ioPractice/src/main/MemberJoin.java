package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MemberJoin {
	
	public void join() {
		System.out.println("아이디 : ");
		String id = Main.sc.nextLine();
		
		System.out.println("비밀번호 : ");
		String pwd = Main.sc.nextLine();
		
		boolean isValid = cheakvalid(id,pwd);
		if(isValid) {
			saveData(id,pwd);
			System.out.println("회원가입 성공 !");
		}else {
			System.out.println("회원가입 실패");
		}
	}


	private	boolean cheakvalid(String id, String pwd) {
		if(2 > id.length()) return false;
		
		if(!cheakDup(id)) return false;
		
		if(4 > pwd.length()) return false;
		
		return true;
	}

	private boolean cheakDup(String id) {
		File f = new File("C:\\dev\\member.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(f));) {
			while(true) {
				String data = br.readLine();
				
				if(data == null) break;
				String idData = data.split(" ")[0];
				
				if(idData.equals(id)) {
					System.out.println("아이디 중복");
					return false;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return true;
	}
	

	private void saveData(String id, String pwd) {
		
		File f = new File("C:\\dev\\member.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));) {
			bw.write(id+" "+pwd+"\n");
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
