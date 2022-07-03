package main;


import guest.Guest;
import guide.Guide;
import io.IO;


public class Main {

	public static void main(String[] args) {
		System.out.println("========= 예약 =========");
		
		//사용자 입력 받기
		Guide guide = new Guide();
		Guest guest = guide.delivery();
		
		//예약자정보 파일에 출력
		IO io = new IO();
		io.outputGuest(guest.toString());
		
		//예약한 순서
		int result = io.count();
		System.out.println(result+"번째 예약자입니다.(*예약 확인할 때 필요한 번호*)");
		
		//예약확인
		System.out.println("======== 예약 확인 ========");
		result = guide.cheak();
		io.ReadLine(result);
		
		//예약자 전체
		System.out.println("======== 예약자 명단========");
		//Input
		io.inputGuest();
		
		
	}

}
