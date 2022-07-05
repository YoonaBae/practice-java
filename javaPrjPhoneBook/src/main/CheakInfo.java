package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheakInfo {
	
	public void inputName() {
		System.out.println("이름 : ");
		String name = Main.sc.nextLine();
		
		cheak(name);
	}

	private void cheak(String name) {
		
		File f = new File("C:\\dev\\phoneBook.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(f));) {
			String data = " ";
			while((data = br.readLine())!=null) {
				String[] namenum = data.split(" ");
				//사용자가 입력한 이름과 같다면 번호 주기
				if(namenum[0].equals(name)) {
					System.out.println(namenum[1]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
