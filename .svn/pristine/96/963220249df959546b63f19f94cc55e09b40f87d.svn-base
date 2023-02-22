package com.example.board.service;

import java.util.HashMap;
import java.util.List;

import com.example.board.vo.ReplyVo;

public interface ReplyService {

	//댓글 조회
	public List<ReplyVo> retrieveReplyList(HashMap<String, Object> num);
	
	//무한스크롤 댓글 조회
	//public List<ReplyVo> replyList(Integer num, int perPage, int page, int pageSize);
	
	//댓글 등록
	public void registerReply(ReplyVo replyVo);
	
	//댓글 삭제
	public int removeReply(int replyId);
	
	//댓글 수정
	public int modifyReply(ReplyVo replyVo);
	
	//댓글 수
	public Integer replyCount(HashMap<String, Object> reqMap);
	
	//무한스크롤 댓글 조회
	//public HashMap<String, Object> retrieveReplyList(HashMap<String, Object> num);

	

	

	

	
	
	
}
