package com.example.board.model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Board {

	private Long id;

	private String title;

	private String content;

	private String writer;

	private Date regDate;

	private Date updateDate;

	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public void update(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

}
