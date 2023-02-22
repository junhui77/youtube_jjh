package com.example.board.service;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.board.dao.MemberDao;
import com.example.board.vo.FollowVo;
import com.example.board.vo.MemberVo;

import net.coobird.thumbnailator.Thumbnailator;

@Service
public class MemberServiceImplement implements MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	@Override
	public MemberVo loginCheck(HashMap<String, Object> reqMap) {
		return memberDao.loginCheck(reqMap);
	}

	@Override
	public Integer idCheck(String memId) {
		
		return memberDao.idCheck(memId);
	}

	@Override
	public Integer pwdCheck(String memPwd) {
		
		return memberDao.pwdCheck(memPwd);
	}
	
	@Override
	public List<MemberVo> memberList(HashMap<String, Object> reqMap){
		return memberDao.memberList(reqMap);
	}
	
	@Override
	public Integer memberListCount(HashMap<String, Object> reqMap) {
		
		return memberDao.memberListCount(reqMap);
	}
	
//	@Override
//	public void registerMember(MemberVo member) {
//		// TODO Auto-generated method stub
//		
//	}

	
	@Override
	public void registerMember(MemberVo member, MultipartFile upload) {
		//1. 파일업로드
		
				//실제 파일명
				String origin = upload.getOriginalFilename();
				System.out.println(origin.toString());
				
				//저장할 파일명 (경로가 \\가 들어오는 경우 잘라서 처리)
				String fileName = origin.substring(origin.lastIndexOf("\\") + 1);
				
				//파일사이즈
				long size = upload.getSize();
				
				//랜덤 이름
				String uuid = UUID.randomUUID().toString();
				
				//날짜 경로
				String path = makeFolder();
				
				//업로드 경로
				String saveName = uploadFilePath + "\\" + path + "\\" + uuid + fileName;
				
				//썸네일 경로
				String thumbnailName = uploadFilePath + "\\" + path + "\\thumb_" + uuid + "_" + fileName;
				
				System.out.println("파일명 : " + fileName);
				System.out.println("파일크기 : " + size);
				System.out.println("저장명 : " + saveName);
				
				try {
					File saveFile = new File(saveName);
					upload.transferTo(saveFile); //파일 업로드
					Thumbnailator.createThumbnail(saveFile, new File(thumbnailName),500,500);
				} catch(Exception e) {
					e.printStackTrace();
					System.out.println("업로드중 에러 발생");
				}
				
				//이미지 등록
				
//				MemberVo build = new MemberVo.Builder()
//									.fileName(fileName)
//									.filePath(path)
//									.fileUuid(uuid)
//									.build();
				member.setFileName(fileName);
				member.setFilePath(path);
				member.setFileUuid(uuid);
				//memberDao.insertImgFile(build);
				

												
						
				
				memberDao.registerMember(member);
				
				//return true;
		
		
		
		
	}
	
	@Override
	public MemberVo memberDetail(Integer memIdx) {
		
		return memberDao.memberDetail(memIdx);
	}
	
	@Override
	public void updateMember(MemberVo member, MultipartFile upload) {
		//1. 파일업로드
		
		//실제 파일명
		String origin = upload.getOriginalFilename();
		System.out.println(origin.toString());
		
		//저장할 파일명 (경로가 \\가 들어오는 경우 잘라서 처리)
		String fileName = origin.substring(origin.lastIndexOf("\\") + 1);
		
		//파일사이즈
		long size = upload.getSize();
		
		//랜덤 이름
		String uuid = UUID.randomUUID().toString();
		
		//날짜 경로
		String path = makeFolder();
		
		//업로드 경로
		String saveName = uploadFilePath + "\\" + path + "\\" + uuid + fileName;
		
		//썸네일 경로
		String thumbnailName = uploadFilePath + "\\" + path + "\\thumb_" + uuid + "_" + fileName;
		
		System.out.println("파일명 : " + fileName);
		System.out.println("파일크기 : " + size);
		System.out.println("저장명 : " + saveName);
		
		try {
			File saveFile = new File(saveName);
			upload.transferTo(saveFile); //파일 업로드
			Thumbnailator.createThumbnail(saveFile, new File(thumbnailName),500,500);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("업로드중 에러 발생");
		}
		
		//이미지 등록
		
//		MemberVo build = new MemberVo.Builder()
//							.fileName(fileName)
//							.filePath(path)
//							.fileUuid(uuid)
//							.build();
		member.setFileName(fileName);
		member.setFilePath(path);
		member.setFileUuid(uuid);
		//memberDao.insertImgFile(build);
		

		
		
		memberDao.updateMember(member);
		
	}
	
	@Override
	public void deleteMember(Integer memIdx) {
		memberDao.deleteMember(memIdx);
		
	}
	
	@Override
	public int memberFindFollow(FollowVo followVo) {
		
		return memberDao.memberFindFollow(followVo);
	}
	
	@Override
	public int memberFollow(FollowVo followVo) {
		
		return memberDao.memberFollow(followVo);
	}
	
	@Override
	public int memberFollowCount(String toMemId) {
		System.out.println("-------------------------HomeController.java || /boardDetail || start~~~~~ 2 :");
		return memberDao.memberFollowCount(toMemId);
	}
	
	@Override
	public int memberRemoveFollow(FollowVo followVo) {
		return memberDao.memberRemoveFollow(followVo);
	}
	
	@Value("C:\\workspace\\youtube_jjh\\src\\main\\webapp\\resources\\upload")
	private String uploadFilePath;
	
	//폴더생성함수
	@Override
	public String makeFolder() {
		String path = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMdd"));
		File file = new File(uploadFilePath + "\\" + path);
		if(file.exists() == false) {
			file.mkdirs();// 파일생성
		}
		
		return path; //경로
	}

	
	
	
//	@Override
//	public boolean registerImg(MemberVo member, MultipartFile upload) {
//		
//		
//		
//	}

}
