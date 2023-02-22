package com.example.board.service;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.board.HomeController;
import com.example.board.dao.ReplyDao;
import com.example.board.vo.ReplyVo;

@Service
public class ReplyServiceImplement implements ReplyService {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private ReplyDao replyDao;

	//댓글 조회
	//@Override
//	public List<ReplyVo> retrieveReplyList(Map<String, Object> reqMap) {
//		
//		return replyDao.replyList(reqMap);
//	}
	
	
	//댓글 등록
	@Transactional
	@Override
	public void registerReply(ReplyVo replyVo) {
		
		replyDao.registerReply(replyVo);
		
	}

	
	//댓글 삭제
	@Transactional
	@Override
	public int removeReply(int replyIdx) {
		
		return replyDao.removeReply(replyIdx);
		
	}
	
	//댓글 수정
	@Transactional
	@Override
	public int modifyReply(ReplyVo replyIdx) {
		
		return replyDao.updateReply(replyIdx);
		
	}
	
	
	
	//댓글 수
	@Transactional
	@Override
	public Integer replyCount(HashMap<String, Object> reqMap) {
		
		return replyDao.replyCount(reqMap);
	}

	//댓글 조회
//	public HashMap<String, Object> retrieveReplyList(HashMap<String, Object> num, int perPage, int page, int pageSize) {
//		logger.info("================댓글 리스트,갯수 Service================");
//		
//		int totalCnt = replyDao.replyCount(num);
//		
//		int totalPages = (totalCnt-1) / perPage + 1;
//
//
//		if(page > totalPages) {
//			page = totalPages;
//		}
//		int start = perPage * (page - 1) + 1;
//		int end = start + perPage - 1;
//		if(totalCnt < end) {
//			end = totalCnt;
//		}
//		int startPage = pageSize * ((page-1) / pageSize) + 1;
//
//		int endPage = startPage + pageSize - 1;
//		if(totalPages < endPage) {
//			endPage = totalPages;
//		}
//		boolean prev = startPage != 1;
//		boolean next = endPage < totalPages;
//		
//		if(totalCnt == 0) {
//			totalPages = 1;
//			page = 1;
//			start = 1;
//			end = 1;
//		}
//
//		HashMap<String, Object> pagination = new HashMap<String, Object>();
//		pagination.put("page", page);
//		pagination.put("perPage", perPage);
//		pagination.put("pageSize", pageSize);
//		pagination.put("totalCnt", totalCnt);
//		pagination.put("totalPages", totalPages);
//		pagination.put("startPage", startPage);
//		pagination.put("endPage", endPage);
//		pagination.put("prev", prev);
//		pagination.put("next", next);
//		
//		HashMap<String, Object> scrollParams = new HashMap<String, Object>();
//		scrollParams.put("start", start);
//		scrollParams.put("end", end);
//		scrollParams.put("num", num);
//		
//		HashMap<String, Object> resultMap = new HashMap<String, Object>();
//		resultMap.put("list", replyDao.replyList(scrollParams));
//		resultMap.put("pagination", pagination);
//
//		return resultMap;
//	}


	@Override
	public List<ReplyVo> retrieveReplyList(HashMap<String, Object> num) {
		
		return replyDao.replyList(num);
	}

	

	
}
