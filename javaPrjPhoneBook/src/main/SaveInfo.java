package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SaveInfo {
	File f = new File("C:\\dev\\phoneBook.txt");
	
	public void inputNameNum() {
		//이름 전화번호 입력받기
		System.out.println("이름 : ");
		String name = Main.sc.nextLine();
		
		System.out.println("전화번호 : ");
		String num = Main.sc.nextLine();
		//전화 번호 중복 검사
		
		boolean isCheak = cheakNum(num);
		if(isCheak) {
			save(name,num);
			System.out.println("저장 완료");	
		}
		
	}
	private boolean cheakNum(String num) {
		
		if(num.length() != 11) {
			System.out.println("Wrong Number");
			return false;
		}
		
		if(!cheakNumRead(num)) return false;
		
		return true;
		
		
	}
	public boolean cheakNumRead(String num) {
	
		try(BufferedReader br = new BufferedReader(new FileReader(f));){
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				String dataNum = data.split(" ")[1];
				if(dataNum.equals(num)) {
					System.out.println("이미 저장된 번호입니다.");
					return false;
				}
				
			}
		}catch(IOException e) {
			e.getStackTrace();
		} return true;
	}
	
	public void save(String name, String num) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));){
			
			bw.write(name+" "+num+"\n");
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
