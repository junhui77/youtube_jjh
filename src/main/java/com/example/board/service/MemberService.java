package com.example.board.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.board.vo.FollowVo;
import com.example.board.vo.MemberVo;

public interface MemberService {
	public MemberVo loginCheck(HashMap<String, Object> reqMap);
	public Integer idCheck(String memId);
	public Integer pwdCheck(String memPwd);
	public List<MemberVo> memberList(HashMap<String, Object> reqMap);
	public Integer memberListCount(HashMap<String, Object> reqMap);
	public MemberVo memberDetail(Integer memIdx);
	public void updateMember(MemberVo member, MultipartFile upload);
	public void deleteMember(Integer memIdx);
	public int memberFindFollow(FollowVo followVo);
	public int memberFollow(FollowVo followVo);
	public int memberFollowCount(String toMemId);
	public int memberRemoveFollow(FollowVo followVo);
	public String makeFolder();
	public void registerMember(MemberVo member, MultipartFile upload);
	
	

	
}
