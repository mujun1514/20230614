package com.yedam;

import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int choice;

		while (true) {
			try {
				System.out.println("1추가 2.수정 3.조회 4삭제 5목록");
				System.out.println("선택>");
				choice = Integer.parseInt(scn.nextLine());
				MemoManager app = new MemoManager();
				switch (choice) {
				case BOARDMENU.INSERT:
					app.register();
					break;
				case BOARDMENU.MODIFY:
					app.modify();
					break;
				case BOARDMENU.SEARCH:
					app.search();
					break;
				case BOARDMENU.DELETE:
					app.remove();
					break;
				case BOARDMENU.LIST:
					app.list();
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
	}
}