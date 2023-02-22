package com.example.board.service;

import java.util.HashMap;
import java.util.List;

import com.example.board.vo.BoardLikeVo;
import com.example.board.vo.BoardVo;

public interface BoardService {
	
	public List<BoardVo> boardList(HashMap<String, Object> reqMap);
	public BoardVo boardDetail(Integer num);
	public void registerBoard(BoardVo board);
	public void updateBoard(BoardVo board);
	public void deleteBoard(Integer num);
	public Integer plusViewCount(Integer num);
	public Integer boardLike(BoardLikeVo boardLike);
	public Integer boardLikeCount(Integer num);
	public Integer boardFindLike(BoardLikeVo findLike);
	public Integer boardRemoveLike(BoardLikeVo boardLikeVo);
	public Integer boardListCount(HashMap<String, Object> reqMap);

	
	

}
