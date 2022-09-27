package com.kh.board.vo;

public class BoardVo {
	public BoardVo() {
		
	}
		
	public BoardVo(String title, String contnet) {
		super();
		this.title = title;
		this.contnet = contnet;
	}


	private String title;
	private String contnet;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContnet() {
		return contnet;
	}

	public void setContnet(String contnet) {
		this.contnet = contnet;
	}

	@Override
	public String toString() {
		return "BoardVo [title=" + title + ", contnet=" + contnet + "]";
	}
	
	
}	
