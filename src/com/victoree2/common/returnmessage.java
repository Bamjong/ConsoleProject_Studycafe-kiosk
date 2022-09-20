package com.victoree2.common;
import java.util.HashMap;

import com.victoree2.main.ReadingRoom;

public class returnMessage {
	ReadingRoom room = new ReadingRoom();

	
	HashMap<String, String> kor_message = new HashMap<String, String>();
	HashMap<String, String> en_message = new HashMap<String, String>();
	

	
	void init() {
		kor_message.put("0000", "해당계정은 정지되었습니다.");
		kor_message.put("0001","1:로그인 2:회원가입 3:좌석보기 4:영어(toggle) 0:종료");
		kor_message.put("0002","1:마이페이지 2:정기권 예약 3:시간권 예약 4:스터디룸 예약 5:좌석보기 0:로그아웃");
		kor_message.put("0003","1:좌석현황 2:전체 회원 목록 3:회원검색 4:쿠폰관리 0:로그아웃");
		kor_message.put("0004","스터디 카페 방문을 환영합니다.^^;;");
		kor_message.put("0005","계정이 없습니다.");
		kor_message.put("0006","계정을 만들어 사용하시오.");
		kor_message.put("0007","관리자");
		kor_message.put("0008","아이디");
		kor_message.put("0009","입력");
		kor_message.put("0010","패스워드");
		kor_message.put("0011","계정을 생성하였습니다.");
		kor_message.put("0012","아이디와 패스워드를 입력하시오.");
		kor_message.put("0013","아이디/패스워드가 틀렸습니다.");
		kor_message.put("0014","파일이 존재하지 않습니다.");
		kor_message.put("0015","끝");
		kor_message.put("0016","파일을 읽을 수 없습니다.");
		kor_message.put("0017","나머지 예외 : ");
		kor_message.put("0018","종료");
		kor_message.put("0019","님께서 로그인 하였습니다.");
		kor_message.put("0020","잘못 선택하였습니다.");
		kor_message.put("0021","관리자 페이지에 접속하였습니다.");
		kor_message.put("0022","<<회원가입>>");		
		kor_message.put("0023","이름");
		kor_message.put("0024","생일(주민등록번호 앞의 6자리)");
		kor_message.put("0025","전화번호");
		kor_message.put("0026","1:비밀번호 변경 2:환불 0:뒤로가기");

		
//		kor_message.put("0023","생일");
//		kor_message.put("0023","생일");
//		kor_message.put("0023","생일");
//		kor_message.put("0023","생일");
		
		
		
		
		
		
		en_message.put("0000", "This account has been suspended.");
		en_message.put("0001", "1:Login 2:Membership 3:Seat View 4:Korean(Toggle) 0:End");
		en_message.put("0002","1: My Page 2: Regular Ticket Reservation 3: Time Ticket Reservation 4: Study Room Reservation 5: Seat View 0: Logout");
		en_message.put("0003","1: Seat status 2: All member list 3: Member search 4: Coupon management 0: Logout");
		en_message.put("0004","1: Welcome to the study cafe.^^;;");
		en_message.put("0005","There is no account.");
		en_message.put("0006","Please create an account.");
		en_message.put("0007","Amin");
		en_message.put("0008","ID");
		en_message.put("0009","PASSWORD");
		en_message.put("0010","INPUT");
		en_message.put("0011","You have successfully created an account.");
		en_message.put("0012","Enter your ID and password.");
		en_message.put("0013","Invalid ID/password.");
		en_message.put("0014","The file does not exist.");
		en_message.put("0015","END");
		en_message.put("0016","Unable to read file.");
		en_message.put("0017","Remaining exceptions:");
		en_message.put("0018","exit");
		en_message.put("0019","has logged in.");
		en_message.put("0020","You have selected the wrong one.");
		en_message.put("0021","You have accessed the Administrator page.");
		en_message.put("0022","<<SignUp>>");
		en_message.put("0023","Name");
		en_message.put("0024","Birthday (6 digits before resident registration number)");
		en_message.put("0025","PhoneNumber");
		en_message.put("0026","1:Change Password 2:Refund 0:Backward");
		
	}
	
	
	public String message(String language, String key) {
		init();
		String message="";
		if(room.language=="kor")
		{
			message = kor_message.get(key);
		}
		else {
			message = en_message.get(key);
		}
		return message;
	}
	
}
