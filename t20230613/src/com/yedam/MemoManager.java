package com.yedam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

public class MemoManager {
	List<Board> storage = new ArrayList<>();
	Scanner scn = new Scanner(System.in);

	// 등록
	public void register() {
		System.out.println("게시글 번호> ");
		int boardNo = Integer.parseInt(scn.nextLine());
		System.out.println("제목> ");
		String title = scn.nextLine();
		System.out.println("내용> ");
		String content = scn.nextLine();
		System.out.println("작성자> ");
		String athor = scn.nextLine();

		storage.add(new Board(boardNo, title, content, athor));
		System.out.println("등록됨");
	}

	// 수정
	public void modify() {
		System.out.println("수정할 게시글 번호>");
		int boardNo = Integer.parseInt(scn.nextLine());
		boolean check = false;
		HashMap<String, Object> board = null;
		for (int i = 0; i < storage.size(); i++) {
			int boardNum = storage.get(i).getBoardNo();
			if (boardNo == boardNum) {
				System.out.print("제목>");
				board.put("TITLE", scn.nextLine());
				System.out.print("내용>");
				board.put("CONTENT", scn.nextLine());
				System.out.println("게시글이 수정되었습니다.");
				check = true;
			}
		}
		if (!check) {
			System.out.println("번호가 없습니다.");
		}
	}

	// 조회
	public void search() {
		System.out.println("조회할 게시글 번호>");
		int boardNo = scn.nextInt();

		boolean check = true;
		HashMap<String, Object> board = null;
		for (int i = 0; i < storage.size(); i++) {
			if (storage.get(i) != null && boardNo == storage.get(i).getBoardNo()) {
				System.out.println(storage.get(i));
				check = false;
			}
		}
		if (!check) {
			System.out.println("번호가 없습니다.");
		}
	}

	// 제거
	public void remove() {
		System.out.println("삭제할 게시글 번호>");
		int boardNo = scn.nextInt();

		Iterator<Board> iter = storage.iterator(); // ?
		while (iter.hasNext()) {
			Board curr = iter.next();
			if (curr.getBoardNo() == boardNo) {
				iter.remove();
				System.out.println("삭제완료");
				return;
			}
		}
		System.out.println("삭제할 이름이없습니다.");
	}

	// 목록
	public void list() {
		while (true) {
			for (int i = 0; i < storage.size(); i++) {
				System.out.print(storage.get(i).getBoardNo());
				System.out.print("\t" + storage.get(i).getTitle());
				System.out.print("\t" + storage.get(i).getContent());
				System.out.print("\t" + storage.get(i).getAthor());
			}
		}
	}

}
