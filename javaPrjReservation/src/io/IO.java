package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import guest.Guest;

public class IO {
	
	File f = new File("C:\\dev\\guestInfo.txt");
	// 예약자 파일에 출력
	public void outputGuest(String guest) {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f,true))){
			bw.write(guest+"\n");
			bw.flush();
			System.out.println("예약 완료 !");
		}catch(IOException e) {
			System.out.println("파일 출력 중 예외 발생");
			System.out.println("에러 메시지 ::: "+ e.getMessage());
		}
		
	}
	//몇 번째 예약자인지 알려주기
	public int count() {
		int linecnt = 0;
		try(BufferedReader br = new BufferedReader(new FileReader(f))) {
			while(br.readLine() != null) {
				linecnt++;
			}
		}catch(IOException e) {
			e.getStackTrace();
		}
		return linecnt;
	}
	
	//예약 확인
	public void ReadLine(int line) {
		Path path = Paths.get("C:\\dev\\guestInfo.txt");
	
		try {
			 List<String> allLines = Files.readAllLines(path);
			 String booker = allLines.get(line-1);
			 System.out.println(booker);
		
		}catch(Exception e) {
			System.out.println("예약자 명단에 없습니다.");
		}
		
	}
	//예약자 명단
	public void inputGuest() {

		try(BufferedReader br = new BufferedReader(new FileReader(f))){
			String s = "";
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
		}catch (IOException e) {
			System.out.println("파일 입력 중 예외 발생");
			System.out.println("에러 메시지 ::: "+e.getMessage());
		}
	}
	
}
