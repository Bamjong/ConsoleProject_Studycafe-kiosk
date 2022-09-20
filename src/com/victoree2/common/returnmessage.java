package com.victoree2.common;
import java.util.HashMap;

import com.victoree2.main.ReadingRoom;

public class ReturnMessage {
	ReadingRoom room = new ReadingRoom();

	
	HashMap<String, String> kor_message = new HashMap<String, String>();
	HashMap<String, String> en_message = new HashMap<String, String>();
	

	
	void init() {
		kor_message.put("0000", "해당계정은 정지되었습니다.");
		kor_message.put("0001","1:로그인 2:회원가입 3:좌석보기 4:영어(toggle) 0:종료");
		kor_message.put("0002","1:마이페이지 2:정기권 예약 3:시간권 예약 4:스터디룸 예약 5:좌석보기 0:로그아웃");
		kor_message.put("0003","1:좌석현황 2:전체 회원 목록 3:회원검색 4:회원정지 5:매출현황 6:쿠폰관리 0:로그아웃");
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
		
		
		/*dhj*/
		kor_message.put("0051", "현재 스터디카페 좌석 현황입니다.");
		kor_message.put("0052", "전체 회원 목록을 조회합니다.");
		kor_message.put("0053", "회원검색합니다. \n검색할 회원의 이름을 입력하세요.");
		kor_message.put("0054", "1:현재 발행된 쿠폰 확인 2:쿠폰 추가 3:쿠폰 삭제 0:뒤로가기"); //
		kor_message.put("0055", "현재 사용가능한 쿠폰 목록입니다.");//쿠폰발행 1번 옵션
		kor_message.put("0056", "추가할 쿠폰의 번호와 할인율을 입력하세요. 추가를 원치 않으면 0을 입력하세요.");//쿠폰발행 2번 옵션
		kor_message.put("0057", "삭제할 쿠폰의 번호를 입력하세요. 삭제를 원치 않으면 0을 입력하세요.");//쿠폰발행 3번 옵션
		kor_message.put("0058","검색결과"); //회원검색결과
		kor_message.put("0059","1:회원 관리 2:회원입퇴실내역조회 3:분실계정 비밀번호 초기화 0:뒤로가기");//회원검색결과 옵션
		kor_message.put("0060","이 회원에게 경고를 줍니까? 1:예 2:뒤로가기");//1눌렀을 때
		kor_message.put("0061","경고를 주었습니다.");
		kor_message.put("0062","해당 회원의 입퇴실내역입니다.");//회원검색결과 2번옵션
		kor_message.put("0063","정말 비밀번호를 초기화하겠습니까? 0000으로 초기화됩니다. 1:예 2:뒤로가기");//회원검색결과3번옵션
		kor_message.put("0064","비밀번호가 초기화되었습니다.");//회원검색결과3번옵션-2
		/*dhj*/
		
		
		
		/*GBJ*/
		//정기권 예약
		kor_message.put("0100","몇주를 예약하시겠습니까?");//정기권예약
		kor_message.put("0101"," 1: 2주권(65,000원)\n 2: 4주권(99,000원)\n 3: 8주권(190,000원)\n 4: 뒤로가기");//각 65000 99000 190000
		kor_message.put("0102","결제하시겠습니까?"); // 1,2,3 선택시
		kor_message.put("0103"," 1:예  2:쿠폰이 있어요! 3:뒤로가기");
		
		 //1번 "예" 눌렀을 경우
		kor_message.put("0104","님의 권한이 부여되었습니다! 좌석을 선택해주세요"); //앞에 이름 붙혀주기
		 //2번 "쿠폰이 있어요!" 눌렀을 경우
		kor_message.put("0105","쿠폰번호를 입력해주세요.");
		kor_message.put("0106","(쿠폰)몇주를 예약하시겠습니까?");
		kor_message.put("0107"," 1: 2주권(45,500원)\n 2: 4주권(69,300원)\n 3: 8주권(133,000원)\n 4: 뒤로가기");//이후 104번 출력
		/*GBJ*/
		
		/*kdj*/
		kor_message.put("0200", "안녕하세요");
		kor_message.put("0201", "님!\n 회원님의 회원권은 ");
		kor_message.put("0202", "남았습니다. ");
		kor_message.put("0203"," 1:비밀번호 변경 \n 2:환불 \n 0:뒤로가기");
		kor_message.put("0204","현재 비밀번호를 입력하세요.");
		kor_message.put("0205","새 비밀번호를 입력하세요");
		kor_message.put("0206","비밀번호 변경이 완료되었습니다. ");
		kor_message.put("0207","환불 규정");
		kor_message.put("0208","정기권 환불의 경우 1일 기준 환불이 가능합니다.");
		kor_message.put("0209","시간권 환불의 경우 1시 기준 환불이 가능합니다.");
		kor_message.put("0210","회원님의 환불 가능 금액 :");
		kor_message.put("0211","환불하시겠습니까? \n 1. 예 \n 2. 뒤로가기");
		kor_message.put("0212","환불되었습니다. \n다음에 또 이용해주세요. \n감사합니다. ");
		kor_message.put("0213","");
		kor_message.put("0214","");
		kor_message.put("0215","");
		kor_message.put("0216","");
		kor_message.put("0217","");
		kor_message.put("0218","");
		/*kdj*/
		
		
		
		
		
		//////////영문////////////
		
		
		en_message.put("0000", "This account has been suspended.");
		en_message.put("0001", "1:Login 2:Membership 3:Seat View 4:Korean(Toggle) 0:End");
		en_message.put("0002","1: My Page 2: Regular Ticket Reservation 3: Time Ticket Reservation 4: Study Room Reservation 5: Seat View 0: Logout");
		en_message.put("0003","1: Seat status 2: All member list 3: Member search 4:Member Suspended 5:Sales status 6: Coupon management 0: Logout");
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
		
		
		
		
		
		/*ndy*/
		en_message.put("0051", "Viewing current seat.");
		en_message.put("0052", "Viewing the total members.");
		en_message.put("0053", "Searching a specific member. \n Enter the name of the member");
		en_message.put("0054", "1:Checking the coupons currently launched 2:add coupon 3:delete coupon 0:back"); //
		en_message.put("0055", "List of the currently available coupons");//쿠폰발행 1번 옵션
		en_message.put("0056", "Entering the coupon code and discount rate. If you don't want, enter the number 0");//쿠폰발행 2번 옵션
		en_message.put("0057", "Entering the coupon you want to delete. If you don't want, enter the number 0");//쿠폰발행 3번 옵션
		en_message.put("0058","Result of searching"); //회원검색결과
		en_message.put("0059","1:Membership management 2: Detail of check-in and out 3:Initialize missed password 0:back");//회원검색결과 옵션
		en_message.put("0060","Are you sure to give caution? 1:Yes 2:Back");//1눌렀을 때
		en_message.put("0061","Caution has been given");
		en_message.put("0062","The detail of entry and exit about this member");//회원검색결과 2번옵션
		en_message.put("0063","Are you sure to initialize the password? It is done by 0000  1:Yes 2:Back");//회원검색결과3번옵션
		en_message.put("0064","The password has been initialized");//회원검색결과3번옵션-2
		/*ndy*/
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
