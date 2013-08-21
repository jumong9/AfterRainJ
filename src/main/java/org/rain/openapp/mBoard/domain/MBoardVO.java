package org.rain.openapp.mBoard.domain;

import java.util.Date;

public class MBoardVO {

	private String code;
	private int num;
	private String title;
	private String codntents;
	private int readCnt;
	private String genUsrId;
	private Date crtDate;
	private String useFlag;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCodntents() {
		return codntents;
	}
	public void setCodntents(String codntents) {
		this.codntents = codntents;
	}
	public int getReadCnt() {
		return readCnt;
	}
	public void setReadCnt(int readCnt) {
		this.readCnt = readCnt;
	}
	public String getGenUsrId() {
		return genUsrId;
	}
	public void setGenUsrId(String genUsrId) {
		this.genUsrId = genUsrId;
	}
	public Date getCrtDate() {
		return crtDate;
	}
	public void setCrtDate(Date crtDate) {
		this.crtDate = crtDate;
	}
	public String getUseFlag() {
		return useFlag;
	}
	public void setUseFlag(String useFlag) {
		this.useFlag = useFlag;
	}
	
}
