package com.example.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.model.Board;

@Mapper
public interface BoardMapper {

	List<Board> getList();

	void insert(Board board);

	Board read(Long id);

	void update(Board board);

	void delete(Long id);

}
