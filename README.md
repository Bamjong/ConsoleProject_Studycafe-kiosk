# 22년 9월 20일 오후

## 오후 추가

다영

- ReturnMessage 관리자 부분 메시지 만들기
- 관리자 메시지들 영어 번역
- AdminSystem 스위치 문에 관리자가 입력한 키 값에 해당하는 입력문 출력
- 체크리스트 만들기

현정

- ReturnMessage 관리자 부분 메시지 만들기
- AdminSystem 에서 specificUser()
- List<AccountData> selectAccount(String name)
- userManager(AccountData user)
- selectMenu(String index) 메소드 만들기

범종

- seasonReservation() 정기권 예약 메소드 만들기
- timeReservation() 시간권 예약 메소드 만들기
- payment() 결제 페이지 & 쿠폰 먹일것인지
- paymentFinal() 최종 결제 페이지 만들고 좌석 선택하게 만들기






### 내일 해야할 것

[관리자]
1. Calendar -> 환불, 회원 검색 시 남은 시간 조회 가능
2. 좌석 배열 만들기 (ArrayList 3개)
3. 매출 현황
4. 좌석 이동
5. 관리자 계정 정규표현식으로
6. 관리자가 쿠폰 코드 발행 - 사용자가 입력하는 쿠폰 번호와 일치하는지 확인하는 기능 (ArrayList)
7. 등록되는 회원 계정 마다 직렬화 & 역직렬화 -> 관리자가 회원 정보 조회 가능 하도록

[유저]

1. 입력된 쿠폰과 맞으면 할인된 가격으로 결제하기
2. 좌석선택 메뉴 추가
3. 입실퇴실 토글
4. 환불페이지 환불 금액 계산
5. 전화번호 수정



## 내가 한것

<br>

<details>
<summary> 코드 </summary>

```java

UserSystem.java

/GBJ/
	// 변수
	private int paymentpoint = -1;  //아래 pay 배열값 포인터
	private boolean payStatus; // false = 정기권   true = 시간권 
	
	private String paymentSeason[] = {"65,000", "99,000","190,000"};		//시즌권
	private String paymentSeasonCoupon[] = {"45,500","69,300","133,000"};	//쿠폰 시즌권
	private String paymentTime[] = {"3,000","5,000","8,000","10,000","12,000"};		//시간권
	private String paymentTimeCoupon[] = {"2,300","3,500","5,600","7,000","8,400"}; //쿠폰 시간권
	/GBJ/



while ((key = selectMenu("0")) != 1) {
			switch (key) {
			case 1:
				myPage();
				break;
			case 2:
				payStatus = false;
				seasonReservation();
				break;
			case 3:
				payStatus = true;
				timeReservation();
				break;
			case 4:
				//미지정.
				break;
			case 5:
				checkSeat();
				break;
			case 0:
				System.out.println(message(room.language, "0018"));
				System.exit(0);
			default:
				System.out.println(message(room.language, "0020"));
				break;
			}
		}



/GBJ/
	//정기권 예약 메소드
	public void seasonReservation(){
		while ((key = selectMenu("02")) != 0) {
			switch (key) {
			
			case 1: //2주권
				paymentpoint = 0;
				payment(); //payment() 이동
				break;
				
			case 2:// 4주권
				paymentpoint = 1;
				payment(); //payment() 이동
				break;
				
			case 3:// 8주권
				paymentpoint = 2;
				payment(); //payment() 이동
				break;
				
			
			default:
				System.out.println(message(room.language, "0020"));
				break;
			}
		}
		
	}
	/GBJ/
	
	/GBJ/
	//시간권 예약 메소드
	public void timeReservation() {
		while ((key = selectMenu("03")) != 0) {
			switch (key) {
			
			case 1: //2주권
				paymentpoint = 0;
				payment(); //payment() 이동
				break;
				
			case 2:// 4주권
				paymentpoint = 1;
				payment(); //payment() 이동
				break;
				
			case 3:// 8주권
				paymentpoint = 2;
				payment(); //payment() 이동
				break;
				
			case 4:// 8주권
				paymentpoint = 3;
				payment(); //payment() 이동
				break;
			
			case 5:// 8주권
				paymentpoint = 4;
				payment(); //payment() 이동
				break;
				
			
			default:
				System.out.println(message(room.language, "0020"));
				break;
			}
		}
	}
	/GBJ/
		
	/GBJ/
	// 결제 할것인지 or 쿠폰 먹일것인지
		public void payment() { 
			while ((key = selectMenu("021")) != 0) {
				switch (key) {
				
				case 1:
					paymentFinal();
					break;
				case 2:
					// 쿠폰 창
					break;
					
				
				
				default:
					System.out.println(message(room.language, "0020"));
					break;
				}
			}
		} 
	/GBJ/
	
	/GBJ/
	//최종결제 후 좌석결제
	public void paymentFinal() {
		while ((key = selectMenu("0211")) != 0) {
			switch (key) {
			
			case 1:
				//좌석선택 메뉴 추가해주기
				break;
				
				
			default:
				System.out.println(message(room.language, "0020"));
				break;
			}
		}
	}
	/GBJ/


    /GBJ/
		// selectMenu 메소드
		else if(index == "02")
			System.out.printf(message(room.language, "0100"), paymentSeason[0],paymentSeason[1],paymentSeason[2]); //정기권 가격 출력
		else if(index == "03")
			System.out.printf(message(room.language, "0108"), paymentTime[0],paymentTime[1],paymentTime[2],paymentTime[3],paymentTime[4]); //시간권 가격 출력
		else if(index == "021") 
			System.out.printf(message(room.language, "0102"), payStatus == false ? paymentSeason[paymentpoint] : paymentTime[paymentpoint]);  // 무슨 권이냐에 따라 가격 출력
		else if(index == "0211")
			System.out.printf(message(room.language, "0104"), userStatus.getId(), payStatus == false ? "" : "\n 0: 뒤로가기 ");  // 아이디 출력 후 시즌권에 따라 뒤로가기 다르게 출력
		/GBJ/


ReturnMessage.java

/GBJ/
		//정기권 예약
		kor_message.put("0100","몇주를 예약하시겠습니까? \n 1: 2주권(%s원) \n 2: 4주권(%s원) \n 3: 8주권(%s원) \n 0: 뒤로가기 \n");//정기권예약
	
		kor_message.put("0102","%s원 결제하시겠습니까? \n 1:예  2:쿠폰이 있어요! 0:뒤로가기 \n"); // 1,2,3 선택시
		
		 //1번 "예" 눌렀을 경우
		kor_message.put("0104","%s 회원님의 권한이 부여되었습니다! 좌석을 선택해주세요 %s \n"); //앞에 이름 붙혀주기
		 //2번 "쿠폰이 있어요!" 눌렀을 경우
		kor_message.put("0105","쿠폰번호를 입력해주세요.");
		kor_message.put("0106","(쿠폰)몇주를 예약하시겠습니까?");
		kor_message.put("0107"," 1: 2주권(%s원)\n 2: 4주권(%s원)\n 3: 8주권(%s원)\n 0: 뒤로가기 \n");//이후 104번 출력
		kor_message.put("0108"," 1: 2시간(%s원)\n 2: 4시간(%s원)\n 3: 7시간(%s원)\n 4: 9시간(%s원)\n 5: 12시간(%s원)\n 0: 뒤로가기 \n");//이후 104번 출력
		kor_message.put("0109"," 시즌권은 자리를 지금 선택하셔야 합니다.");
		kor_message.put("0110","좌석을 선택해주세요.\n");
		/GBJ/

```

</details>
</div>