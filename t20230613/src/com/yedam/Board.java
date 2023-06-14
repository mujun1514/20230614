package com.yedam;

import java.io.Serializable;

public class Board implements Serializable {

	private int boardNo;
	private String title;
	private String content;
	private String athor;

	public Board(int boardNo, String title, String content, String athor) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
		this.athor = athor;
	}

	// getter,setter
	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAthor() {
		return athor;
	}

	public void setAthor(String athor) {
		this.athor = athor;
	}

}
