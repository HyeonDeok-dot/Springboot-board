package board.board.service;

import java.util.List;

import board.board.dto.BoardDto;

public interface BoardService {
	
	List<BoardDto> selectBoardList() throws Exception; //게시글 목록
	
	void insertBoard(BoardDto board) throws Exception; //게시글 작성
	
	BoardDto selectBoardDetail(int boardIdx) throws Exception;
	
}