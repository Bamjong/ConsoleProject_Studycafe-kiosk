package com.victoree2.system;

import java.util.Set;

import com.victoree2.common.AccountData;
import com.victoree2.common.returnMessage;

// 클래스 집합

public class ReadingRoomFactory extends returnMessage{
	
	
	public AccountSystem getUser() {//초기화면 계정정보생성
		return new AccountSystem();
	}
	public userSystem getUserSystem(AccountData userStatus) {//사용자페이지
		return new userSystem(userStatus);
	}
	public AdminSystem getAdminSystem(Set<String> userMap) {//관리자페이지
		return new AdminSystem(userMap);
	}

}
