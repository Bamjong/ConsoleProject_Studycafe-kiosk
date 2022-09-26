package com.victoree2.system;




import java.util.Scanner;
import java.util.Set;

import com.victoree2.common.ActionInterface;
import com.victoree2.common.returnMessage;
import com.victoree2.main.ReadingRoom;


public class AdminSystem extends returnMessage implements ActionInterface{
	Scanner scan = new Scanner(System.in);
	ReadingRoom room = new ReadingRoom();
	ReadingRoomFactory factory;
	Set<String> userMap;
	

	public AdminSystem(Set<String> userMap) {
		this.userMap = userMap;
		this.factory = new ReadingRoomFactory();
	}
	@Override
	public void run() {
		System.out.println(message(room.language, "0021"));
		
		int key=0;
		while ((key = selectMenu(0)) != 0) {
			switch (key) {
			case 1:
				selectAccount();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				System.out.println(message(room.language, "0018"));
				System.exit(0);
				break;
			default:
				System.out.println(message(room.language, "0020"));
				break;
			}
		}

	}


	public void selectAccount(String id) {
		//특정회원 조회
	}
	
	public void userManager() {//회원관리(경고)
		
	}
	public void inoutSeat() { // 회원 입퇴실 내역조회
		
	}
	public void pwReset() { //패스워드 초기화
		
	}
	public void coupon() {//쿠폰
		
	}
	@Override
	public void selectAccount() {
		//회원 전부 조회
		for(String value : userMap) {
			System.out.println(value.toString());
		}
	}
	
	@Override
	public void paymentCancel() {
		//관리자는 회원 환불.
		
	}

	@Override
	public void checkSeat() {
		//전체좌석을 확인할 수 있다.
		
	}
	@Override
	public int selectMenu(int index) {
		System.out.println(message(room.language, "0003"));
		return Integer.parseInt(scan.nextLine());
	}

	
	
}
