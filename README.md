# 22년 9월 21일 오전

## 오전 업데이트

유저 데이터 업데이트  

### <UserSystem.jave>  

20라인

```java
ReadingRoomFactory factory = new ReadingRoomFactory();// 데이터 수정/삭제시 사용
AccountSystem user = factory.getUser();
```

234라인

	user.update(userStatus);


### <AccountSystem.java>  

90라인

```java
public void update(AccountData ac){
	this.account.remove(ac.getId());
	account.put(ac.getId(), ac);
	save();
}
```

	AccountSystem 클래스의 update() 메소드 호출 시 파라미터값을 수정된 계정의 주소 전달함. 

	기존에 해쉬맵에 저장되었던 데이터를 키값을 찾아 삭제후 수정된 데이터를 다시 add 후 save() 메소드를 호출하여 저장.




처음 메인화면 이동

	이슈 : 처음 메인화면으로 이동을 하려면 스택으로 쌓인 메모리를 첫 메인화면 이전까지 반환을 해야한다.

해결 : 
1. 스택에 쌓인 메모리 반환을 위하여 main함수에 static boolean 변수를 만들어 해당의 변수 값이 true일 경우 스택에 쌓인 메소드들을 반환할것이다.
2. static 변수 값이 처음으로 true 값으로 변경시 반환된 top 메모리의 다음 메소드 바로 밑에 조건을 두어 static 변수가 true일 경우 메모리를 반환하도록 조건을 건다.
3.  조건문은 반드시 메소드의 다음 문장에 기입한다(언어의 절차적 특성때문)
4. 첫 메인화면 스택 데이터 바로 이전에는 static 변수를 다시 false로 지정을하여 다른 클래스에 영향이 미치지 않도록 초기화를 진행한다. 


예) 로그인 -> 마이페이지 -> 비밀번호 변경
- SystemEx 클래스의 us.run() 실행 -> UserSystem 클래스 접근 -> run() 실행 -> myPage() 실행 -> pwdReset() 실행

- pwdReset() 메소드에서 패스워드 변경후 static 변수 true 변경 및 return 으로 메모리 반환 -> myPage() 메소드가 반환되어 자바는 다음 라인에 읽고 해당의 라인에 조건을 주어 static 변수가 true일 경우 return 메모리 반환.
- myPage()를 메모리에서 반환후 스택에는 최종적으로  |UserSystem.run()|  두개의 스택이 남아있다 그러면 UserSystem 클래스의 run()메소드를 반환을 하면 최종적으로 첫 메인 페이지 호출을 가능하게 한다. 최종단계전 static 변수를 원래 false 값으로 변경하여 다른 클래스에 영향없앤다. 
                                                                          |SystemEx.run()|







## [오늘 해야할 일]

- 입실/퇴실 구현해야함 일단 boolean 값으로 삼항조건만 줌.

- 결제내역에서 정기권 예약 부분 수정해야되나??

- 메세지만 하나 더 만드는걸로 수정함
- 프린트창은 변동 없음.
- kor_message.put("0103","%s 회원님의 권한이 부여되었습니다! 열람실을 선택해주세요 %s \n"); //앞에 이름 붙혀주기
		kor_message.put("0104","좌석을 선택해주세요  \n"); //앞에 이름 붙혀주기



- 배열초기화부분이 오래 걸릴수도 있어 testList만 구현한 상태로 예약쪽 배열부분 기능 결제 내용을 ReservationData 클래스의 get/set으로 저장만되게 구현.
	- 마이페이지의 패스워드 초기화 참고.

<br>

- 어제 범종이가 만든 메세지 부분은 영문처리해야함.
- 103, 104 부분은 변경되었으므로 수정되어서 바꿈.
 

