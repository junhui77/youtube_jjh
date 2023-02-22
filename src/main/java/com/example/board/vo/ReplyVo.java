package com.example.board.vo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ReplyVo {
	private int rowNum;
	private Integer replyIdx;
	private String replyContent;
	private String replyRegdate;
	private Integer num;
	private Integer memIdx;
	private String memId;
	
	//프로필 이미지 파일
	private String fileName;
	private String filePath;
	private String fileUuid;

	
	
	

	


	



	public ReplyVo(int rowNum, Integer replyIdx, String replyContent, String replyRegdate, Integer num, Integer memIdx,
			String memId, String fileName, String filePath, String fileUuid) {
		super();
		this.rowNum = rowNum;
		this.replyIdx = replyIdx;
		this.replyContent = replyContent;
		this.replyRegdate = replyRegdate;
		this.num = num;
		this.memIdx = memIdx;
		this.memId = memId;
		this.fileName = fileName;
		this.filePath = filePath;
		this.fileUuid = fileUuid;
	}





	public ReplyVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	public int getRowNum() {
		return rowNum;
	}





	public void setRowNum(int rowNum) {
		this.rowNum = rowNum;
	}





	public String getFileName() {
		return fileName;
	}




	public void setFileName(String fileName) {
		this.fileName = fileName;
	}




	public String getFilePath() {
		return filePath;
	}




	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}




	public String getFileUuid() {
		return fileUuid;
	}




	public void setFileUuid(String fileUuid) {
		this.fileUuid = fileUuid;
	}




	public String getMemId() {
		return memId;
	}


	public void setMemId(String memId) {
		this.memId = memId;
	}


	public Integer getReplyIdx() {
		return replyIdx;
	}
	public void setReplyIdx(Integer replyIdx) {
		this.replyIdx = replyIdx;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public String getReplyRegdate() {
		return replyRegdate;
	}
	public void setReplyRegdate(String replyRegdate) {
		this.replyRegdate = replyRegdate;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getMemIdx() {
		return memIdx;
	}
	public void setMemIdx(Integer memIdx) {
		this.memIdx = memIdx;
	}
	

	
}
