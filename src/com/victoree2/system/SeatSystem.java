package com.victoree2.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeatSystem {
	int indexX;
	int indexY;
	
	String test[][] = { {"[1]", "[2]"},{"[3]", "[4]"}}; //기본자리
	String test2[][] = { {"[1]", "[2]"},{"[3]", "[4]", "[5]"}}; //기본자리
	List<String[][]> testList = new ArrayList<String[][]>();
	Scanner scan = new Scanner(System.in);

	
	public SeatSystem() {
		testList.add(test); //기본자리
		testList.add(test2); //기본자리
	}

	public void makeRoom(int x, int y) {
		String temp[][] = new String[y][x];
		int room = 1;
		
		for(int i = 0 ; i < temp.length ; i++) {
			for(int j = 0 ; j < temp[i].length ; j++) {
				temp[i][j] = "[" + room +"]";
				room++;
			}
		}
		testList.add(temp);
	}
	
	public void print(int room) { 
		String tmp[][] = testList.get(room-1);
		
		for(int i = 0 ; i < tmp.length ; i++) {
			for(int j = 0 ; j < tmp[i].length ; j++) {
				System.out.print(tmp[i][j]+"\t"); //자리 이쁘게 표현하기
			}
			System.out.println();
		}
	}
	
//	public void update(int room, String seat) { // 
//		String tempSeat = "[" + seat + "]";
//		String tmp[][] = testList.get(room-1);
//		
//		for(int i=0; i<tmp.length;i++ ) {
//			for(int j=0; j<tmp[i].length;j++) {
//				if(tmp[i][j].equals("[사용중]")) {
//					System.out.println("이미 사용중인 자리입니다.");
//					break;
//				}else if(tmp[i][j].equals(tempSeat)) {
//					tmp[i][j] = "["+"사용중"+"]";
//					this.indexX = i;
//					this.indexY = j;
//				}
//			}
//		}
//	}
	
	public void update(int room) {
		boolean pnp = true; // [사용중] 좌석 선택시 다시 돌도록.
		
		while(pnp == true) {
			String seat = scan.nextLine();
			String tempSeat = "[" + seat + "]";
			String tmp[][] = testList.get(room-1);
			
			for(int i=0; i<tmp.length;i++ ) {
				for(int j=0; j<tmp[i].length;j++) {
					if(tmp[i][j].equals("[사용중]")) {
						pnp = true;
						System.out.println("이미 사용중인 자리입니다. 재입력하세요.");
					}
					if(tmp[i][j].equals(tempSeat)) {
						tmp[i][j] = "["+"사용중"+"]";
						this.indexX = i;
						this.indexY = j;
						pnp = false;
					}
				}
			}
		}
	}

	public int getIndexX() {
		return indexX;
	}

	public int getIndexY() {
		return indexY;
	}
	
	
	
}
