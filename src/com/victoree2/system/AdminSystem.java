package com.victoree2.system;




import java.util.Scanner;
import java.util.Set;

import com.victoree2.common.ActionInterface;
import com.victoree2.common.ReturnMessage;
import com.victoree2.main.ReadingRoom;


public class AdminSystem extends ReturnMessage implements ActionInterface{
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
		while ((key = selectMenu("0")) != 0) {
			switch (key) {
			case 1:
				selectAccount();
				break;
			case 2:
				selectAccount();
				break;
			case 3:
				//selectAccount(String id) scan통하여 원하는 id값 출력
				break;
			case 4:
				coupon();
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
	@Override
	public void pwdReset() { //패스워드 초기화
		
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
	public int selectMenu(String index) {
		if(index == "0")
			System.out.println(message(room.language, "0003"));
		else if(index == "01")
			System.out.println("양식");
		return Integer.parseInt(scan.nextLine());
	}

	
	
}
